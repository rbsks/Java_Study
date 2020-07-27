package com.bit.hgb;
/*
 * 다 읽어드리고
 * 종료되기전에 메모리에 파일 덮어씌운다
 * 사용자 선택에 따라 업데이트(파일 덮어쓰기)
 * CSV로 구분하는 형식
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class BookFile {
	private ArrayList<Book> btable;
	
	public ArrayList<Book> getTable(){
		return btable;
	}
	
	// 메모리로부터 읽어들여 파일에 저장하기
	public String bkString(Book book) {
		String s ="";
		if(book != null) {
			s += book.getBid()+",";
			s += book.getIsbn()+",";
			s += book.getTitle()+",";
			s += book.getAuth()+",";
			s += book.getPub()+"\n";	
		}else {
			System.out.println("bkString book is null");
			return s;
		}
		
		return s;
	}
	
	public String joinLine() {
		String s = "";
		if(btable != null) {
			for(Book book : btable) {
				s += bkString(book);
			}
		}else {
			System.out.println("BookFile btable is null");
		}
		return s;
	}
	
	public void save(String filename) throws IOException {
		String datas = joinLine();
		File file = new File(filename);
		file.createNewFile();
		FileWriter out = new FileWriter(file); // 생성모드
		//FileWriter out = new FileWriter(file, true); 확장
		if(!datas.isEmpty()) {
			out.write(datas);
			out.flush();
		}
		
		out.close();
	}
	
	
	
	// 파일로부터 읽어들여 메모리에 저장하기
	public String load(String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner rd = new Scanner(file);
		String datas = "";
		
		if(file.exists()) {
			// file이 있을 때
			while(rd.hasNextLine()) { // has 값이 있냐 없냐 확인하는 method
				datas += rd.nextLine(); // file을 읽어와라
			}
			rd.close();
			paresLine(datas);
		}else {
			System.out.println("not found "+filename);
		}
		
		return datas;
		
	}
	
	public void paresLine(String str) {
		// \n
		if(btable == null) {
			btable = new ArrayList<Book>();
		}
		String[] lines = str.split("\n");
			for(String line : lines) {
				Book book = toBook(line);
				btable.add(book);
			}
			//System.out.println(btable);
		
	}
	
	public Book toBook(String line) {
		String[] s = line.split(",");
		long bid = Long.parseLong(s[0]); // 문자열 정수로 변환
		String isbn = s[1];
		String title = s[2];
		String auth = s[3];
		String pub = s[4];
		
		// return new Book(id,email,pass) -> 매개변수가 있는 생성자가 있을 경우
		Book book = new Book();
		book.setBid(bid);
		book.setIsbn(isbn);
		book.setTitle(title);
		book.setAuth(auth);
		book.setPub(pub);
		return book;	
		
	}
	
	
	
}
