package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		Rettangolo rettangolo1 = new Rettangolo();
		rettangolo1.altezza = scan.nextInt();
		rettangolo1.base = scan.nextInt();

		System.out.println(rettangolo1.calcolaArea());
		System.out.println(rettangolo1.calcolaPerimetro());
		
		
		
		
		
		
		
		
		
		
		scan.close();

	}

}
