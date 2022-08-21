import java.util.Scanner;

public class insertdetails {

	
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("Enter the id");
		 int id=s.nextInt();
		 System.out.println("Enter the name");
		 String name=s.next();
		 System.out.println("Enter the salary");
		 int salary=s.nextInt();
		 
		 emp e= new empimp();
		   try {
		   String op=	e.InsertEmpDetails(id, name, salary);
		   
		   System.out.println(op);
		} catch (EmpException e1) {
			// TODO Auto-generated catch block
			e1.getMessage();
		}
	}
}
