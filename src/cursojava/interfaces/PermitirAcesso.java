package cursojava.interfaces;

public interface PermitirAcesso {

	/* Atributos definidos para implementar Interface */

	/* Essa interface sera nosso contrato de autentica��o */
	public boolean autenticar(String login, String senha); /* Apenas declara��o do metodo */

	public boolean autenticar();
	//

}
