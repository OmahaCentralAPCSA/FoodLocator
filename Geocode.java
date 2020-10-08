/**
*GeoCode provides an interface to the OpenStreetMaps and Nominatim API 
*and can be used to resolve a street address or place name 
*to a coordinate location on the Earth's surface.
* @author: Collin Holmquist (via Dr. Brian Dorn)
* @version: 1.0
*/

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List; 

import java.net.URL; 
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

public class GeoCode{

    private double latitude;
    private double longitude;
    private String formattedAddy; 

    public GeoCode(String address) {

        

    }

    public String getAddress() {
        /**
        getAddress retrieves a normalized address corresponding to the location given via the constructor. 
        @return the resolved and normalized address.  
        */

    }

    public double getDistanceFrom(double otherLat, double otherLong){
        /**
        Computes the distance between this object's location and a specified latitude and longitude. 
        @param latitude and longitude of the other location
        @return the distance between the position in miles. 
        */

    }

    public double getLatitude() {
        /**
        Obtains the latitude that OpenStreetMaps finds for the address given to the Geocode constructor. 
        @return the latitude
        */

    }

    public double getLongitude() {
        /**
        Obtains the longitude that OpenStreetMaps finds for the address given to the Geocode constructor. 
        @return the longitude
        */

    }

    public boolean isValid() {
        /**
        Provides an indication of whether this instance contains valid data or not.  That is, it indicates whether the data was successfuly retrieved for the given location.
        @return true if valid data is available, false otherwise
        */

    }

}
