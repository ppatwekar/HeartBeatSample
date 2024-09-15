import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PatientStatisticsGenerator patientStatisticsGenerator = new PatientStatisticsGenerator();

        Thread heartBeatThread = new Thread(new HeartBeatSender());
        heartBeatThread.start();

        try {
            while (true) {
                PatientStatistics patientStatistics = patientStatisticsGenerator.generateStatistics();
                System.out.println(patientStatistics.toString());
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(-1);
        }
    }
}