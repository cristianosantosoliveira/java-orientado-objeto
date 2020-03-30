package cursojava.classes;

public class ClasseInicial {

	public static void main(String[] args) {
		/* aluno = referencia*/
		/* new Aluno() = instancia (Criação do Objeto)/Construtor */
		/* Agora temos um objeto real na memoria*/

		Aluno aluno = new Aluno();
		
		aluno.setNome("Cristiano");
		aluno.setIdade(30);
		aluno.setDataNasc("20/12/2001");
		aluno.setRegistroGeral("48541654-1");
		aluno.setNumeroCpf("557.848.785-45");
		aluno.setNomeMae("Shirlei");
		aluno.setNomePai("José");
		aluno.setDataMatricula("28/04/2018");
		aluno.setSerieMatriculado("8ª Serie");
		aluno.setNomeEscola("Raphael Fagá");
		aluno.setNota1(90);
		aluno.setNota2(80.8);
		aluno.setNota3(45);
		aluno.setNota4(99.6);
		
		System.out.println("Nome é: " + aluno.getNome());
		System.out.println("Idade é: " + aluno.getIdade());
		System.out.println("Nasc é: " + aluno.getDataNasc());
		System.out.println("Média da nota é: " + aluno.getMediaNota());
		System.out.println("Resultado é: " + (aluno.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		System.out.println("Resultado é: " + aluno.getAlunoAprovados());
		
	}

}
