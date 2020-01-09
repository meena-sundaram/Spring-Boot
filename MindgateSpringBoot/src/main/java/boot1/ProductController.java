package boot1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ProductController 
{
	@ModelAttribute(name= "testpro")
	 public ProductPojo getProduct
	 (
			 @RequestParam 
			 int p1, 
			 @RequestParam  
			 String p2)
	 {
	  ProductPojo pro=new ProductPojo();
	 pro.setPid(p1);
	 pro.setPname(p2);
	 return pro;
	 }
	
	@RequestMapping(value= "/viewproduct", method= RequestMethod.POST)
	public String submit(
			@ModelAttribute(name= "testpro") 
			ProductPojo pro11,//same modelattribute name
			ModelMap model) 
	{
		model.addAttribute("prname",pro11.getPname());
		model.addAttribute("prid", pro11.getPid());

		return "ProductView";
	}


}
