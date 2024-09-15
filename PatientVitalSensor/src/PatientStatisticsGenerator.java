import java.util.Random;

public class PatientStatisticsGenerator {

    private static int MAX_PULSE = 200;

    private static int MIN_PULSE = 30;

    private static int MAX_SUGAR = 0;

    public PatientStatistics generateStatistics() throws Exception{
        if(Math.random() > 0.85){
            throw new Exception("ERROR: Possible Equipment Failure");
        }

        int pulse = 0;
        int bloodPressureSystolic = 0;
        int bloodPressureDiastolic = 0;
        int bloodGlucoseLevel = 0;


        return new PatientStatistics(pulse,bloodPressureSystolic,bloodPressureDiastolic,bloodGlucoseLevel);
    }
}
