package com.fruity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FruityLoops {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

}
