package com.rp.observer;

import java.util.ArrayList;
import java.util.List;

public class CaldeiraObservable {
	
	protected int temperatura;
	
	private List<ObserverCaldeira> observers = new ArrayList<ObserverCaldeira>();
	
	protected void adicionaObserver(ObserverCaldeira observer) {
		observers.add(observer);
	}
	
	protected void notificarObservers() {
		for (ObserverCaldeira o: observers) {
			o.atualizarTemperatura(temperatura);
		}
	}
	

}
