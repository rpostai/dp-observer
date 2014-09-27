package com.rp.observer;

public class Caldeira extends CaldeiraObservable {
	
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
		notificarObservers();
	}
	
}
