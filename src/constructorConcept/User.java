package constructorConcept;

public class User {
	//public, default, private, protected
		String name;
		String email;	
		int userId;
		String dob;
		String city;
		
		//create the user on the basis of following option:
		//1.name
		//2.name, email
		//3.name, userId
		//4.name,email,dob
		//5.name,email,userId,dob,,city
		//6.name,city <-- not applicable
		
		//constructor generation==> right click source-constructor generation by using field select combination
		
		public User(String name) {
			System.out.println("ConsCall=String");
			this.name=name;
		}
		public User(String name, String email) {
			System.out.println("ConsCall=String-String");
			this.name=name;
			this.email=email;
		}
		public User(String name, int UserId) {
			System.out.println("ConsCall=String-Int");
			this.name=name;
			this.userId=UserId;
		}
		public User(String name, String email,String dob) {
			System.out.println("ConsCall=String-String-String");
			this.name=name;
			this.email=email;
			this.dob=dob;
			
		}
		public User(String name, String email,int userId, String dob) {
			System.out.println("ConsCall=String-String-int-String");
			this.name=name;
			this.email=email;
			this.userId=userId;
			this.dob=dob;
		}
		public User(String name, String email, int userId, String dob, String city) {
			System.out.println("ConsCall=String-String-int-String-String");
			this.name = name;
			this.email = email;
			this.userId = userId;
			this.dob = dob;
			this.city = city;
		}
		

//		public User(String name, String city) {
//			this.name=name;
//			this.city=city;
//		}
		
		public String[] getUserOrderDetails(String name) {
			
			if(name.equals("Niranjan")) {
				String orderDtails[]= {"Laptop","Mouse","USB cable"};
				return orderDtails;
			}
			else if(name.equals("Ansh")){
				String orderDtails[]= {"Laptop","Mouse"};
				return orderDtails;
			}else {
				return null;
			}
			
		}
	


}
