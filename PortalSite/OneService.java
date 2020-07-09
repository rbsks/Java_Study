package com.bit.hgb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OneService {
	private BookRepository bookRepo;
	private MemberRepository memberRepo;


	
	public OneService() {
		this.bookRepo = new BookRepository();
		this.memberRepo = new MemberRepository();		
	}
	
	public BookRepository getBookRepo() {
		return bookRepo;
	}

	public void setBookRepo(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}

	public MemberRepository getMemberRepo() {
		return memberRepo;
	}

	public void setMemberRepo(MemberRepository memberRepo) {
		this.memberRepo = memberRepo;
	}
	
	

	@Override
	public String toString() {
		
		return "OneService [" + bookRepo.findAll() + "]" + memberRepo.findAll() + "]";
	}

	public HashMap<String, Object> searchAll(String key) {
		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("books",	searchBooks(key));
		result.put("members", searchMembers(key));	
		return result;
	}

	public ArrayList<Member> searchMembers(String key) {
		return memberRepo.getMembers(key);
		
	}

	public ArrayList<Book> searchBooks(String key) {
		return bookRepo.getBooks(key);

	}
	
	public void addBook(Book book) {
		bookRepo.add(book);

	}

	public void addMember(Member member) {
		memberRepo.add(member);

	}
	
	public ArrayList<Book> getBooks(){
		return bookRepo.findAll();
	}
	
	public ArrayList<Member> getMembers(){
		return memberRepo.findAll();
	}


	// file save
	public void refresh() {
		bookRepo.bookSave();
		memberRepo.memberSave();
		
	}

	public Book getBook(long id) {
		 
		return bookRepo.findOne(id);
	}

	public Member getMember(long id) {

		return memberRepo.findOne(id);
	}

	public void updateBook(Book modify) {
		Book book = getBook(modify.getBid());
		
		if(!modify.getTitle().isEmpty()) {
			book.setTitle(modify.getTitle());
		}
		if(!modify.getIsbn().isEmpty()) {
			book.setIsbn(modify.getIsbn());
		}
		if(!modify.getAuth().isEmpty()) {
			book.setAuth(modify.getAuth());
		}
		if(!modify.getPub().isEmpty()) {
			book.setPub(modify.getPub());
		}

	}

	public void updateMember(Member modify) {
		Member member = getMember(modify.getMid());
		
		if(!modify.getEmail().isEmpty()) {
			member.setEmail(modify.getEmail());
		}
		if(!modify.getPass().isEmpty()) {
			member.setPass(modify.getPass());
		}
		
		
	}


}
