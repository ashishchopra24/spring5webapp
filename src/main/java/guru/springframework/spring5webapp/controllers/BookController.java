package guru.springframework.spring5webapp.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repositories.BookRepository;

public class BookController {
	
	private BookRepository bk;

	public BookController(BookRepository bk) {
		super();
		this.bk = bk;
	}
	
	@RequestMapping("/books")
	public String getBooks(Model model)
	{
		String books="";
		model.addAttribute(books, bk.findAll());
		return books;
	}

}
