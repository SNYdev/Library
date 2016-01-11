package main;

import java.lang.Math;
import java.util.Scanner;
import model.Library;

class Main{
	
	static boolean finished = false;
	
	public static void main(String args[]){
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("1 = Inscription, 2 = Louer un livre, 3 = rendre un livre, 4 = afficher les livres utilisateurs, 5 = rechercher un document");
		int resp = sc.nextInt();
		while(Main.finished == false){	
			if(resp == 1){
				System.out.println("Nom du membre");
				String se = sc.nextLine();
				} else if(resp == 2) {
					
					
				} else if(resp == 3){
					
				} else if(resp == 4){
				
				} else if(resp == 5){
					
			} else {
				System.out.println("La fonction n'existe pas");
			}
		}
	}
}