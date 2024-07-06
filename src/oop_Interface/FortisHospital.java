package oop_Interface;

public class FortisHospital extends Medical implements USMedical,UKMedical,IndianMedical {
	
	 int min_fee = 50;
	
	
	//USMedicals
	@Override
	public void physioServices() {
		System.out.println("FH-Physio Services");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH-Oncology Services");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH-Pedia Services");
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH-Emergency Services");
		
	}
	
	//UKMedical
	@Override
	public void dentalServices() {
		System.out.println("FH-Dental Services");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH-Ortho Services");
		
	}
	
	//IndiaMedical
	@Override
	public void gynoServices() {
		System.out.println("FH-Gyno Services");
		
	}

	@Override
	public void ENTServices() {
		System.out.println("FH-ENT Services");
		
	}
	
	//individual method
	public void medicalInsurance() {
		System.out.println("FH-Medical Insurance");
	}
	public void medicalTraining() {
		System.out.println("FH-Medical Training");
	}
	//WHO
	@Override
	public void covidVaccination() {
		System.out.println("FH-Covid Vaccination");
		
	}

	

	

	
	
}