package com.example.library.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.book.jpa.BookRepository;
import com.example.library.book.model.Book;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;
	
	//find all books
		public List<Book> findAll() {
			return repository.findAll();
		}
}
