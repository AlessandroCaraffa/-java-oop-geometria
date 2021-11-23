package org.generation.italy.geometria;

public class Rettangolo {
	
	int base;
	int altezza;
	
	Rettangolo(){
		base = 1;
		altezza=1;
				
	}
	
	int calcolaArea () {
		 int area= base * altezza;
		 return area;
	}
	
	int calcolaPerimetro () {
		 int Perimetro= (base+altezza)*2;
		 return Perimetro;
	}
	
	
	
	
	
	
	

}
