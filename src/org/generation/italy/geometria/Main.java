package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		Rettangolo rettangolo1 = new Rettangolo();
		
		
		System.out.print("Base : ");
		rettangolo1.altezza = scan.nextInt();
		System.out.print("Altezza : ");
		rettangolo1.base = scan.nextInt();

		
		System.out.println("Perimetro : " + rettangolo1.calcolaPerimetro());
		System.out.println("Area : " + rettangolo1.calcolaArea());
		
		
		
		
		
		
		
		
		
		
		scan.close();

	}

}
