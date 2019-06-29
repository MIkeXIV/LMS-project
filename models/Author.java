package models;

class Author {
	
	private String ID = "NO ID";
	private String Name = "NO AUTHOR";
	
	// do i need these atrributes and constructor
	
	public String getID() {
		return this.id;
	}
	public void setID() {
		this.ID = ID;
	}
	public String getName() {
		return this.name;
	}
	public void setName() {
		this.Name = Name;
	}
	
	public Author() {}
	
	public Author(String ID, String Name) {
		this.ID = ID;
		this.Name = Name;
	}
	
}
