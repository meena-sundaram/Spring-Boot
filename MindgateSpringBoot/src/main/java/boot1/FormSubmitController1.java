package boot1;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormSubmitController1 
{
    @RequestMapping("/getForm")
    public String getForm() 
    {
        return "EmpForm";//view name
    }
    //@PostMapping("/saveDetails")
    //@GetMapping("/saveDetails")//error
    @RequestMapping("/saveDetails")
    public String saveDetails(
    		@RequestParam("employeeName") 
    		String employeeName1,
            @RequestParam("employeeEmail") 
    		String employeeEmail1,
            ModelMap modelMap) 
    {
        //pass values from MVC controller to JSP
    	Date now = new Date();
     modelMap.put("curtime1", now);
        modelMap.addAttribute("emp_Name", employeeName1);
        modelMap.put("emp_Email", employeeEmail1);
        return "ViewEmp"; 

    }

}
