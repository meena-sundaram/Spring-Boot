package boot1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class RestJDBCDAO
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	String SQL = "select * from emp1";
	
	public List<EmployeeBean> isData() 
	{
		List<EmployeeBean> empss = new ArrayList<EmployeeBean>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);
		for (Map<String, Object> row : rows) {
			EmployeeBean c1 = new EmployeeBean();
			c1.setEno((int)row.get("eno1"));
			c1.setName((String)row.get("name"));
			c1.setSalary((float)row.get("salary"));
			empss.add(c1);
		}
		return empss;
	}
	 public int delete1(int id)
	 {    
	        String sql="delete from emp1 where eno1="+id+"";    
	        return jdbcTemplate.update(sql);    
	    }    

}
