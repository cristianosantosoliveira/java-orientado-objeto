package cursojava.interfaces;

public interface PermitirAcesso {

	/* Atributos definidos para implementar Interface */

	/* Essa interface sera nosso contrato de autenticação */
	public boolean autenticar(String login, String senha); /* Apenas declaração do metodo */

	public boolean autenticar();
	//

}
