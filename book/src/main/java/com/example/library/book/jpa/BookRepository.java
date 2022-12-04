package com.example.library.book.jpa;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.library.book.model.Book;

@Repository
public interface BookRepository extends JpaRepositoryImplementation<Book, Integer> {

}
