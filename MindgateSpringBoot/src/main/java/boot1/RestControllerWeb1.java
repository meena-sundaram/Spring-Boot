package boot1;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//return type as json,xml,
@RestController//controller+responsebody
public class RestControllerWeb1 
{
	@RequestMapping(value="/restsignin")
	public String view1()
	{ 
		return "<h1><font color=blue>Hello RestFul "
				+ "Services!!!!!!!";
	   }
	/*
	 xml dependency added in pom.xml
	 http://localhost:8080/empinfo--default xml
	 http://localhost:8080/empinfo.xml
	 
	 http://localhost:8080/empinfo.json
	 */

	@RequestMapping(value="/empinfo",method=RequestMethod.GET)
	public List<EmployeeBean> getemps()
	{
		List<EmployeeBean> obj1=new ArrayList<>();
		
		EmployeeBean e1=new EmployeeBean();
		e1.setEno(1001);
		e1.setName("Devi");
		e1.setSalary(43000);
		EmployeeBean e2=new EmployeeBean();
		e2.setEno(1002);
		e2.setName("Thananya");
		e2.setSalary(30000);
		obj1.add(e1);
		obj1.add(e2);
		return obj1;//object
		
 	}

}
