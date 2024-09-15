public class PatientStatistics {
    private int pulse;

    private int bloodPressureSystolic;

    private int bloodPressureDiastolic;

    private int bloodGlucoseLevel;

    public PatientStatistics(int pulse, int bloodPressureSystolic, int bloodPressureDiastolic, int bloodGlucoseLevel) {
        this.pulse = pulse;
        this.bloodPressureSystolic = bloodPressureSystolic;
        this.bloodPressureDiastolic = bloodPressureDiastolic;
        this.bloodGlucoseLevel = bloodGlucoseLevel;
    }

    @Override
    public String toString() {
        return "PatientStatistics{" +
                "pulse=" + pulse +
                ", bloodPressureSystolic=" + bloodPressureSystolic +
                ", bloodPressureDiastolic=" + bloodPressureDiastolic +
                ", bloodGlucoseLevel=" + bloodGlucoseLevel +
                '}';
    }
}
