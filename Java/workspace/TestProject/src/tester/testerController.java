package tester;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testerController {


@RequestMapping("route.do")
public ModelAndView processData(@RequestParam(name = "data", defaultValue = "5") int s, @RequestParam(name = "data2", defaultValue = "5") int t, @RequestParam(name = "type", defaultValue = "+") String a) {

	
	int result=0;
	if(a.equals("add")){
		result =s +t;
		
	}else if (a.equals("sub")){
		result =s -t;
		
	}else if(a.equals("mult")){
		result =s*t;
		
	}else if(a.equals("div")){
		result =s/t;
		
	}
	
	
	ModelAndView mv = new ModelAndView();
	mv.setViewName("mine.jsp");
	mv.addObject("data", s);
	mv.addObject("data2", t);
	mv.addObject("result", result);
	return mv;
	
  }
}