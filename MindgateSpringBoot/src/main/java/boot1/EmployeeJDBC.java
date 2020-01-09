package boot1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeJDBC
{
	@Autowired
	EmployeeBL employeeDao;

	public void getAllEmployees()
	{
		System.out.println("Employee Details:::");
		List<EmployeeBean> employees = 
				employeeDao.getAllEmployees();
		for (EmployeeBean employee : employees) {
			System.out.println(employee.toString());
		}
	}
	public void insertEmployee(EmployeeBean employee) {
		employeeDao.insertEmployee(employee);
	}

}
