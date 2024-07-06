package OOP_Encapsulation;


//POGO - Plain Old java Object
public class Employee {
	//global variable or class variable
	private String name;
	private int id;
	private String city;
	private boolean isPerm;

	
	//public const
	public Employee(String name, int id, String city, boolean isPerm) {
		this.name = name;
		this.id = id;
		this.city = city;
		this.isPerm = isPerm;
	}
	//public getter/setter
	public String setName(String name) {
		this.name=name;
		return name;
	}
	public String getName() {
		return this.name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean getIsPerm() {
		return isPerm;
	}
	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}
	
	
}
