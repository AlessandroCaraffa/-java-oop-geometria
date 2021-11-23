package org.generation.italy.geometria;

public class Rettangolo {
	
	int base;
	int altezza;
	
	Rettangolo(){
		base = 1;
		altezza=1;
				
	}
	
	int calcolaArea () {
		return base * altezza;
		 
	}
	
	int calcolaPerimetro () {
		return (base+altezza)*2;
		 
	}
	
	
	
	
	
	
	

}
