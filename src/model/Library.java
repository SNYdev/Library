package model;

import model.Member;
import model.Magazine;
import model.Document;
import java.util.Scanner;

public class Library{
	
	public void addMember(String name){
		System.out.println("Nom du membre");
		Scanner cs = new Scanner(System.in);
		String addN = cs.nextLine(); 
		Member newMember = new Member();
		newMember.setMemberName(addN);
	}
	
	public static void addDocument(){
		System.out.println("okokeee");
	}
	
	public static void addHardware(){
		
	}
	
	public static void showBorrowed(){
	
	}
	
	public void searchDocument(){
		System.out.println("Document à rechercher");
		Scanner cs = new Scanner(System.in);
		String sDoc = cs.nextLine();
		Book myBook = new Book();
		myBook.isAvailable(sDoc);
	}
}