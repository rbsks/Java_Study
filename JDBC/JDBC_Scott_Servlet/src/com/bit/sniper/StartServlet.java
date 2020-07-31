package com.bit.sniper;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.data.Dept;
import com.bit.data.DeptRepository;

/**
 * Servlet implementation class StartServlet
 */
@WebServlet("/")
public class StartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/ goto index.jsp");
		DeptRepository sql = new DeptRepository();
		List<Dept> depts = sql.empinfoAll();
		System.out.println(depts);
		request.setAttribute("depts", depts);
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

}
