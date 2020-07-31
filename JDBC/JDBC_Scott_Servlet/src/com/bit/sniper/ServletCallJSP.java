package com.bit.sniper;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bit.data.Empinfo;
import com.bit.data.EmpinfoRepository;
import java.util.List;
/**
 * Servlet implementation class ServletCallJSP
 */
@WebServlet(description = "jsp 호출", urlPatterns = { "/jspcall" })
public class ServletCallJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmpinfoRepository employess;
	
	public ServletCallJSP() {
		super();
		employess = new EmpinfoRepository();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		List<Empinfo> employ = employess.empinfoAll();
//		request.setAttribute("allEmployess", employ);
//		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/call.jsp");
//		rd.forward(request, response);
//		
//		String id3 = request.getParameter("id3");
//		int age3 = Integer.parseInt(request.getParameter("age3"));
//		String msg = id3+"님은"+age3+"세 입니다.";
//		request.setAttribute("a", id3);
//		request.setAttribute("age3", age3);
//		request.setAttribute("msg", msg);
//		request.getRequestDispatcher("/call.jsp").forward(request, response);
		
		
	}

}
 