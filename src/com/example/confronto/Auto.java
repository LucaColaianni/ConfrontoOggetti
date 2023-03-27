package com.example.confronto;

public class Auto {
	
	public String marca;
	public String modello;
	public int annoDiProduzione;
	
	//costruttore
	public Auto(String marca, String modello, int annoDiProduzione) {
		this.marca = marca;
		this.modello = modello;
		this.annoDiProduzione = annoDiProduzione;
	
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if(!(obj instanceof Auto )){
			return false;
		}
		Auto auto = (Auto) obj;
		return auto.marca.equals(marca) && auto.modello.equals(modello) && auto.annoDiProduzione == annoDiProduzione;
	}
}
	