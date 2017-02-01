package edu.aku.hassannaqvi.mnch_src;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;


/**
 * Created by isd on 28/10/2016.
 */

public class SRCApp extends Application {
    public static final String _IP = "43.245.131.159"; // Test PHP server
    public static final Integer _PORT = 8080; // Port - with colon (:)
    public static final String _HOST_URL = "http://" + _IP + ":" + _PORT + "/";
    private static final long MINIMUM_DISTANCE_CHANGE_FOR_UPDATES = 1; // in Meters
    private static final long MINIMUM_TIME_BETWEEN_UPDATES = 1000; // in Milliseconds
    private static final int TWENTY_MINUTES = 1000 * 60 * 20;
    private static final int TWO_MINUTES = 1000 * 60 * 2;
    private static final long MILLIS_IN_SECOND = 1000;
    private static final long SECONDS_IN_MINUTE = 60;
    private static final long MINUTES_IN_HOUR = 60;
    private static final long HOURS_IN_DAY = 24;
    public static final long MILLISECONDS_IN_DAY = MILLIS_IN_SECOND * SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY;
    private static final long DAYS_IN_YEAR = 365;
    /*
        public static final String _IP = "43.245.131.159"; // Test server
    */
    public static final long MILLISECONDS_IN_YEAR = MILLIS_IN_SECOND * SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_YEAR;
    //public static final String _IP = "192.168.1.10"; // Test NODE server
    public static String _DefaultIP = "http://10.198.97.73"; // Test PHP server
    public static String DEVID;
    public static String GPS_LAT;
    public static String GPS_LNG;
    public static String GPS_DT;
    public static String GPS_ACC;
    public static FormContract fc;
    public static Sec3Contract sc3;
    public static Sec4aContract sc4a;
    public static Sec4bContract sc4b;
    public static Sec7ImContract sec7im;
    public static String deviceId;
    public static String uid;

    public static String mna2;
    public static int mna3 = -1;
    public static String mnb1 = "TEST";
    public static int chCount = 0;
    public static int chTotal = 0;
    //    MWomen means married women
    public static int MWomen = 0;
    public static Boolean MWomenFlag = true;
    public static Boolean MaternalDeath = true;
    public static int NoMaternalDeath = 0;
    public static Boolean ChildMortality = true;
    public static int NoChildMortality = 0;
    //    UMWomen means un-married women
    public static int UMWomen = 0;
    public static int tcount = 1;
    public static int counter = 1;




    public static int countM = 0;
    public static String hh01txt; //District
    public static String hh02txt; //Village
    public static int mwras;
    protected static LocationManager locationManager;


/*df*/

    @Override
    public void onCreate() {
        super.onCreate();
//        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/JameelNooriNastaleeq.ttf"); // font from assets: "assets/fonts/Roboto-Regular.ttf

        deviceId = Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID);

        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        locationManager.requestLocationUpdates(
                LocationManager.GPS_PROVIDER,
                MINIMUM_TIME_BETWEEN_UPDATES,
                MINIMUM_DISTANCE_CHANGE_FOR_UPDATES,
                new MyLocationListener()
        );
    }

    protected void showCurrentLocation() {

        Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);

        if (location != null) {
            String message = String.format(
                    "Current Location \n Longitude: %1$s \n Latitude: %2$s",
                    location.getLongitude(), location.getLatitude()
            );
            //Toast.makeText(getApplicationContext(), message,
            //Toast.LENGTH_SHORT).show();
        }

    }

    protected boolean isBetterLocation(Location location, Location currentBestLocation) {
        if (currentBestLocation == null) {
            // A new location is always better than no location
            return true;
        }

        // Check whether the new location fix is newer or older
        long timeDelta = location.getTime() - currentBestLocation.getTime();
        boolean isSignificantlyNewer = timeDelta > TWO_MINUTES;
        boolean isSignificantlyOlder = timeDelta < -TWO_MINUTES;
        boolean isNewer = timeDelta > 0;

        // If it's been more than two minutes since the current location, use the new location
        // because the user has likely moved
        if (isSignificantlyNewer) {
            return true;
            // If the new location is more than two minutes older, it must be worse
        } else if (isSignificantlyOlder) {
            return false;
        }

        // Check whether the new location fix is more or less accurate
        int accuracyDelta = (int) (location.getAccuracy() - currentBestLocation.getAccuracy());
        boolean isLessAccurate = accuracyDelta > 0;
        boolean isMoreAccurate = accuracyDelta < 0;
        boolean isSignificantlyLessAccurate = accuracyDelta > 200;

        // Check if the old and new location are from the same provider
        boolean isFromSameProvider = isSameProvider(location.getProvider(),
                currentBestLocation.getProvider());

        // Determine location quality using a combination of timeliness and accuracy
        if (isMoreAccurate) {
            return true;
        } else if (isNewer && !isLessAccurate) {
            return true;
        } else if (isNewer && !isSignificantlyLessAccurate && isFromSameProvider) {
            return true;
        }
        return false;
    }


    public void showGPSCoordinates(View v) {
        showCurrentLocation();
    }


    /**
     * Checks whether two providers are the same
     */
    private boolean isSameProvider(String provider1, String provider2) {
        if (provider1 == null) {
            return provider2 == null;
        }
        return provider1.equals(provider2);
    }

    private class MyLocationListener implements LocationListener {

        public void onLocationChanged(Location location) {


            SharedPreferences sharedPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();

            Location savedlocation = new Location("sharedPref");

            savedlocation.setLongitude(Double.parseDouble(sharedPref.getString("Longitude", "00")));
            savedlocation.setLatitude(Double.parseDouble(sharedPref.getString("Latitude", "00")));
            savedlocation.setAccuracy(Float.parseFloat(sharedPref.getString("Accuracy", "00")));
            savedlocation.setTime(Long.parseLong(sharedPref.getString("Time", "00")));


            if (isBetterLocation(location, savedlocation)) {
                editor.putString("Longitude", String.valueOf(location.getLongitude()));
                editor.putString("Latitude", String.valueOf(location.getLatitude()));
                editor.putString("Accuracy", String.valueOf(location.getAccuracy()));
                editor.putString("Time", String.valueOf(location.getTime()));

                editor.apply();
            }
        }

        public void onStatusChanged(String s, int i, Bundle b) {
            showCurrentLocation();
        }

        public void onProviderDisabled(String s) {

        }

        public void onProviderEnabled(String s) {

        }
    }
}