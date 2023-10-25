package com.nttdata.enumexample;

public enum GiornoSettimanaCommentato {

	/*
	 * E' prassi dichiarare eventuali attributi dell'enum come final poiche' non e'
	 * desiderabile che vengano cambiati dall'esterno. L'ordine all'interno del
	 * costruttore definisce anche l'ordine dei valori dato agli attributi di
	 * ciascun valore dell'enum (tra le parentesi tonde)
	 */

	LUNEDI(-10, "Sopprimetemi"),
	MARTEDI(-5, "Aiuto"),
	MERCOLEDI(0, "Vedo una luce in fondo al tunnel"),
	GIOVEDI(5, "Inizio a pensare al futuro"),
	VENERDI(9, "Il sapore della liberta'"),
	SABATO(10, "LA VITA E' BELLA!"),
	DOMENICA(0, "Lasciami dormire");

	public final int livelloFelicita;
	public final String commento;

	private GiornoSettimanaCommentato(int livelloFelicita, String commento) {
		this.livelloFelicita = livelloFelicita;
		this.commento = commento;
	}

}
