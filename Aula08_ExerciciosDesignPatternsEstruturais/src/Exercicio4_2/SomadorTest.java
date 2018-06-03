package Exercicio4_2;

/**
 * 
 * @author Lucas Spavier - 816117862 - SI3AN MCA
 *
 */
public class SomadorTest {
	public static void main(String args[]) {
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
