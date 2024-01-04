package com.hopper.receipt.dojo;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Dateapplication {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat DT = new SimpleDateFormat("EEEE, MMM d,yyyy");
		Date date = new Date();
		model.addAttribute("date", DT.format(date));
		return "date.jsp";
		
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat DT = new SimpleDateFormat("h:mm a");
		Date date = new Date();
		model.addAttribute("time", DT.format(date));
		return "time.jsp";
		
	}
	

}
