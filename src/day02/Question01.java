package day02;

import com.sun.java_cup.internal.runtime.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede ‘e’ harfi 3 kere kullanilmis.
         */
 
		
		java.util.Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle = scan.nextLine().toLowerCase();
		System.out.println("Lutfen bir harf giriniz");
		char harf = scan.next().toLowerCase(0).chatAt(0);
		
		int count = 0;
		
		for(int i = 0; i<cumle.length()-1; i>=; i--) {
			if(cumle.charAt(i) == harf){
				count++;
				
			}
		}
		
		System.out.println("Girdiginiz cumlede" + harf + "harfi" + count + "kac kere kullanilmis5");
		
		
	}

}
