package oop_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		//USMedical obj = new USMedical();	//can not create object of interface
		
		FortisHospital fh =new FortisHospital();
		fh.physioServices();
		fh.oncologyServices();
		fh.pediaServices();
		fh.emergencyServices();
		System.out.println("------------");
		fh.medicalInsurance();
		fh.medicalTraining();
		System.out.println("------------");
		fh.orthoServices();
		fh.dentalServices();
		System.out.println("------------");
		fh.gynoServices();
		fh.ENTServices();
		System.out.println("------------");
		fh.covidVaccination();
		System.out.println("------------");
		fh.medicalNewsPublish();
		System.out.println("------------");
		USMedical.billing();
		System.out.println("------------");
		fh.RnD();
		System.out.println("------------");
		//System.out.println(FortisHospital.min_fee);
		System.out.println(fh.min_fee);
		System.out.println(USMedical.min_fee);
		
		//top casting = child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital();
		us.pediaServices();us.oncologyServices();us.pediaServices(); us.emergencyServices();us.RnD();
		us.covidVaccination();
		
		UKMedical uk = new FortisHospital();
		uk.dentalServices();uk.emergencyServices();uk.orthoServices();uk.covidVaccination();
		
		//down casting
	//	FortisHospital fh1 =new USMedical();
		
		
		
		
	}

}
