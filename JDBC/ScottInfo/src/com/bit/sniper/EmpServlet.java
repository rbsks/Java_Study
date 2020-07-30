package com.bit.sniper;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bit.data.Empinfo;
import com.bit.data.EmpinfoRepository;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/Emp")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		
		int empno = Integer.parseInt(request.getParameter("empno"));
		EmpinfoRepository empSQL = new EmpinfoRepository();
		Empinfo empInfo = empSQL.empInfo(empno);
		System.out.println(empInfo.getEname());
		request.setAttribute("empInfo", empInfo);
		request.getRequestDispatcher("empinfo.jsp").forward(request, response);

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
