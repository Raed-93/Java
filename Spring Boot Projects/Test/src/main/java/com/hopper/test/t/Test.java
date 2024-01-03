package com.hopper.test.t;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	@RequestMapping("/")
	public String name() {
		return "index.jsp";
	}

}
