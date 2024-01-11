package com.demo.counter.session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import jakarta.servlet.http.HttpSession;

@Controller
public class MainCounter {
	@GetMapping("/")
	public String index(HttpSession session) {
		
		Integer count = 0;
		
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}else {
			count = (Integer) session.getAttribute("count");
			count++;
			session.setAttribute("count", count);
		}
		
		return "index.jsp";
	}
	
	@GetMapping("/counter")
	public String counter() {
		return "main.jsp";
	}
}