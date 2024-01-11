package com.Books.API.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Books.API.demo.models.Book;
import com.Books.API.demo.services.BookService;



@Controller
public class BookController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/")
	public String main(Model model) {
		return "redirect: /books";
	}
	
	
	@GetMapping("/books")
	public String index(Model model) {
		
		List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "index.jsp";
	}
	

//	@GetMapping("/books/{bookId}")
//	public String index(Model model, @PathVariable("bookId") Long bookId){
//		
//		 model.addAttribute("books", bookService.findBook(bookId));
//		return "show.jsp";
//	}
	

}
