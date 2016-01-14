package model;

import java.util.Scanner;

public class Member{
	String name;
	int locBook = 0;
	Status status;
	
	public void setMemberName(String nameTest){
		this.name = nameTest;
		System.out.println("sauvegarde du nom : "+name);
	}

	public String getMemberName(){
		return name;
	}
	
	public void setLocBook(){
		this.locBook++;
		while(this.locBook <= 5){
			Scanner cs = new Scanner(System.in);
			System.out.println("Louer un autre livre Y/N");
			System.out.println(this.locBook);
			String sc = cs.nextLine();
			String resp3 = new String("Y");
			String resp4 = new String("N");
			if(sc.equals(resp3)){
				System.out.println("Nom du livre");
				String sq = cs.nextLine();
			} else if(sc.equals(resp4)) {
				
				break;
			} else {
				System.out.println("Commande invalide");
				break;
			}
			this.locBook++;
		}
	}
	
	public int getLocBook(){
		return this.locBook;
	}
	
	public void isAvailable(){
		
	}
}