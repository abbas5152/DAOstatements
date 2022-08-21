


	
	import java.util.Scanner;
	

	public class SalarybyId {
	  public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("Enter the id");
		 int id=s.nextInt();
		 
		 emp e= new empimp();
		   try {
		   int salary=	e.getEmployeeSalarybyId(id);
		   
		   System.out.println(salary);
		} catch (EmpException e1) {
			// TODO Auto-generated catch block
			e1.getMessage();
		}
	}
	}

