package com.bit.sniper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.data.Dept;
import com.bit.data.DeptRepository;
import com.bit.data.Empinfo;
import com.bit.data.EmpinfoRepository;

/**
 * Servlet implementation class EmpCombo
 */
@WebServlet("/EmpCombo")
public class EmpCombo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmpinfoRepository emprepo;  
	private DeptRepository depts;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public EmpCombo() {
        super();
        emprepo = new EmpinfoRepository();
        depts = new DeptRepository();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empCombo = request.getParameter("deptno");
		System.out.println(empCombo);
		List<Empinfo> employ = emprepo.empCombo(empCombo);
		Dept dept = depts.empinFind(empCombo);
		request.setAttribute("depts", dept);
		request.setAttribute("empCombo", employ);
		request.getRequestDispatcher("empCombo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

}
