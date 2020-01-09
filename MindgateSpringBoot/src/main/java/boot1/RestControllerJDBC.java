
package boot1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerJDBC
{
	@Autowired
	public RestJDBCDAO dao;
	
	@RequestMapping("/get-emp-info")
	public List<EmployeeBean> empInformation()
	{
		
		List<EmployeeBean> emps = dao.isData();		 
		return emps;//object
	}

}
