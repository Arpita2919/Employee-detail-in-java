import java.util.Scanner;
public class employee {
	int id;
	String name;
	double salary;
	
	public void getDetails(Scanner sc) {
		
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
		Scanner sc = new  Scanner(System.in);
		employee Emp1=new employee();
		System.out.println("enter details of employee 1: ");
		Emp1.getDetails(sc);
		
		employee Emp2=new employee();
		System.out.println("enter details of employee 2: ");
		Emp2.getDetails(sc);
		
		Emp1.displayDetails();
		Emp2.displayDetails();
		
		

		
		
		
		}

	
	
}

