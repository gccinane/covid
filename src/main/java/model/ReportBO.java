package model;

import java.util.ArrayList;


public class ReportBO {
private ReportDAO reportDAO = new ReportDAO();
	
	//calls DAO to create report on database
	public boolean addReport(ReportModel report) {
		return reportDAO.addReport(report);
	}
	
	//calls DAO to list all reports on database
	public ArrayList<ReportModel> listReports() {
		return reportDAO.getReports();
	}
}
