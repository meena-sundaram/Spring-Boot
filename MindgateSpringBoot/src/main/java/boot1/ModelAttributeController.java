package boot1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ModelAttributeController 
{
	@ModelAttribute(name= "lang")
	public List<String> showlang()
	{
		List<String> lang1= new ArrayList<String>();
		lang1.add("Angular");
		lang1.add("Node js");
		lang1.add("Selenium");
		lang1.add("Devops");
		return lang1;//list object
	}

	@RequestMapping(value= "/showlang", method= RequestMethod.GET)
	public String initView(
			@ModelAttribute(name= "lang") 
			List<String> langlist
			) 
	{ 
		return "ModAttr";
	}

}
