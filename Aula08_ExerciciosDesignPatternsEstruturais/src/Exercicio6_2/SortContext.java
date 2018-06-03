package Exercicio6_2;

/**
 * 
 * @author Lucas Spavier - 816117862 - SI3AN MCA
 *
 */

public class SortContext {

	private Sort sort;

	public SortContext(Sort sort) {
		this.sort = sort;
	}

	public int[] sort(int[] v) {
		return sort.sort(v);
	}
}
