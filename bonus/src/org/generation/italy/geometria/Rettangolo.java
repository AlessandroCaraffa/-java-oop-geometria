package org.generation.italy.geometria;

public class Rettangolo {
	
	int base;
	int altezza;
	
	Rettangolo(int base, int altezza) {
		this.altezza = altezza;
		this.base = base;
		
				
	}
	
	int calcolaArea () {
		return base * altezza;
		 
	}
	
	int calcolaPerimetro () {
		return (base+altezza)*2;
		 
	}
	
	
	
	
	
	
	

}
