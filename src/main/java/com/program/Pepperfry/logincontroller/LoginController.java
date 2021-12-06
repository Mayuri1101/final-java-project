package com.program.Pepperfry.logincontroller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.program.Pepperfry.logindomain.Login;
import com.program.Pepperfry.loginservices.LoginService;
import com.program.Pepperfry.repository.ContactRepository;



@Controller
public class LoginController {
	@Autowired
	private ContactRepository con;
	@Autowired
    private LoginService userService;
	
	@GetMapping("/login")
	public ModelAndView login() {
	     ModelAndView mav = new ModelAndView("login");
	        mav.addObject("user", new Login());
	        return mav;
	    }
	
	@PostMapping("/login")
    public String login(@ModelAttribute("user") Login user, RedirectAttributes redirAttrs ) {
    
     Login oauthUser = userService.login(user.getEmail(), user.getPassword());
    
 
     System.out.print(oauthUser);
	    try{
     if(Objects.nonNull(oauthUser))
     {
  
     return "redirect:/home";
    
    
     } else {
    	 redirAttrs.addFlashAttribute("error", "Invalid Username and Password if not have account go to sign in.");
         return "redirect:/login";
    
    
     }
	    }
	    catch (Exception e){
    	    System.out.println(e);
    	}
	return null;
 
}
}
