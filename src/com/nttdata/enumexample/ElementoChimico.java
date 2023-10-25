package com.nttdata.enumexample;

public enum ElementoChimico {

	FERRO("FE", 26),
	IDROGENO("H", 1),
	OSSIGENO("O", 8),
	SODIO("NA", 11),
	ORO("AU", 79);

	public final String simboloChimico;
	public final int numeroAtomico;

	private ElementoChimico(String simboloChimico, int numeroAtomico) {
		this.simboloChimico = simboloChimico;
		this.numeroAtomico = numeroAtomico;
	}

}
