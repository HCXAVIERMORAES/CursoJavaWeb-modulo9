package clean.principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import clean.classes.Aluno2;
import clean.classes.Disciplina2;
import clean.constan.StatusAlun;

public class Principal {

	public static void main(String[] args) {

		// validação de acesso simples
		String login = JOptionPane.showInputDialog("Qual o seu login? ");
		String senha = JOptionPane.showInputDialog("Qual o seu senha? ");

		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {

			List<Aluno2> alunos = new ArrayList<Aluno2>();

			HashMap<String, List<Aluno2>> maps = new HashMap<String, List<Aluno2>>();

			for (int qtd = 1; qtd <= 1; qtd++) {

				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ? ");
				String idade = JOptionPane.showInputDialog("Qual a idade do aluno? ");
				String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento? ");

				Aluno2 aluno1 = new Aluno2();

				aluno1.setNome(nome);
				aluno1.setIdade(Integer.valueOf(idade));
				aluno1.setIdade(Integer.valueOf(idade));// convertendo String em inteiro -
				aluno1.setDataNascimento(dataNascimento);
				aluno1.setRegistroGeral(JOptionPane.showInputDialog("Digite o Registro geral do aluno: "));
				aluno1.setNumeroCpf(JOptionPane.showInputDialog("Digite o CPF: "));
				aluno1.setNomeMae(JOptionPane.showInputDialog("Digite o nome da mãe do aluno: "));
				aluno1.setNomePai(JOptionPane.showInputDialog("Digite o nome do pai do aluno: "));
				aluno1.setDataMatricula(JOptionPane.showInputDialog("Digite a matrícula do aluno: "));
				aluno1.setNomeEscola(JOptionPane.showInputDialog("Digite o nome da escola do aluno: "));
				aluno1.setSerieMatriculada(JOptionPane.showInputDialog("Digite a serie do aluno: "));

				/* Deixando a lista dinâmica */
				for (int pos = 1; pos <= 1; pos++) {
					// pedindo dados da diciplina
					String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

					Disciplina2 disciplina2 = new Disciplina2();
					disciplina2.setDisciplina(nomeDisciplina);
					disciplina2.setNota(Double.valueOf(notaDisciplina));

					aluno1.getDisciplinas().add(disciplina2);
				}

				/* Removendo disciplinas da lista */
				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
				// O confirm retorna '0' para sim e '1' para não
				if (escolha == 0) {

					int continuarRemove = 0;
					int posicao = 1;

					while (continuarRemove == 0) {

						String disciplinaRemover = JOptionPane
								.showInputDialog("Qual disciplina será removida 1, 2, 3 ou 4 ? ");

						aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						posicao++;
						continuarRemove = JOptionPane.showConfirmDialog(null,
								"Deseja continuar a remover disciplina? ");

					}
				}

				// adicionando a lista de alunos
				alunos.add(aluno1);

			} // fim for lista aluno

			// usando o HashMap
			maps.put(StatusAlun.APROVADO, new ArrayList<Aluno2>());
			maps.put(StatusAlun.RECUPERACAO, new ArrayList<Aluno2>());
			maps.put(StatusAlun.REPROVADO, new ArrayList<Aluno2>());

			// dividindo os alunos nas listas
			for (Aluno2 aluno : alunos) {

				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAlun.APROVADO)) {

					maps.get(StatusAlun.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAlun.RECUPERACAO)) {

					maps.get(StatusAlun.RECUPERACAO).add(aluno);
				} else {
					maps.get(StatusAlun.REPROVADO).add(aluno);
				}

			} // fim foreacht

			// Imprimindo na tela as listas
			System.out.println("============================LISTA DOS APROVADOS===============================");
			for (Aluno2 aluno : maps.get(StatusAlun.APROVADO)) {
				System.out.println("Resultado: " + aluno.getAlunoAprovado2() + ". Aluno(a): " + aluno.getNome()
						+ ", média: " + aluno.getMediaNota());
			}
			System.out.println("============================LISTA DOS REPROVADOS===============================");
			for (Aluno2 aluno : maps.get(StatusAlun.REPROVADO)) {
				System.out.println("Resultado: " + aluno.getAlunoAprovado2() + ". Aluno(a) " + aluno.getNome()
						+ ", média: " + aluno.getMediaNota());
			}
			System.out.println("============================LISTA EM RECUPERAÇÂO===============================");
			for (Aluno2 aluno : maps.get(StatusAlun.RECUPERACAO)) {
				System.out.println("Resultado: " + aluno.getAlunoAprovado2() + ". Aluno(a) " + aluno.getNome()
						+ ", média: " + aluno.getMediaNota());
			}

		} // fim validação
	}

}
