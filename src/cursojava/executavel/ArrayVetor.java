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

		/*----------------------------------------------------------------------------------*/

		Aluno[] arrayAlunos = new Aluno[1];

		arrayAlunos[0] = aluno;

		for (int pos = 0; pos < arrayAlunos.length; pos++) {
			System.out.println("Nome do aluno: " + arrayAlunos[pos].getNome());

			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina: " + d.getDisciplina());

				for (int posnota = 0; posnota < arrayAlunos.length; posnota++) {
					System.out.println("A nota é: " + (posnota + 1) + " é igual a " + d.getNota()[posnota]);
				}
			}
		}

		/*----------------------------------------------------------------------------------*/
		System.out.println("----------------Dados do Aluno-----------------------");
		System.out.println("Nome do Aluno = " + aluno.getNome() + " Inscrito no curso da " + aluno.getNomeEscola());
		for (Disciplina disc : aluno.getDisciplinas()) {
			System.out.println("----------------Disciplina do Aluno------------------");
			System.out.println("Disciplinas: " + disc.getDisciplina());
			System.out.println("----------------Notas das Disciplinas----------------");

			double maiorNota = 0;
			double menorNota = 0;

			for (int i = 0; i < disc.getNota().length; i++) {
				System.out.println("Nota do " + (i + 1) + "º Bimestre" + " é igual " + disc.getNota()[i]);

				if (maiorNota == 0) {
					maiorNota = disc.getNota()[i];
				} else {
					if (disc.getNota()[i] > maiorNota) {
						maiorNota = disc.getNota()[i];
					}
				}

				if (menorNota == 0) {
					menorNota = disc.getNota()[i];
				} else {
					if (disc.getNota()[i] < menorNota) {
						menorNota = disc.getNota()[i];
					}
				}
			}
			System.out.println("-------------Maior Notas das Disciplinas-------------");
			System.out.println("Maior nota da Disciplina " + disc.getDisciplina() + " é " + maiorNota);

			System.out.println("-------------Menor Notas das Disciplinas-------------");
			System.out.println("Menor nota da Disciplina " + disc.getDisciplina() + " é " + menorNota);

		}

		/*----------------------------------------------------------------------------------*/

	}
}