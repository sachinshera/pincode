import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
public class pincode {
    public static void main(String[] args) throws Exception {
        System.out.println("This samll program used to get information about area pincode \n");
        System.out.println("programmed by : sachin kumar \n");
        System.out.println("Roll : 11203631 \n"); 
        System.out.println("College : MM Enginnering College \n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your area pincode - ");
        int pin_code = scanner.nextInt();
        System.out.println("Please wait .... We are geeting information \n");
        String url = "https://api.postalpincode.in/pincode/"+pin_code;
        URL connect  = new URL(url);
        URLConnection yc = connect.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String output = in.readLine();
        System.out.print(output);
        in.close();
    }
}
