package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@RestController
public class BookController {
	
	
	BookRepository repository;

	
	public BookController(BookRepository repository)
	{
		this.repository=repository;
	}
	
	
	@PostMapping("/saveBook")
	public String storeBook(@RequestBody Book b)
	{
		Book s=repository.save(b);
		if(b!=null)
		{
			return "Success";
		}
		else
		{
			return "Failure";
		}
		
	}
	@PostMapping("/bookById")
	public Book getBook(@RequestParam Integer id)
	{
		Book b=repository.findById(id).get();
		return b;
	}
	
	@PostMapping("/bookList")
	public ArrayList<Book> getBook1()
	{
		ArrayList<Book> c=(ArrayList<Book>) repository.findAll();
		return c;
	}
	@PostMapping("/bookByName")
	public Book getBook(@RequestParam String name)
	{
		Book b=repository.findByName(name);
		return b;
	}
	@PostMapping("/allBooks")
	public Iterable<Book> getAllBooks()
	{
		Iterable<Book> i=repository.findAll();
		return i;
	}
	

}
