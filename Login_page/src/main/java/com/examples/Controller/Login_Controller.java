package com.examples.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.examples.Service.Login_Service;
import com.examples.bean.Login_page;

@Controller
public class Login_Controller {
	
	@Autowired
	private Login_Service Service;

    @GetMapping("/login")
	 public ModelAndView login() {
	     ModelAndView mav = new ModelAndView("login");
	        mav.addObject("user", new Login_page());
	        return mav;
	    }
	 @PostMapping("/login")
	    public String login(@ModelAttribute("user") Login_page user) {
	    
	    Login_page oauthUser = Service.login(user.getEmail(), user.getPassword());
	    System.out.print(oauthUser);
	     if(Objects.nonNull(oauthUser))
	     {
	     return "redirect:/";
	      } else {
	     return "redirect:/login";
	   }
	}
	 
	 

}
