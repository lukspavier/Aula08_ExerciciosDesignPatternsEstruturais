package Exercicio7_1;
/**
 * 
 * @author Lucas Spavier - 816117862 - SI3AN MCA
 *
 */
public class TransformadorLower extends TransformadorTemplate {

	@Override
	public String transform(String s) {
		return s.toLowerCase();
	}
}
