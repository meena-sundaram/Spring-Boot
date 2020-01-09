package boot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/root")
public class SBWeb1
{
	//this annotation works only with controller and rest
	@RequestMapping("/signin")
	@ResponseBody
	/*
	 Cross-Origin Resource Sharing (CORS) is a 
	 security concept that allows restricting the 
	 resources implemented in web browsers. 
	 It prevents the JavaScript code producing or 
	 consuming the requests against different origin.

For example, your web application is running on 8080
port and by using JavaScript you are trying to 
consuming RESTful web services from 9090 port.
	*/
	//method level CORS
	@CrossOrigin(origins = "http://localhost:8081")
	   public String callboot()
	  {
	      return "<h1><font color=blue>"
	      		+ "Hello Spring WEB Boot!!!!!!!";
	   }

	@RequestMapping("/calljsp1")
	public String mymethod()
	{
		return "SBJsp1";
		//RETURNS VIEW JSP FILE CALLED SBJsp1.jsp
	}

}
