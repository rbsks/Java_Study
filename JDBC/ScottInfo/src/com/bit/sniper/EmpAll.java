package com.bit.sniper;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.data.Empinfo;
import com.bit.data.EmpinfoRepository;

/**
 * Servlet implementation class EmpAll
 */
@WebServlet("/EmpAll")
public class EmpAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmpinfoRepository emprepo;     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpAll() {
        super();
        emprepo = new EmpinfoRepository();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empInfoAll = request.getParameter("EMP");
		List<Empinfo> employ = emprepo.empinfoAll(empInfoAll);
		request.setAttribute("empInfoAll", employ);
		request.getRequestDispatcher("empAll.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
