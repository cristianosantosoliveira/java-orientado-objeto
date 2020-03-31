package cursojava.classes;

import javax.swing.JOptionPane;

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
		String nota1 = JOptionPane.showInputDialog("Digite a nota 1? ");
		String nota2 = JOptionPane.showInputDialog("Digite a nota 2? ");
		String nota3 = JOptionPane.showInputDialog("Digite a nota 3? ");
		String nota4 = JOptionPane.showInputDialog("Digite a nota 4? ");

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
		aluno.setNota1(Double.parseDouble(nota1));
		aluno.setNota2(Double.parseDouble(nota2));
		aluno.setNota3(Double.parseDouble(nota3));
		aluno.setNota4(Double.parseDouble(nota4));

		System.out.println(aluno.toString()); /* Descrição do Objeto na memoria */
		System.out.println("Média da nota é: " + aluno.getMediaNota());
		System.out.println("Resultado é: " + aluno.getAlunoAprovados());
		
	}

}
