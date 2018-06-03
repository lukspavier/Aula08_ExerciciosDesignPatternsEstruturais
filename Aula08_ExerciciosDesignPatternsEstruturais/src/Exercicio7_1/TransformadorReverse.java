package Exercicio7_1;

/**
 * 
 * @author Lucas Spavier - 816117862 - SI3AN MCA
 *
 */
public class TransformadorReverse extends TransformadorTemplate {

	@Override
	public String transform(String s) {
		String newS = "";
		char[] aux = s.toCharArray();
		for (int i = aux.length - 1; i > -1; i--) {
			newS += aux[i];
		}
		return newS;
	}
}
