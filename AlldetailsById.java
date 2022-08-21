import java.util.List;
import java.util.Scanner;

public class AlldetailsById {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter id");
		int id=s.nextInt();
		
		 emp e= new empimp();
		 try {
		 
		 List<Employee> list=e.getEmployeeDetailsbyId(id);
	 
	 list.forEach(so ->{
			
			
			System.out.println(so);
			
			
		});
	 }
		 catch (EmpException e1) {
				
				System.out.println(e1.getMessage());
				
				
			}
	 }
	 
	}


