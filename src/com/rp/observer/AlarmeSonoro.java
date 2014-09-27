package com.rp.observer;

public class AlarmeSonoro implements ObserverCaldeira {

	@Override
	public void atualizarTemperatura(int temperatura) {
		if (temperatura >= 80 && temperatura < 100) {
			System.out.println("Soar alarme");
		}
	}

}
