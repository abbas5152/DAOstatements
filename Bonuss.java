import java.sql.SQLException;
import java.util.Scanner;

public class Bonuss {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("Enter the bonus");
		 int id=s.nextInt();
		 
		 emp e= new empimp();
		   String bonus=	e.getBonus(id);
		   
		   System.out.println(bonus);
	}

}
