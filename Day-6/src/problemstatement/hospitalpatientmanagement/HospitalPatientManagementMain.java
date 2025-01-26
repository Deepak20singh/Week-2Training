package problemstatement.hospitalpatientmanagement;
import java.util.ArrayList;

public class HospitalPatientManagementMain {
    public static void processPatients(ArrayList<Patient> patients) {
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Medical Records :- " + ((MedicalRecord) patient).viewRecords());
            System.out.println("Bill Amount :- " + patient.calculateBill());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Patient inPatient = new InPatient(101, "Dev", 30, 5, 2000);
        ((MedicalRecord) inPatient).addRecord("Admitted for heart surgery");

        Patient outPatient = new OutPatient(102, "Aditya", 25, 500);
        ((MedicalRecord) outPatient).addRecord("Consultation for fever");

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(inPatient);
        patients.add(outPatient);
        processPatients(patients);
    }

}
