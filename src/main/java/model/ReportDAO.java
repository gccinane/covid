package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import service.ConnectionFactory;

public class ReportDAO {
	
	private Connection connection;
	private PreparedStatement preparedStatement;
	
	public ReportDAO() {
		connection = new ConnectionFactory().getConnection();
	}
	
	public boolean addReport(ReportModel report) {
		String sql = "INSERT INTO report(name, description) values(?, ?)";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, report.getName());
			preparedStatement.setString(2, report.getDescription());
			preparedStatement.execute();
			preparedStatement.close();
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public ArrayList<ReportModel> getReports() {
		String sql = "select ID, description, name from report";
		ArrayList<ReportModel> list = new ArrayList<ReportModel>();
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute();
			
			ResultSet response = preparedStatement.getResultSet();
			
			while(response.next()) {
				list.add(new ReportModel(response.getString("name"), response.getString("description")));
				System.out.println("Report: " + response.getString("name") + "-" + response.getString("description"));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<ReportModel>();
		}
	}
}

