package main;

import java.lang.Math;
import java.util.Scanner;
import model.Library;

class Main{
	
	static boolean finished = false;
	
	public static void main(String args[]){
		while(Main.finished == false){
			Scanner sc =  new Scanner(System.in);
			System.out.println("1 = Inscription, 2 = Louer un livre, 3 = rendre un livre, 4 = afficher les livres utilisateurs, 5 = rechercher un document 6 = eteindre");
			int resp = sc.nextInt();
			Library myLibrary = new Library();
			if(resp == 1){
				String se = sc.nextLine();
					myLibrary.addMember(se);
				} else if(resp == 2) {
					System.out.println("Nom du livre");
				} else if(resp == 3){
					System.out.println("Nom du livre à rendre");
	
				} else if(resp == 4){
					System.out.println("Nom du membre");
	
				} else if(resp == 5){
					myLibrary.searchDocument();
				} else if(resp == 6){
					System.out.println("Bye");
					Main.finished = true;
				} else {
					System.out.println("La fonction n'existe pas");
			}
		}
			
	}
}