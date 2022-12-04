package com.example.library.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.library.book.model.Book;
import com.example.library.book.service.BookService;

@RestController
@RequestMapping("/library")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/book")
	public List<Book> getBookList() {
		return bookService.findAll();
	}
	
	@GetMapping(value="/getBook")
	public List<Book> getBook() {

		RestTemplate restTemplate = new RestTemplate();
		@SuppressWarnings("unchecked")
		List<Book> response = (List<Book>) restTemplate.getForObject("http://localhost:2020/library/book", Book.class);
		//List<Book> book= (List<Book>) response.getBody();
		//System.out.println("calling from status code: "+response.getStatusCode());
		//System.out.println("calling from response: "+book);
		return response;
	}

}
