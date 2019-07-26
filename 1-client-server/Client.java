import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        try {
            String serverMsg;
            Socket socketClient = new Socket("localhost", 6666);

            BufferedReader reader = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));

            while ((serverMsg = reader.readLine()) != null) {
                System.out.println("Client: " + serverMsg);
            }

            socketClient.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}