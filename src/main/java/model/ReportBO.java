package model;

import java.util.ArrayList;


public class ReportBO {
private ReportDAO reportDAO = new ReportDAO();
	
	
	public boolean addReport(ReportModel report) {
		return reportDAO.addReport(report);
	}
	
	public ArrayList<ReportModel> listReports() {
		return reportDAO.getReports();
	}
}
