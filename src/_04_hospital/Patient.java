package _04_hospital;

public class Patient {

	boolean caredFor;

	public boolean feelsCaredFor() {
		if (caredFor) {
			return true;
		}
		return false;
	}

	public void checkPulse() {
		caredFor = true;
	}

}
