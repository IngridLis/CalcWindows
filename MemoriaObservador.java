package ads.turma.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	public void valorAlterado(String novoValor);
}