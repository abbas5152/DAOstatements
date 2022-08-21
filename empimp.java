import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class empimp implements emp {

	@Override
	public int getEmployeeSalarybyId(int id) throws EmpException {
		// TODO Auto-generated method stub
		int salary=0;
		
		try(Connection conn= ProvideConn.EstablishConnection()){
			
			
			PreparedStatement ps= conn.prepareStatement("select salary from Employee2 where eid=?");
			ps.setInt(1, id);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				salary=rs.getInt("salary");
			}
			else {
				throw new EmpException("Employee does not exist with ID :"+id);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmpException(e.getMessage());
			
		}
		
	
		
		
		
		
		return salary;
	}

	

//	@Override
	public List<Employee> getalldetails() throws EmpException {
		List<Employee> list= new ArrayList<>();
		
		
		try(Connection conn= ProvideConn.EstablishConnection()) {
			
			
		PreparedStatement ps= conn.prepareStatement("select * from Employee2");	
			
		ResultSet rs= ps.executeQuery();
			
		while(rs.next()) {
			
			
			int r= rs.getInt("eid");
			String n= rs.getString("name");
			String a= rs.getString("address");
			int sa= rs.getInt("Salary");
			
			
			Employee e=new Employee(r, n, a, sa);
			
			list.add(e);
			
			
		}
		
			if(list.size() == 0)
				throw new EmpException("No employee found..");
			
		
			
		} catch (SQLException e) {
			throw new EmpException(e.getMessage());
		}
	
	
	return list;
	
	
	}
//
//	@Override
	public String getBonus(int bonus) {
		String ans="Bonus not given";
		
	try(Connection conn= ProvideConn.EstablishConnection()){
			
			
	PreparedStatement ps=	conn.prepareStatement("UPDATE employee2 SET salary = salary+?");
		
		ps.setInt(1, bonus);
		int x= ps.executeUpdate();
			
			
			
			if(x >0) {
				ans =" bonus given to "+x +" employyes";
			}
			
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			
		}
		
		return ans;
	}
//
	@Override
	public String InsertEmpDetails(int id, String name,int salary) throws EmpException {
		String ans="Not inserted";
		try(Connection conn= ProvideConn.EstablishConnection()){
			
			PreparedStatement ps=	conn.prepareStatement("insert into Employee2 values(?,?,null,?) ");
			
			ps.setInt(1,id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			
			int x= ps.executeUpdate();
			
			
			if(x >0) {
				ans= x+" record inserted sucessfully";
			}
			else
				throw new EmpException("entry mismtach");
					
						
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
					
		
		
		return ans;
	}
//
	@Override
	public List<Employee> getEmployeeDetailsbyId(int id) throws EmpException {
		List<Employee> list=new ArrayList<>();
		
		
		try(Connection conn= ProvideConn.EstablishConnection()) {
			
			
		PreparedStatement ps= conn.prepareStatement("select * from Employee2 where eid=?");	
		ps.setInt(1, id);
			
		ResultSet rs= ps.executeQuery();
			
		if(rs.next()) {
			
			
			int r= rs.getInt("eid");
			String n= rs.getString("name");
			String a= rs.getString("address");
			int sa= rs.getInt("Salary");
			
			
			Employee e=new Employee(r, n, a, sa);
			
			list.add(e);
			
			
		}
		
		else
				throw new EmpException("No employee found..");
			
		
			
		} catch (SQLException e) {
			throw new EmpException(e.getMessage());
		}
		
		
		
		return list;
		
	}
//
	@Override
	public List<Employee> getEmployeeDetailsbylesssalary(int salary) throws EmpException {
List<Employee> list=new ArrayList<>();
		
		
		try(Connection conn= ProvideConn.EstablishConnection()) {
			
			
		PreparedStatement ps= conn.prepareStatement("select * from Employee2 where salary<?");	
		ps.setInt(1, salary);
			
		ResultSet rs= ps.executeQuery();
			
		while(rs.next()) {
			
			
			int r= rs.getInt("eid");
			String n= rs.getString("name");
			String a= rs.getString("address");
			int sa= rs.getInt("Salary");
			
			
			Employee e=new Employee(r, n, a, sa);
			
			list.add(e);
			
			
		}
		if(list.size()==0)
			throw new EmpException("No employee found..");
		
	
		
	} catch (SQLException e) {
		throw new EmpException(e.getMessage());
	}
		
		
			
		
	
		
		
		
		return list;
	}

}
