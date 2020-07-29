package com.bit.control;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import variable.Member;

/**
 * Servlet implementation class ScopTestServlet
 */
@WebServlet("/x")
public class ScopTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext applicotion =  getServletContext();
		Member memberX = (Member)applicotion.getAttribute("member");
		memberX.setName("222");
		System.out.println(memberX);
		System.out.println("xxName = " + applicotion.getAttribute("xxName"));
	}

}
