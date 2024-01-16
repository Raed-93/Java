package com.demo.authentication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.authentication.models.LoginUser;
import com.demo.authentication.models.User;
import com.demo.authentication.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {
	

     @Autowired
     UserService userService;
	
     @GetMapping("/")
     public String index(Model model) {
    
      
         model.addAttribute("newUser", new User());
         model.addAttribute("newLogin", new LoginUser());
         return "index.jsp";
     }
     
     @GetMapping("/home")
     public String successPage(HttpSession session, Model model) {
    	
    	    if (session.getAttribute("userId") == null) {
    	     
    	        return "redirect:/";
    	    }
    	    else {
    	    	Long userid = (Long) session.getAttribute("userId");
    	    	User user = userService.findUser(userid);
    	    	model.addAttribute("user",user);
    	    	 return "welcome.jsp";
    	    }
    	
     }
     
     
     @PostMapping("/register")
     public String register(@Valid @ModelAttribute("newUser") User newUser, 
             BindingResult result,
             Model model,
             HttpSession session) {
         
      
    	 User user = userService.register(newUser, result);
    	
         if(result.hasErrors()) {
             
             model.addAttribute("newLogin", new LoginUser());
             return "index.jsp";
         }
         	
         else {
        	 
        	 
        	 session.setAttribute("userId", user.getId());

        	 return "redirect:/home";
         }
     }
	
     
     @PostMapping("/login")
     public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
             BindingResult result, Model model, HttpSession session) {
         
     
          User user = userService.login(newLogin, result);
     
         if(result.hasErrors()) {
             model.addAttribute("newUser", new User());
             return "index.jsp";
         }
     
     
         session.setAttribute("userId", user.getId());
        
         return "redirect:/home";
     }
     
     @GetMapping("/logout")
     public String logout(HttpSession session) {
      
         session.invalidate();
         

         return "redirect:/";
     }
     

}

