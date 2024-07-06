package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
//		Employee e = new Employee();
//		e.setCity("pune");
//		e.setId(2);
//		e.setName("Niranjan");
//		e.setPerm(false);
//		
//		System.out.println(e.getCity());
//		System.out.println(e.getId());
//		System.out.println(e.getName());
//		System.out.println(e.getIsPerm());
		
		//user registration: setter and const... CREATE:POST API
		Employee e = new Employee("Niranjan",2,"Pune",true);
		System.out.println(e.getCity());
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getIsPerm());
		System.out.println("------------");
		
		//use wants to update city & name: setter :PUT/Patch API
		e.setCity("Baramati");
		e.setName("Ansh");
		
		//display info on user profile: Retrieve : GET API
		System.out.println(e.getCity());
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getIsPerm());
		//CRUD: 
		
	
	
	}
}
