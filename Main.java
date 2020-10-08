import java.util.Scanner;

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

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

    Scanner scan = new Scanner(System.in); 
    System.out.println("Enter an address");
    String addy = scan.nextLine(); 

    String formattedAddy = URLEncoder.encode(addy, "UTF-8");

    String API_URL = "https://nominatim.openstreetmap.org/search.php?q=" + formattedAddy +"&polygon_geojson=1&format=jsonv2"; //"https://nominatim.openstreetmap.org/ui/search.html?q=6400+Dodge+St.+Omaha&format=json";

    System.out.println(API_URL);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .GET() // GET is default
                .header("accept","application/json")
                .build();

        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        
        //parse JSON
        String temp_json = response.body(); 

        String json = temp_json.substring(1, temp_json.length() - 1); 

        //System.out.println(json); 
        JSONObject obj = new JSONObject(json);
        double lat = Double.parseDouble(obj.getString("lat"));
        double lon = Double.parseDouble(obj.getString("lon"));
        String name = obj.getString("display_name");

        System.out.println(name + " has coordinates of: " + lat + " " + lon);

    }
}