package com.bit.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bit.model.dao.EmpinfoRepository;
import com.bit.model.dto.Empinfo;
import com.bit.util.DBConnection;

/**
 * Servlet implementation class ServletScott
 */
@WebServlet(description = "Call Scott", urlPatterns = { "/Test" })
public class ServletScott extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmpinfoRepository emprepo;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletScott() {
    	super();   
    	emprepo = new EmpinfoRepository();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empno = request.getParameter("empno");
		List<Empinfo> employ = emprepo.empinfoAll(empno);
		for(int i = 0 ; i < employ.size(); i++) {
			if(employ.get(i).getEmpNo() == Integer.parseInt(empno)) {
				request.setAttribute("empInfo", employ.get(i));
				request.getRequestDispatcher("call.jsp").forward(request, response);
			}
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
