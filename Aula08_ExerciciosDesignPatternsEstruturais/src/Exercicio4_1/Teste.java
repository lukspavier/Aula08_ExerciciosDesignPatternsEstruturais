package Exercicio4_1;

import java.util.HashMap;

/**
 * 
 * @author Lucas Spavier - 816117862 - SI3AN MCA
 *
 */
public class Teste {

	public static void main(String[] args) {
		int i[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		HashMap<Integer, Integer> m = HashMapAdapter.matrixToHashMap(i);

		System.out.println(m.toString());

	}

}
