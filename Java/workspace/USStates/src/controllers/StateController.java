package controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import data.State;
import data.StateDAO;

@Controller
public class StateController {
	// TODO : Autowire a StateDAO and create getters and setters
	@Autowired
	private StateDAO stateDAO;
	
	// TODO : Implement a request handler for:
	// path "GetStateData.do"
	// params "name"
	// method GET
	// return : ModelAndView
	// view : "result.jsp"
	// object : "state", getStateByName
	@RequestMapping(path="GetStateDataName.do", method=RequestMethod.GET)
	public ModelAndView getStateDataName(@RequestParam("name") String name) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("state",  stateDAO.getStateByName(name));
		return mv;
	}
	// TODO : Implement a request handler for:
	// path "GetStateData.do"
	// params "abbr"
	// method GET
	// return : ModelAndView
	// view : "result.jsp"
	// object : "state", getStateByAbbreviation
	@RequestMapping(path="GetStateDataAbbr.do", method=RequestMethod.GET)
	public ModelAndView getStateDataAbbr(@RequestParam("abbr")String abbr) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("state",  stateDAO.getStateByAbbreviation(abbr));
		return mv;
	}
	// TODO : Implement a request handler for:
	// path "NewState.do"
	// method POST
	// command object : State
	// return : ModelAndView
	// view : "result.jsp"
	@RequestMapping(path="NewState.do", method=RequestMethod.GET)
	public ModelAndView NewState(State state) {
		ModelAndView mv = new ModelAndView();
		System.out.println(state);
		mv.setViewName("result.jsp");
		return mv;
	}
	// -------------------

	// TODO : Implement another request handler for:
	// path "NewState.do"
	// method POST
	// command object : State
	// return : ModelAndView
	// view : "redirect:stateAdded.do"
	// behavior : add state to dao, add state to flashAttributes
	@RequestMapping(path="NewStateredirected.do", method=RequestMethod.POST)
	public ModelAndView NewStateRedirect(State state) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:stateAdded.do");
		stateDAO.addState(state);
		stateDAO.addFlashAttribute("state", state);
		
		return mv;
	}
	// TODO : Implement another request handler for:
    // path "stateAdded.do"
    // method GET
    // command object : State
    // return : ModelAndView
    // view : "result.jsp" or "result" if using InternalResourceViewResolver
	@RequestMapping(path="stateAdded.do", method=RequestMethod.POST)
	public ModelAndView getStateData(State state) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		
		return mv;
	}
	public StateDAO getStateDAO() {
		return stateDAO;
	}
	public void setStateDAO(StateDAO stateDAO) {
		this.stateDAO = stateDAO;
	}
	
}