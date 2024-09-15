import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HeartBeatReceiver implements Runnable{

    private ServerSocket serverSocket;

    private Socket clientSocket;

    private StringReader stringReader;

    private BufferedReader bufferedReader;

    public HeartBeatReceiver() throws IOException {
        this.serverSocket = new ServerSocket(42975);
        clientSocket = serverSocket.accept();
        bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    @Override
    public void run() {
        while(true){
            try {
                String beat = bufferedReader.readLine();
                if(beat == null){
                    System.out.println("Failure Detected. Sending to Fault Monitor");
                    break;
                }
                System.out.println(beat);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
