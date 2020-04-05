package cursojava.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import com.sun.org.apache.xml.internal.utils.IntVector;
import com.sun.org.apache.xpath.internal.operations.Equals;

import cursojava.constantes.StatusAluno;

public class ClasseInicial {

	public static void main(String[] args) {
		/* aluno = referencia */
		/* new Aluno() = instancia (Criação do Objeto)/Construtor */
		/* Agora temos um objeto real na memoria */

		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe o senha");

		if (login.contentEquals("admin") && senha.equals("admin")) {

			List<Aluno> alunos = new ArrayList<Aluno>();
			/*
			 * E´uma lista que dentro dela temos uma chave que identifica uma sequencia de
			 * valores tambem
			 */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int quantidade = 1; quantidade <= 5; quantidade++) {

				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + quantidade + "? ");
			String idade = JOptionPane.showInputDialog("Qual a idade? ");
			String DataNasc = JOptionPane.showInputDialog("Qual a data de nascimento? ");
			String rg = JOptionPane.showInputDialog("Qual o RG? ");
			String cpf = JOptionPane.showInputDialog("Qual o CPF? ");
			String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe? ");
			String nomePai = JOptionPane.showInputDialog("Qual o nome do pai? ");
			String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula? ");
			String serie = JOptionPane.showInputDialog("Qual a serie? ");
			String nomeEscola = JOptionPane.showInputDialog("Qual o nome da Escola? ");

				Aluno aluno1 = new Aluno();

				aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade));
			aluno1.setDataNasc(DataNasc);
			aluno1.setRegistroGeral(rg);
			aluno1.setNumeroCpf(cpf);
			aluno1.setNomeMae(nomeMae);
			aluno1.setNomePai(nomePai);
			aluno1.setDataMatricula(dataMatricula);
			aluno1.setSerieMatriculado(serie);
			aluno1.setNomeEscola(nomeEscola);

				for (int pos = 1; pos <= 1; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Entre com nome da disciplina " + pos + "");
					String notaDisciplina = JOptionPane.showInputDialog("Entre com nota da disciplina " + pos + "");
					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno1.getDisciplinas().add(disciplina);

				}

				int opcao = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

				if (opcao == 0) { // SIM = 0 NAO = 1

					int continuarRemover = 0; // Opção de remoção de varias disciplinas
					int posicao = 1;

					while (continuarRemover == 0) {

						String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1,2,3,4?");
						aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						posicao++;
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");
					}

				}

				alunos.add(aluno1);
			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) { // Separado em Listas
				if (aluno.getAlunoAprovados().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovados().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else if (aluno.getAlunoAprovados().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}

			System.out.println("---------------Lista dos aprovados-------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Resultado " + aluno.getAlunoAprovados());
				System.out.println("Media " + aluno.getMediaNota());
			}

			System.out.println("---------------Lista dos Reprovados-------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Resultado " + aluno.getAlunoAprovados());
				System.out.println("Media " + aluno.getMediaNota());
			}

			System.out.println("---------------Lista dos Recuperação------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Resultado " + aluno.getAlunoAprovados());
				System.out.println("Media " + aluno.getMediaNota());
			}
		}
	}

}
