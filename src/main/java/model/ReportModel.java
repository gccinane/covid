package model;

public class ReportModel {
	private String name;
	private String description;
	private String id;
	
	public ReportModel() {
		
	}
	
	public ReportModel(String name, String description) {
		setDescription(description);

		setName(name);
	}
	
	//Returns a report큦 name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//Returns a report큦 name
	public String getDescription() {
		return description;
	}
	
	//Setter of a report큦 description
	public void setDescription(String description) {
		this.description = description;
	}
	
	//Returns a report큦 name
	public String getId() {
		return id;
	}
	
	//Setter of a report큦 id
	public void setId(String id) {
		this.id = id;
	}
}
