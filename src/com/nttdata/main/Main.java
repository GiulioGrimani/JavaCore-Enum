package com.nttdata.main;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

import com.nttdata.enumexample.GiornoSettimana;
import com.nttdata.enumexample.GiornoSettimanaCommentato;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * Gli enum
		 * 
		 * La parola "enum" sta per "enumeratore" e viene usata per indicare un insieme
		 * predefinito di valori che non cambia. L'esempio classico e' quello dei giorno
		 * della settimana: sono noti e non cambiano. La dichiarazione di un enum e'
		 * sostanzialmente identica a quella di una qualsiasi classe, ed il suo utilizzo
		 * non differisce di molto da un qualsiasi oggetto
		 */

		GiornoSettimana giorno = GiornoSettimana.SABATO;
		if (giorno == GiornoSettimana.SABATO) {
			System.out.println("yee non si lavora");
		}

		/*
		 * Ogni enum estende implicitamente la classe java.lang.Enum, e per questo ne
		 * eredita attributi e metodi:
		 */

		// il metodo "values()" invocato sull'enum restituisce un array contenente tutti
		// i valori dell'enum, mentre il metodo "ordinal()" invocato sul valore
		// dell'enum restituisce il numero ordinale del valore all'interno dell'enum
		GiornoSettimana[] settimana = GiornoSettimana.values();
		for (GiornoSettimana g : settimana) {
			System.out.println(g.ordinal() + "\t" + g);
		}

		/*
		 * Cosi' come una classe, anche un enum puo' avere degli attributi. Normalmente,
		 * tali attributi esprimono delle informazioni aggiuntive codificate all'interno
		 * di ciascun valore dell'enum, per questo hanno il modificatore "final" e,
		 * raramente, hanno a disposizione getters e setters. Il costruttore, difatti,
		 * normalmente e' privato.
		 */

		for (GiornoSettimanaCommentato gg : GiornoSettimanaCommentato.values()) {
			System.out.println(gg + " : " + gg.livelloFelicita + " - " + gg.commento);
		}

		/*
		 * Data la natura particolare degli enum (insieme predefinito, e quindi con un
		 * determinato ordinamento) i progettisti del linguaggio hanno pensato di creare
		 * delle strutture dati apposite per sfruttare al meglio le ottimizzazioni
		 * possibili. Abbiamo quindi l'EnumMap e l'EnumSet:
		 */

		// L'EnumMap si dichiara cosi':
		Map<GiornoSettimana, String> myEnumMap = new EnumMap<>(GiornoSettimana.class);

		myEnumMap.put(GiornoSettimana.LUNEDI, "Sesso");
		myEnumMap.put(GiornoSettimana.MARTEDI, "Droga");
		myEnumMap.put(GiornoSettimana.MERCOLEDI, "Rock 'n roll");

		for (GiornoSettimana g : myEnumMap.keySet()) {
			String currentValue = myEnumMap.get(g);
			System.out.println(g + "\t" + currentValue);
		}

		System.out.println();

		// Abbiamo diversi modi di dichiarare un EnumSet: usando la funzione range:
		EnumSet<GiornoSettimana> myEnumSet = EnumSet.range(GiornoSettimana.LUNEDI, GiornoSettimana.GIOVEDI);

		for (GiornoSettimana g : myEnumSet) {
			System.out.println(g);
		}

		System.out.println();

		// Usando la funzione allOf:
		Set<GiornoSettimana> myFullEnumSet = EnumSet.allOf(GiornoSettimana.class);

		for (GiornoSettimana g : myFullEnumSet) {
			System.out.println(g);
		}

		System.out.println();

		// Usando la funzione noneOf
		Set<GiornoSettimana> myEmptyEnumSet = EnumSet.noneOf(GiornoSettimana.class);

		myEmptyEnumSet.add(GiornoSettimana.MARTEDI);
		myEmptyEnumSet.add(GiornoSettimana.DOMENICA);
		myEmptyEnumSet.add(GiornoSettimana.GIOVEDI);
		myEmptyEnumSet.add(GiornoSettimana.SABATO);

		for (GiornoSettimana g : myEmptyEnumSet) {
			System.out.println(g);
		}

		/*
		 * Notiamo una caratteristica importante dell'EnumSet: mantiene l'ordine di
		 * inserimento
		 */
	}

}
