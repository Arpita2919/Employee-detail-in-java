import java.util.Scanner;
public class duplicateEmployee {
	int id;
	String name;
	double salary;
	
	
	public void getDetails() {
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter id: ");
		id=sc.nextInt();
		sc.nextLine();
		 
		System.out.println("enter name: ");
		name=sc.nextLine();
		
		System.out.println("enter salary: ");
		salary=sc.nextDouble();
	}
	public void displayDetails() {
		System.out.println("Employee Details");
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
	}
	public static void main(String[] args) {
		
		duplicateEmployee Emp1=new duplicateEmployee();
		System.out.println("enter details of employee 1: ");
		Emp1.getDetails();
		
		duplicateEmployee Emp2=new duplicateEmployee();
		System.out.println("enter details of employee 2: ");
		Emp2.getDetails();
		
		Emp1.displayDetails();
		Emp2.displayDetails();
	}

}
