package com.Books.API.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Books.API.demo.models.Book;
import com.Books.API.demo.services.BookService;

import jakarta.validation.Valid;



@Controller
public class BookController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/")
	public String main(Model model) {
		return "redirect: /books";
	}
	
	
	 @GetMapping("/books/new")
	    public String newBook(@ModelAttribute("book") Book book) {
	        return "new.jsp";
	    }
	    @PostMapping("/books")
	    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
	        if (result.hasErrors()) {
	            return "new.jsp";
	        } else {
	            bookService.createBook(book);
	            return "redirect:/books";
	        }
	    }
	
	
	@GetMapping("/books")
	public String index(Model model) {
		
		List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "index.jsp";
	}
	

	@GetMapping("/books/{bookId}")
	public String index(Model model, @PathVariable("bookId") Long bookId){
	
	 model.addAttribute("books", bookService.findBook(bookId));
		return "show.jsp";
	}
	

}
