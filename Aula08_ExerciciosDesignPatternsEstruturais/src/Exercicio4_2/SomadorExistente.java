package Exercicio4_2;

import java.util.List;

/**
 * 
 * @author Lucas Spavier - 816117862 - SI3AN MCA
 *
 */

public class SomadorExistente {
	public int somaLista(List<Integer> lista) {
		int resultado = 0;
		for (int i : lista) {
			resultado += i;
		}
		return resultado;
	}
}
