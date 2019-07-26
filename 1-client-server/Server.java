import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket socket = new ServerSocket(6666);

        while (true) {
            Socket s = socket.accept();

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

            writer.write("Hello from server!");

            socket.close();
        }
    }
}