package cursojava.classes;

import javax.swing.JOptionPane;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class ClasseInicial {

	public static void main(String[] args) {
		/* aluno = referencia */
		/* new Aluno() = instancia (Criação do Objeto)/Construtor */
		/* Agora temos um objeto real na memoria */

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Qual a idade? ");
		String DataNasc = JOptionPane.showInputDialog("Qual a data de nascimento? ");
		String rg = JOptionPane.showInputDialog("Qual o RG? ");
		String cpf = JOptionPane.showInputDialog("Qual o CPF? ");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe? ");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai? ");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula? ");
		String serie = JOptionPane.showInputDialog("Qual a serie? ");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da Escola? ");

		Aluno aluno = new Aluno();

		aluno.setNome(nome);
		aluno.setIdade(Integer.valueOf(idade));
		aluno.setDataNasc(DataNasc);
		aluno.setRegistroGeral(rg);
		aluno.setNumeroCpf(cpf);
		aluno.setNomeMae(nomeMae);
		aluno.setNomePai(nomePai);
		aluno.setDataMatricula(dataMatricula);
		aluno.setSerieMatriculado(serie);
		aluno.setNomeEscola(nomeEscola);

		for (int pos = 1; pos <= 2; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Entre com nome da disciplina "+pos+"");
			String notaDisciplina = JOptionPane.showInputDialog("Entre com nota da disciplina "+pos+"");
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno.getDisciplinas().add(disciplina);
			
		}

		System.out.println(aluno.toString()); // Descrição do Objeto na memoria /
		System.out.println("Média da nota é: " + aluno.getMediaNota());
		System.out.println("Resultado é: " + aluno.getAlunoAprovados());

	}

}
