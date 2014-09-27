package com.rp.observer;

public class Sistema {
	
	public static void main(String[] args) {
		
		AlarmeSonoro as = new AlarmeSonoro();
		AlarmeVisual av = new AlarmeVisual();
		
		Caldeira caldeira = new Caldeira();
		caldeira.adicionaObserver(as);
		caldeira.adicionaObserver(av);
		
		caldeira.setTemperatura(10);
		caldeira.setTemperatura(30);
		caldeira.setTemperatura(50);
		caldeira.setTemperatura(80);
		caldeira.setTemperatura(91);
		caldeira.setTemperatura(100);
	}
	
}
