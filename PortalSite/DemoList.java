package com.bit.hgb;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Collection framework
 * List : 한 줄로 나열하는 방식(구조)
 * - Array : 정적-동적
 * - Linked : 동적
 * 메서드가 다르고 적정한 것을 선택해야한다.
 * 
 * OOP 
 * - method가 제일 중요
 * 
 * @author bitcamp
 *
 */

public class DemoList {
	private static Scanner kb;
	
	public static void viewBook(Book arg) {
		String s = "Book[";
		s += arg.getBid() ;
		s += ","+ arg.getTitle() ;
		s += ","+ arg.getAuth() ;
		s += ","+ arg.getPub() ;
		s += ","+ arg.getIsbn() ;
		s += "]";
		System.out.println(s);
	}
	
	private static void viewMember(Member member) {
		String s = "Member [";
		s += member.getMid();
		s += ","+member.getEmail();
		s += "]";
		System.out.println(s);		
	}
	
	private static Book inputBook() {
		Book book = new Book();
		System.out.println("new into book (id,isbn,title,auth,pub)");
		long id = kb.nextLong();
		kb.nextLine();
		String isbn = kb.nextLine();
		String title = kb.nextLine();
		String auth = kb.nextLine();
		String pub = kb.nextLine();
								
		book.setBid(id);					
		book.setIsbn(isbn);					
		book.setTitle(title);
		book.setAuth(auth);
		book.setPub(pub);

		return book;
	}
	
	private static Member inputMember() {
		Member member = new Member();
		System.out.println("new into member (mid,email,pass)");
		long mid = kb.nextLong();
		kb.nextLine();
		String email = kb.nextLine();
		String pass = kb.nextLine();
		
		member.setMid(mid);
		member.setEmail(email);
		member.setPass(pass);

		return member;
		
	}
	
	public static void showList(ArrayList<Book> list, int o) { // 오버로딩은 타입과 매개변수 개수가 달라야한다.
		if(list != null) {
			for(Book book : list) {
				if(book != null) {
					viewBook(book);
				}else {
					System.out.println("book is null");
				}
			}
		}else {
			System.out.println("list is null");
		}
	}
	
	
	public static void showList(ArrayList<Member> list) { // 함수식의 전달, Lamda
		if(list != null) {
			list.forEach((member) -> {
				if(member != null) {
					viewMember(member);
				}else {
					System.out.println("member is null");
				}
			});
		}else {
			System.out.println("list is null");
		}
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		OneService  service = new OneService();
		kb = new Scanner(System.in);
		String menuBar = "CMD(quit, list, new, view, edit, search)";
		int CMD = 0;
		int ARG = 1;
		
		while(true){
			System.out.println(menuBar);
			String menu = kb.nextLine(); // 명령과 인자를 받기위한 String
			String[] cmd = menu.split(" ");
			if(cmd[CMD].equals("list")) {
				if(cmd.length >= 2) {
					String type = cmd[ARG];
					if(type.equals("book")) {
						ArrayList<Book> list = service.getBooks();
						showList(list,0);
					}
					if(type.equals("member")) {
						ArrayList<Member> list = service.getMembers();
						showList(list);
					}
				}else {
					System.out.println("Usage : list {book or member}");
				}
			
			}
			
			if(cmd[CMD].equals("new")) {
				if(cmd.length >= 2) {
					String type = cmd[ARG];
					if(type.equals("book")) {
						Book book = inputBook();
						service.addBook(book);
					
					}
					if(type.equals("member")) {
						Member member = inputMember();
						service.addMember(member);
					}
					
				}else {
					System.out.println("Usage: new {book or member}");
				}
				
			}
		
			if(cmd[CMD].equals("view")) {
				if(cmd.length >= 2) { 
					String type = cmd[ARG];
					System.out.println("id(long) >");
					long id = kb.nextLong();
					kb.nextLine();
					if(type.equals("book")) { 
						Book book = service.getBook(id);
						if(book == null) {
							System.out.println("not found book");
						}else {
							viewBook(book);
						}
					}
					if(type.equals("member")) { 
						Member member = service.getMember(id);
						if(member == null) {
							System.out.println("not found book");
						}else {
							viewMember(member);
						}
					}
				}else {
					System.out.println("Usage: view {book or member}");
				}
				        
			}
			
			if(cmd[CMD].equals("edit")) {
				if(cmd.length >= 2) { 
					String type = cmd[ARG];
					System.out.println("id(long) >");
					long id = kb.nextLong();
					kb.nextLine();
					if(type.equals("book")) {
						Book book = service.getBook(id);
						viewBook(book);
						Book modify = inputBook(); // bid는 수정할 수 없다.
						modify.setBid(book.getBid()); // bid에 원래 값 덮어씌움
						service.updateBook(modify);
						
					}
					if(type.equals("member")) {
						Member member = service.getMember(id);
						viewMember(member);
						Member modify = inputMember(); // mid는 수정할 수 없다.
						modify.setMid(member.getMid()); // mid에 원래 값 덮어씌움
						service.updateMember(modify);
					}
				}else {
					System.out.println("Usage: edit {book or member}");
				}
			}
			
			if(cmd[CMD].equals("search")) {
				String type = cmd[ARG];
				System.out.println("Key >");
				String key = kb.nextLine();	
				if(cmd.length < 2) { // 인자가 없을 때 : 통합검색
					HashMap<String,Object> list = service.searchAll(key);
					ArrayList<Book> books = (ArrayList<Book>) list.get("books");
					ArrayList<Member> members = (ArrayList<Member>) list.get("members");
					showList(books,0);
					showList(members);
				}else if(type.equals("book")) {
					ArrayList<Book> books = service.searchBooks(key);
					showList(books, 0);
					
					
				}else if(type.equals("member")) {
					ArrayList<Member> members = service.searchMembers(key);
					showList(members);
					
				}else { // 인자가 있으나 뭔지 모르는 것
					System.out.println("Usage: search {book or member}");
				}
			}	
		
			if(menu.equals("quit")) {
				service.refresh(); // file 저장
				break;
			}
		}
		kb.close();
	}

}
