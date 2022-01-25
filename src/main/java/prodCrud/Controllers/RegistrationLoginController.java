package prodCrud.Controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import prodCrud.DAO.CustomUserDetails;
import prodCrud.DAO.RegistrationLoginServices;
import prodCrud.Entity.Login;
import prodCrud.Entity.User;

@Controller
public class RegistrationLoginController {
	
	private static final Logger logger= Logger.getLogger(RegistrationLoginController.class);
	
	@Autowired
	private RegistrationLoginServices regloginService;
	private Login login;
	private User user;
	
	

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView handleRegister() {
		ModelAndView mav= new ModelAndView("Registration");
		mav.addObject("user",new User());
		return mav;
		
	}
	
	@ResponseBody
	@PostMapping(value = "/registerProcess",produces = "application/json")
	public User registerUser(@RequestBody User user, BindingResult result) {
		
		
		if (user!=null) {
			regloginService.register(user);
			return regloginService.getSingleUser(user.getuId());
			
		}
		else {
			return regloginService.getSingleUser(user.getuId());
			
		}
		
	}

	
		@ResponseBody
		@GetMapping(value = "/getUser",produces = "application/json")
		public List<User> getUser() {
			
			
			System.out.println("Getuser called");
			
				return regloginService.getFieldsUser();
				
				
			}
		
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "/loginUser" , method = RequestMethod.POST, consumes
	 * = "application/json") public ModelAndView loginUser(@RequestBody Login login)
	 * {
	 * 
	 * ModelAndView mav = null;
	 * 
	 * User user = regloginService.validateUser(login);
	 * 
	 * if (null != user) { mav = new ModelAndView("Welcome");
	 * mav.addObject("firstname", user.getFirstName()); } else { mav = new
	 * ModelAndView("loginUser"); mav.addObject("message",
	 * "Username or Password is wrong!!"); }
	 * 
	 * return mav;
	 * 
	 * 
	 * }
	 */
	@PostMapping(path = "/loginuser")
	public String loginUser(@RequestBody User user, Model model) {
		
		BasicConfigurator.configure();
		logger.info(user);
		List<User> cUser= regloginService.getUserNames(user.getUserName());
		for (User user2 : cUser) {
			if (user2!=null && user2.getPassword().equals(user.getPassword())) {
				model.addAttribute("message","Welcome" + user2.getFirstName());
				return "Welcome";
				
			}else {
				model.addAttribute("message", "Username or Password is incorrect");
				return "Welcome";
			
		}
			
	
	}
		return "Welcome";
	
	}
	
	@ResponseBody
	@PostMapping(path="/login")
	public String login(@RequestBody Login login) {
		String userName= login.getUserName();
		
		regloginService.getUserNames(userName);
		
		
		System.out.println(userName);
		
		return "Success";
	}
}
