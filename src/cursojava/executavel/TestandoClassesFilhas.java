package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		aluno.setNome("Cristiano");
		aluno.setNomeEscola("UTFPR");

		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("5456468748");

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Desenvolvimento de Sistemas");
		secretario.setNumeroCpf("85648678974984");

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

	}

}
