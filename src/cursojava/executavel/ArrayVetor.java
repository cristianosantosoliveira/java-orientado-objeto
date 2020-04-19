package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
//Usado para executar o codigo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array sempre deve ter a quantidade de posições definidas

		/* Criação do Aluno */
		Aluno aluno = new Aluno();
		aluno.setNome("Cristiano Oliveira");
		aluno.setNomeEscola("UTFPR");

		/* Criação da Disciplina */
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");

		double[] notas = { 9.8, 7.1, 5.9, 8.6 };

		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);

		System.out.println("Nome do Aluno = " + aluno.getNome() + "Inscrito no curso " + aluno.getNomeEscola());
		for (Disciplina disc : aluno.getDisciplinas()) {
			System.out.println("----------------Disciplina do Aluno------------------");
			System.out.println("Disciplinas: " + disc.getDisciplina());
			System.out.println("----------------Notas das Disciplinas----------------");

			for (int i = 0; i < disc.getNota().length; i++) {
				System.out.println("Nota do " + (i + 1) + "º Bimestre" + " é igual " + disc.getNota()[i]);
			}
		}

	}
}