package prodCrud.Controllers;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.view.RedirectView;

import prodCrud.DAO.FamilyDao;
import prodCrud.DAO.SelfDao;
import prodCrud.Entity.Child;

import prodCrud.Entity.Self;
import prodCrud.Entity.Spouse;


@Controller
public class MainController {
	
	private static final Logger logger= Logger.getLogger(MainController.class);
	
	@Autowired
	private FamilyDao fam;
	
	

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
		

	@ResponseBody
	@RequestMapping(value = "/self", method = RequestMethod.POST, produces = "application/json")
	public String saveSelf(@RequestBody Self self , HttpServletRequest req) {
		BasicConfigurator.configure();
		logger.info(self);
		
		
		fam.saveSelf(self);
		return "Success";
}
	
	@ResponseBody
	@RequestMapping(value = "/getSelf", method = RequestMethod.POST, produces = "application/json")
	public List<Self> getSelf() {
		
		RedirectView rd= new RedirectView();
	return fam.getAllSelf();
	
		
}
}
