package lesson7.task1;

public class Therapist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Therapist treat");
    }

    public void setDoctorToPatient(Patient patient) {
        switch (patient.getTreatmentPlan()) {
            case 1:
                patient.setDoctor(new Surgeon());
                break;
            case 2:
                patient.setDoctor(new Dentist());
                break;
            default:
                patient.setDoctor(new Therapist());
                break;
        }
        patient.getDoctor().treat();
    }
}
