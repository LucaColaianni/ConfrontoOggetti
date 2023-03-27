package com.example.confronto;

public class Main {

	public static void main(String[] args) {
		
		   Auto auto1 = new Auto("Fiat", "Panda", 2020);
		    Auto auto2= new Auto("Fiat", "Panda", 2020);

		    if (auto1.equals(auto2)) {
		        System.out.println("Le auto sono uguali");
		    } else {
		        System.out.println("Le auto sono diverse");
		    }
		}
		
	}


