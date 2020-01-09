package boot1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelandViewController 
{
	@RequestMapping(value = "/modview", method = RequestMethod.GET)
	public ModelAndView getdata() {

		List<String> list = getList();

		//return back to modelview.jsp
		ModelAndView model = new ModelAndView("modelview");//jsp name
		model.addObject("lists", list);

		return model;//model object

	}

	private List<String> getList() {

		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("Angular");
		list.add("Express Framework");
		list.add("Swagger Tool");
			return list;

	}

}
