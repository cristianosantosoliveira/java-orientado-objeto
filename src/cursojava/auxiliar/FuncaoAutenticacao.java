package cursojava.auxiliar;

import cursojava.interfaces.PermitirAcesso;

/* Realemente e somente receber alguem que tenha contrato da interface 
 * PermitirAcesso chamar o autenticar */
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
