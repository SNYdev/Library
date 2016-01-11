package model;

public class Member{
	String name;
	String[] locBook = {""};
	Status status;
	
	public void setMemberName(String name){
		this.name = name;
		System.out.println("sauvegarde du nom : "+name);
	}

	public String getMemberName(){
		return name;
	}
	
	public void setLocBook(String tabAdd){
		
	}
	
	public String[] getLocBook(){
		return locBook;
	}
	
	public void isAvailable(){
		
	}
}