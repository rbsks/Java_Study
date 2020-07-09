package com.bit.hgb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


// 어디에 어떤 자료를 다룰 것인가?
// Book의 CRUD를 표현 in Memory ArrayList
public class BookRepository {
	private ArrayList<Book> books;
	private BookFile bfile;
	
	public BookRepository() {
		bfile = new BookFile();
		try {
			bfile.load("book.csv");
			books = bfile.getTable();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public BookRepository(ArrayList<Book> repo) {
		books = repo;
	}

	public ArrayList<Book> findAll() {
		return books;
	}
	
	public ArrayList<Book> getBooks(String key) {
		ArrayList<Book> rst = new ArrayList<Book>();
		for(Book book : books) {
		
			if(book.getTitle().contains(key) || book.getAuth().contains(key) || book.getPub().contains(key)) {
				rst.add(book);
			}
		}
		return rst;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public void add(Book book) {
		if(book != null) {
			books.add(book);
		}else {
			System.out.println("Book repo save : null");
		}
		
	}
	
	public void all() {
		for(int i = 0; i < books.size(); i++) {
			System.out.println("[" +i +"]" + books.get(i));
			
		}
	}

	public Book findOne(long id) {
		for(Book book : books) {
			if(book.getBid() == id) {
				return book;
			}
		}
		return null;
	}

	public void bookSave(){
		try {
			bfile.save("book.csv");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	
}
