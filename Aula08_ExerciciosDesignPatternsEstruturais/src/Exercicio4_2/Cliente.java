package Exercicio4_2;

/**
 * 
 * @author Lucas Spavier - 816117862 - SI3AN MCA
 *
 */
public class Cliente {
	private SomadorEsperado somador;

	public Cliente(SomadorEsperado somador) {
		this.somador = somador;
	}

	public void executar() {
		int[] vetor = new int[] { 1, 2, 3 };
		int soma = somador.somaVetor(vetor);
		System.out.println("Resultado: " + soma);
	}
}
