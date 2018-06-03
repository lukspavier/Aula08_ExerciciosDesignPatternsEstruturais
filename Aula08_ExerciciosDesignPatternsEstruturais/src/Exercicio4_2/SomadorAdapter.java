package Exercicio4_2;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Lucas Spavier - 816117862 - SI3AN MCA
 *
 */
public class SomadorAdapter extends SomadorExistente implements SomadorEsperado {

	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> list = new ArrayList<>();
		for (int i : vetor) {
			list.add(i);
		}
		return somaLista(list);
	}

}
