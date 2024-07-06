package constructorConcept;

public class Employee {
	
	//instance variable, class variable
			String name;
			int id;
			double salary;
			
			//1.const name is same as the class name
			//2. does not have any return type
			//3.const.. can not return any thing
			//4. const is not made for the business logic
			//5. const is helping to initialize class variable
			//6. const is restriction to unnecessary object creation
			//7. constructor will be call after creating the object
			
//			public  Employee() {	//default or zero parameter cons..
//				System.out.println("default constructor");
//			}
//			public  Employee(int a) {	//default or zero parameter cons..
//				System.out.println("1 para int constructor"+a);
//			}
			public Employee (String name) {
				System.out.println("name" +name);
				this.name=name;
			}
			
			public Employee(String name, int id) {
				System.out.println("cons-String int");
				this.name=name;
				this.id=id;
			}
			public Employee(String name, int id,double salary) {
				System.out.println("cons-String int String");
				this.name=name;
				this.id=id;
				this.salary=salary;
			}
			
			public void test() {
				System.out.println("test method");
			}
			
			
			public static void main(String[] args) {
				
				Employee e1 = new Employee("Tom");
				System.out.println(e1.name);
				Employee e2 = new Employee("Tom",10);
				
				System.out.println(e2.name+" "+e2.id );
				Employee e3 = new Employee("Tom",10,23.23);
				e3.salary = 55.55;
				System.out.println(e3.name+" "+e3.id+"  "+e3.salary);
				
				//Employee e2 = new Employee(); //constructor restriction unnecessary object creation
//		Employee e1 = new Employee();
//		Employee e2 = new Employee(10);
//		e1.test();
//		e1.name="niranjan";
//		new Employee();
		
//		Employee e1 =new Employee();
//		e1.name="Niranjan";
//		e1.id=1;
//		e1.salary=12.33;
//		
//		Employee e2 =new Employee();
//		e2.name="Tom";
//		e2.id=2;
//		e2.salary=22.33;
//		
//		Employee e3 =new Employee();
//		Employee e4 =new Employee();
//		Employee e5 =new Employee();
//		Employee e6 =new Employee();
		
	}

}
