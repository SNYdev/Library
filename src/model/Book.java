package model;

public class Book extends Document implements Borrowable{
	String[] author = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P"};
	String[] book = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P"};
	
	public void isAvailable(String test){
		for(String b: book){
			if(b == test){
				System.out.println("Le livre est disponible");
				break;
			} else {
				System.out.println("Le livre n'est pas disponible");
				break;
			}
		}
	}
}