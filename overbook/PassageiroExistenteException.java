
package overbook;

@SuppressWarnings("serial")
public class PassageiroExistenteException extends RuntimeException{

	public PassageiroExistenteException(){
		super("Passageiro já existe na lista deste voo!");
	}
}
