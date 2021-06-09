package model;

public class PersonModel {
	String name;
	int age;
	int id;
	boolean gotCovid;
	String gender;
	String passport_id;
	String toCountry;
	String fromCountry;
	
	PersonModel () {
		
	}
	
	PersonModel(String name, int age, int id, boolean gotCovid, String gender, String passport_id, String toCountry, String fromCountry) {
		setName(name);
		setAge(age);
		setId(id);
		setGotCovid(gotCovid);
		setGender(gender);
		setPassport_id(passport_id);
		setToCountry(toCountry);
		setFromCountry(fromCountry);
	}
	
	//Returns the person큦 name
	public String getName() {
		return name;
	}
	
	//Setter of a person큦 name
	public void setName(String name) {
		this.name = name;
	}
	
	//Returns the person큦 age
	public int getAge() {
		return age;
	}
	
	//Setter of a person큦 age
	public void setAge(int age) {
		this.age = age;
	}

	//Returns the person큦 id
	public int getId() {
		return id;
	}
	
	//Setter of a person큦 id
	public void setId(int id) {
		this.id = id;
	}
	
	//Returns a person큦 covid status
	public boolean isGotCovid() {
		return gotCovid;
	}
	
	//Setter of a person큦 covid status
	public void setGotCovid(boolean gotCovid) {
		this.gotCovid = gotCovid;
	}
	
	//Returns the person큦 gender
	public String getGender() {
		return gender;
	}
	
	//Setter of a person큦 gender
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//Returns the person큦 passport string
	public String getPassport_id() {
		return passport_id;
	}
	
	//Setter of a person큦 passport
	public void setPassport_id(String passport_id) {
		this.passport_id = passport_id;
	}
	
	//Returns the person큦 destination
	public String getToCountry() {
		return toCountry;
	}
	
	//Setter of a person큦 destination
	public void setToCountry(String toCountry) {
		this.toCountry = toCountry;
	}
	
	//Returns the person큦 departed country
	public String getFromCountry() {
		return fromCountry;
	}
	
	//Setter of a person큦 departed country
	public void setFromCountry(String fromCountry) {
		this.fromCountry = fromCountry;
	}
}
