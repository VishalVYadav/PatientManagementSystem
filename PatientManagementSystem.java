import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientManagementSystem {
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public static void main(String[] args) {
        PatientManagementSystem system = new PatientManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Patient Management System Menu:");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. Exit");
            System.out.print("Enter user choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient Name: ");
                    String patientName = scanner.nextLine();
                    Patient patient = new Patient(system.patients.size() + 1, patientName);
                    system.addPatient(patient);
                    System.out.println("Patient added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Doctor Name: ");
                    String doctorName = scanner.nextLine();
                    System.out.print("Enter Doctor Specialization: ");
                    String specialization = scanner.nextLine();
                    Doctor doctor = new Doctor(system.doctors.size() + 1, doctorName, specialization);
                    system.addDoctor(doctor);
                    System.out.println("Doctor added successfully.");
                    break;

                case 3:
                    // Implement appointment scheduling
                    break;

                case 4:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
