package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ReportBO;
import model.ReportModel;



@WebServlet("/ReportController")
public class ReportController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReportBO reportBO = new ReportBO();

	public ReportController() {}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		List<ReportModel> lista = reportBO.listReports();
		
		request.setAttribute("lista", lista);
		request.getRequestDispatcher("List.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name"); 
		String description = request.getParameter("description");
		reportBO.addReport(new ReportModel(name, description));
	}
	
}