package com.Books.API.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Books.API.demo.services.BookService;



@Controller
public class BookController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/")
	public String main(Model model) {
		return "redirect: /books";
	}
	

	@GetMapping("/books/{bookId}")
	public String index(Model model, @PathVariable("bookId") Long bookId){
		
		 model.addAttribute("books", bookService.findBook(bookId));
		return "show.jsp";
	}
	

}
