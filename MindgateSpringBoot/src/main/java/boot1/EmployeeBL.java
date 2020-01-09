package boot1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;


@Component
public class EmployeeBL extends JdbcDaoSupport
{
	//jdbc connection fetch from application.properties 
	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initializedb1()
	{
		System.out.println("POSTCONSTRUCT LOADED");
		System.out.println("DBCON: "+dataSource.toString());
		setDataSource(dataSource);//JdbcDaoSupport
	}

	public List<EmployeeBean> getAllEmployees()
	{
		String sql = "SELECT * FROM emp1";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<EmployeeBean> result = new ArrayList<EmployeeBean>();
		for(Map<String, Object> row:rows){
			EmployeeBean emp = new EmployeeBean();
			emp.setEno((Integer)row.get("eno1"));//mysql table column name
			emp.setName((String)row.get("name"));
			emp.setSalary((Float)row.get("salary"));
			
			result.add(emp);
			System.out.println("MYSQL RES: "+result);
		}
		
		return result;
	}

	public void insertEmployee(EmployeeBean emp)
	{
		String sql = "INSERT INTO emp1 " +
				"(eno1,name,salary) VALUES (?, ?,?)" ;
		getJdbcTemplate().update(sql, new Object[]
		{
		emp.getEno(),emp.getName(),emp.getSalary()
		}
		);
	}

}
