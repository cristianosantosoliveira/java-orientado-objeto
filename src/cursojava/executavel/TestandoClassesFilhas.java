package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		aluno.setNome("Cristiano");
		aluno.setNomeEscola("UTFPR");
		aluno.setIdade(16);

		Diretor diretor = new Diretor();
		diretor.setNome("Flávio");
		diretor.setRegistroGeral("5456468748");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setNome("Renato");
		secretario.setExperiencia("Desenvolvimento de Sistemas");
		secretario.setNumeroCpf("85648678974984");
		diretor.setIdade(18);

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario do Aluno = " + aluno.salario());
		System.out.println("Salario do diretor = " + diretor.salario());
		System.out.println("Salario do secretario = " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
	/* Exemplo de polimorfismo, criei um metodo instanciando a 
	 * classe abstrata pessoa */
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = " + pessoa.getNome() + " e o salario é de R$ " + pessoa.salario());
	}

}
