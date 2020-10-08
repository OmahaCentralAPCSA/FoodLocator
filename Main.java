import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in); 
    System.out.println("Enter an address");
    String addy = scan.nextLine(); 

    Geocode test = new Geocode(addy); 

    System.out.println(test.getAddress());
    System.out.println(test.getLatitude());
    System.out.println(test.getLongitude()); 

    }
}