package _04_hospital;

import java.util.ArrayList;

public class Hospital {

	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);

	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors() {

		int num = 0;

		for (int i = 0; i < patients.size(); i++) {
			try {
				doctors.get(num).assignPatient(patients.get(i));
			} catch (DoctorFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (num != doctors.size() - 1) {
				num++;
			} else {
				num = 0;
			}
		}
	}
}
