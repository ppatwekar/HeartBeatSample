import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HeartBeatSender implements Runnable{


    private Socket socket;


    private OutputStream outputStream;

    private PrintWriter printWriter;

    public HeartBeatSender() throws IOException {
        initializeSockets();
    }

    public void initializeSockets() throws IOException {
        socket = new Socket("localhost",42975);
        System.out.println("Contact with client!");
        printWriter = new PrintWriter(socket.getOutputStream());
    }

    @Override
    public void run() {

        while(true) {
            String beat = "beat";
            try {
                printWriter.println(beat);
                printWriter.flush();

                System.out.println("sent");

                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
