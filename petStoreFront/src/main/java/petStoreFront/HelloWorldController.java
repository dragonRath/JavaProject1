package petStoreFront;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/")
	public ModelAndView helloWorld(){
		return new ModelAndView("welcome","message","Welcome to Spring Mvc framework");
	}
}

