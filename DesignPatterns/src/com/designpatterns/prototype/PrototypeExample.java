package com.designpatterns.prototype;

public class PrototypeExample {

	public static void main(String[] args) {
		Manager manager1 = new Manager("John", "Smith", 12000, (byte)36); 
		Engineer engineer1 =  new Engineer("Andrey", "Kapathy", 3250, (byte)28); 
		HumanResource hr1 =  new HumanResource("Angelina", "Brown", 2850, (byte)23); 

		//Deep Copy Örnekleri
		EmployeeFactory employeeFactory = new EmployeeFactory();
		Manager manager2 = (Manager) employeeFactory.deepCopy(manager1);
		
		
		 System.out.println("Hash Codes of Object are different\n");
		 System.out.println("Original Manager HashCode: " + manager1.hashCode());
		 System.out.println("DeepCopy  HashCode: " + manager2.hashCode());
		 System.out.println("\n");
		 
		 Engineer engineer2 = (Engineer) employeeFactory.deepCopy(engineer1);
		 engineer2.setName("Jakob");
		 engineer2.setSalary(5200);
		 
		 System.out.println("Original Engineer Stats: " + engineer1.toString());
		 System.out.println("DeepCopy  Stats: " + engineer2.toString()+"\n");
		 
		 HumanResource hr2 = (HumanResource) employeeFactory.deepCopy(hr1);
		 hr2.setName("Charice");
		 hr2.setSurname("Glee");
		 hr2.setAge((byte) 24);
		 hr2.setSalary(2975);
		 hr2.setTitle(Title.SALES);
		 
		 
		 System.out.println("Original HR Stats: " + hr1.toString());
		 System.out.println("DeepCopy Stats: " + hr2.toString());
		 
		 
		 //Shallow Copy Örnekleri
		 Manager manager3 = new Manager("Shallow", "Copy", 4550, (byte)28); 
		 Manager manager4 = (Manager) employeeFactory.shallowCopy(manager3);
		 
		 System.out.println("Hash Codes of Object are same, they are same objects\n");
		 System.out.println("Original Manager HashCode: " + manager3.hashCode());
		 System.out.println("DeepCopy  HashCode: " + manager4.hashCode());
		 System.out.println("\n");
		 

		 
		 System.out.println("Original Manager Stats Before Change Copy:" + manager3.toString());
		 
		 manager3.setName("Shallow Copy");
		 manager3.setSurname("Shares the same memory area");
		 manager3.setAge((byte) 77);
		 manager3.setSalary(8888);
		 manager3.setTitle(Title.SALES);
		 
		 
		 System.out.println("Original Manager Stats After Change Copy: " + manager3.toString());
		 System.out.println("Shallow Copy Stats: " + manager4.toString());
		 
		 
		 
		 
		 
		 
		 
	}

}
