package com.rp.observer;

public class AlarmeVisual implements ObserverCaldeira {

	@Override
	public void atualizarTemperatura(int temperatura) {
		if (temperatura > 90) {
			System.out.println("Ativar alarme visual");
		}
	}

}
