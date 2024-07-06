package OOP_Inheritance;

public class TestCar {
	//" is a" relation ship is important in inheritance (child-parents) 
	public static void main(String[] args) {
	BMW br = new BMW();
	br.start();	//overridden
	br.stop();	//inherited
	br.refule();	//inherited
	br.autoParking();	//individual
	br.engine();	//overridden
	br.billing();
//	int speed = br.maxSpeed;
//	System.out.println(speed);
	System.out.println(br.maxSpeed);
	System.out.println("-----------------");
	
	Car cr = new Car();
	cr.start();
	cr.stop();
	cr.refule();
	cr.engine();
	System.out.println(cr.maxSpeed);
	
	System.out.println("-----------------");
	
	Vehical Vh = new Vehical();
	Vh.engine();
	System.out.println("-----------------");
	
	br.basicScience();
	br.basicMechanical();
	System.out.println("-----------------");
	// top casting/up casting
	//child class object can be referred by parent class ref variable
	Car c1 = new BMW();	//up casting-->eg. WebDriver driver = new ChromeDriver();
	c1.start();//BMW start
	c1.stop();//car stop
	c1.refule();// car refule
	c1.engine();	//vehical engine
	
	Vehical v1 = new BMW();
	v1.engine();
	System.out.println("-----------------");
	//c1.autoparking(); //this is child class methode cant call by parent class ref variable
	//down casting - parent class object can be referred by child class ref variable????
	//-> no  BMW b1=(BMW)new car();//class cast exception
	System.out.println("-----------------");
	
	
	
	
	}

}
