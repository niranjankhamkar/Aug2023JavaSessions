package objectEx;

public class Bank {
	String headOffice;
	String type;
	int yearOfStart;

	public static void main(String[] args) {
		
		Bank SBI = new Bank();
		SBI.headOffice = "SBI-Delhi";
		SBI.type = "Government";
		SBI.yearOfStart = 1950;
		System.out.println("-----------------");
		
		Bank ICICI = new Bank();
		ICICI.headOffice = "ICICI-Mumbai";
		ICICI.type = "Private";
		ICICI.yearOfStart = 1960;
		System.out.println("-----------------");
		
		Bank HDFC = new Bank();
		HDFC.headOffice = "HDFC-Benglore";
		HDFC.type = "Public";
		HDFC.yearOfStart = 1970;
		System.out.println("-----------------");
		
		Bank Axis = new Bank();
		Axis.headOffice = "Axis-Pune";
		Axis.type = "SemiGovernment";
		Axis.yearOfStart = 1980;
		System.out.println("**Original**");
		System.out.println(SBI.headOffice+" "+SBI.type+" "+SBI.yearOfStart);
		System.out.println(ICICI.headOffice+" "+ICICI.type+" "+ICICI.yearOfStart);
		System.out.println(HDFC.headOffice+" "+HDFC.type+" "+HDFC.yearOfStart);
		System.out.println(Axis.headOffice+" "+Axis.type+" "+Axis.yearOfStart);
		System.out.println("-----------------");
		
		SBI=ICICI;
		System.out.println("**SBI=ICICI**");
		System.out.println(SBI.headOffice+" "+SBI.type+" "+SBI.yearOfStart);
		System.out.println(ICICI.headOffice+" "+ICICI.type+" "+ICICI.yearOfStart);
		System.out.println(HDFC.headOffice+" "+HDFC.type+" "+HDFC.yearOfStart);
		System.out.println(Axis.headOffice+" "+Axis.type+" "+Axis.yearOfStart);
		System.out.println("-----------------");
		
		ICICI=HDFC;
		System.out.println("**ICICI=HDFC**");
		System.out.println(SBI.headOffice+" "+SBI.type+" "+SBI.yearOfStart);
		System.out.println(ICICI.headOffice+" "+ICICI.type+" "+ICICI.yearOfStart);
		System.out.println(HDFC.headOffice+" "+HDFC.type+" "+HDFC.yearOfStart);
		System.out.println(Axis.headOffice+" "+Axis.type+" "+Axis.yearOfStart);
		System.out.println("-----------------");
		
		HDFC=Axis;
		System.out.println("**HDFC=Axis**");
		System.out.println(SBI.headOffice+" "+SBI.type+" "+SBI.yearOfStart);
		System.out.println(ICICI.headOffice+" "+ICICI.type+" "+ICICI.yearOfStart);
		System.out.println(HDFC.headOffice+" "+HDFC.type+" "+HDFC.yearOfStart);
		System.out.println(Axis.headOffice+" "+Axis.type+" "+Axis.yearOfStart);
		System.out.println("-----------------");
		
		Axis=SBI;
		System.out.println("**Axis=SBI**");
		System.out.println(SBI.headOffice+" "+SBI.type+" "+SBI.yearOfStart);
		System.out.println(ICICI.headOffice+" "+ICICI.type+" "+ICICI.yearOfStart);
		System.out.println(HDFC.headOffice+" "+HDFC.type+" "+HDFC.yearOfStart);
		System.out.println(Axis.headOffice+" "+Axis.type+" "+Axis.yearOfStart);
		System.out.println("-----------------");

	}

}
