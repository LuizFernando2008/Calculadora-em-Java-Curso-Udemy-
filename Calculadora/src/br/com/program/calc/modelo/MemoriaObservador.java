package br.com.program.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	void valorAlterado(String novoValor);
	
}
