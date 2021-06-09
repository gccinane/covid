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
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
