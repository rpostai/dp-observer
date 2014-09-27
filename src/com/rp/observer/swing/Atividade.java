package com.rp.observer.swing;

import java.util.Observable;

public class Atividade extends Observable {

	private Status status;

	public Atividade() {
		this.status = Status.AGUARDANDO;
	}

	public void setStatus(Status status) {
		this.status = status;
		notifyObservers();
	}

	public static enum Status {
		AGUARDANDO, EM_EXECUCAO, BLOQUEADA, CONCLUIDA
	}
}
