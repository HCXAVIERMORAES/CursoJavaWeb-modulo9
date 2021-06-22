package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		/*
		 * Construtuores: � a forma de criar um objeto na memoria do java. Tem-se que
		 * estar fora dele. Sintaxe: classe vari�vel = new objeto do tipo da classe().
		 * EX: Aluno aluno1 = new Aluno(); podem receber nenhum ou v�rios par�metros.
		 ************************************************************************************
		 * Aluno aluno1; objeto ainda n�o existe na memoria
		 *************************************************************************************
		 * new Aluno() � uma instancia(cria��o de objeto) aluno1 � uma refer�ncia para o
		 * objeto aluno
		 * *****************************************************************************
		 * ***** Usa-se o ponto final '.' para acessar as caracteristicas do objeto.
		 * Para se ter acesso aos atributos estes devem ser publicos (public) para serem
		 * vistos por outras classes, ou aatrav�s de metodos, que � o recomendado. Por
		 * patr�o s�o privados(private) ex: aluno1.nome = "Jo�o";
		 */

		/*
		 * Entrada de dado pelo teclado por variavel direta -
		 * aluno1.setRegistroGeral(JOptionPane.
		 * showInputDialog("Digite o Registro geral do aluno: "));
		 */

		// valida��o de acesso simples
		String login = JOptionPane.showInputDialog("Qual o seu login? ");
		String senha = JOptionPane.showInputDialog("Qual o seu senha? ");

		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {

			/* Aplicando a lista em aluno */
			List<Aluno> alunos = new ArrayList<Aluno>();// instanciando lista de alunos

			/*
			 * HashMap: � uma lista que dentro dela temos uma chave que identifica uma
			 * sequ�ncia de valores tamb�m
			 */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			/*
			 * com HashMap as 3 lista n�o ser�o mais necessarias // dividindo a lista de
			 * alunos em aprovados, recupera��o e reprovados. List<Aluno> alunosAprovados =
			 * new ArrayList<Aluno>(); List<Aluno> alunosRecuperacao = new
			 * ArrayList<Aluno>(); List<Aluno> alunosReprovados = new ArrayList<Aluno>();
			 */

			for (int qtd = 1; qtd <= 1; qtd++) { // percorrendo lista de alunos

				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ? ");
				// String idade = JOptionPane.showInputDialog("Qual a idade do aluno? ");
				// String dataNascimento = JOptionPane.showInputDialog("Qual a data de
				// nascimento? ");

				// criando um objeto real na memoria
				Aluno aluno1 = new Aluno();// aluno jo�o.
				/*
				 * aluno1.nome = "Jo�o";// para atributo public seria assim. Errado aluno1.idade
				 * = 43;
				 */

				// correto. Com metodo set e get
				// dados do aluno jo�o
				aluno1.setNome(nome);
				/*
				 * aluno1.setIdade(Integer.valueOf(idade));// convertendo String em inteiro -
				 * int. aluno1.setDataNascimento(dataNascimento); // atributo protegido,
				 * acessado apenas por metodos e pela propria // classe // passando diretamente
				 * aluno1.setRegistroGeral(JOptionPane.
				 * showInputDialog("Digite o Registro geral do aluno: "));
				 * aluno1.setNumeroCpf(JOptionPane.showInputDialog("Digite o CPF: "));
				 * aluno1.setNomeMae(JOptionPane.
				 * showInputDialog("Digite o nome da m�e do aluno: "));
				 * aluno1.setNomePai(JOptionPane.
				 * showInputDialog("Digite o nome do pai do aluno: "));
				 * aluno1.setDataMatricula(JOptionPane.
				 * showInputDialog("Digite a matr�cula do aluno: "));
				 * aluno1.setNomeEscola(JOptionPane.
				 * showInputDialog("Digite o nome da escola do aluno: "));
				 * aluno1.setSerieMatriculada(JOptionPane.
				 * showInputDialog("Digite a serie do aluno: "));
				 */

				/* Deixando a lista din�mica */
				for (int pos = 1; pos <= 1; pos++) {
					// pedindo dados da diciplina
					String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

					Disciplina disciplina = new Disciplina();// instancia Disciplina
					disciplina.setDisciplina(nomeDisciplina);// setando em disciplina o nome
					disciplina.setNota(Double.valueOf(notaDisciplina));// converte d string para
					// double e seta em disciplina

					// adiciona em aluno1 na lista de disciplinas a disciplina setada
					aluno1.getDisciplinas().add(disciplina);
				}

				/* Removendo disciplinas da lista */
				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
				// O confirm retorna '0' para sim e '1' para n�o
				if (escolha == 0) {
					/* para continuar a remover disciplina. Usa-se o while */
					int continuarRemove = 0;
					int posicao = 1;

					while (continuarRemove == 0) {

						String disciplinaRemover = JOptionPane
								.showInputDialog("Qual disciplina ser� removida 1, 2, 3 ou 4 ? ");
						/*
						 * (Integer.valueOf(disciplinaRemover)[converte a string em um objeto
						 * integer].intValue()[ converte o objeto integer em um inteiro para ser usado
						 * pelo index da lista] e o - posicao[� para que seja feita a conta para se
						 * adeguar ao index que come�a por '0' na lista)
						 */
						aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);// remove
																												// da
						posicao++; // lista
						continuarRemove = JOptionPane.showConfirmDialog(null,
								"Deseja continuar a remover disciplina? ");

					}
				}

				/*
				 * usando a lista da classe Disciplina , em um meetodo n�o din�mico Disciplina
				 * disciplina1 = new Disciplina();//cria na memoria disciplina1
				 * disciplina1.setDisciplina("Banco de dados");//nomeia a disciplina1
				 * disciplina1.setNota(90.0);//acrescenta a nota da disciplina1
				 * aluno1.getDisciplinas().add(disciplina1);//recupera e adiciona diciplina1 ao
				 * aluno1
				 * 
				 * Disciplina disciplina2 = new Disciplina();
				 * disciplina2.setDisciplina("Matem�tica"); disciplina2.setNota(80.0);
				 * aluno1.getDisciplinas().add(disciplina2);
				 * 
				 * Disciplina disciplina3 = new Disciplina();
				 * disciplina3.setDisciplina("Geografia"); disciplina3.setNota(70.0);
				 * aluno1.getDisciplinas().add(disciplina3);
				 * 
				 * Disciplina disciplina4 = new Disciplina();
				 * disciplina4.setDisciplina("Java Web"); disciplina4.setNota(70.0);
				 * aluno1.getDisciplinas().add(disciplina4); /*
				 * 
				 * /* notas recebendo valores //e fazendo a convers�o de string para double
				 * aluno1.setDisciplina1(JOptionPane.showInputDialog("Disciplina 1? "));
				 * aluno1.setNota1(Double.parseDouble(JOptionPane.
				 * showInputDialog("Digite  nota do aluno: "))); antes de criar a classe
				 * disciplina
				 */

				/*
				 * apos cria��o da classe disciplina, pega o aluno, resgata, pega a disciplina
				 * (getDisciplina()) e seta a
				 * disciplina(setDisciplina1(JOptionPane.showInputDialog("Disciplina 1? "))) e a
				 * nota (setNota1(Double.parseDouble(JOptionPane.showInputDialog("msg: ")));)
				 */
				/*
				 * como foi gerado uma lista na classe Disciplina esse c�digo fica obsoleto
				 * aluno1.getDisciplina().setDisciplina1(JOptionPane.
				 * showInputDialog("Disciplina 1? ")); aluno1.getDisciplina()
				 * .setNota1(Double.parseDouble(JOptionPane.
				 * showInputDialog("Digite nota da disciplina1: ")));
				 * aluno1.getDisciplina().setDisciplina2(JOptionPane.
				 * showInputDialog("Disciplina 2? ")); aluno1.getDisciplina()
				 * .setNota2(Double.parseDouble(JOptionPane.
				 * showInputDialog("Digite nota da disciplina2: ")));
				 * aluno1.getDisciplina().setDisciplina3(JOptionPane.
				 * showInputDialog("Disciplina 3? ")); aluno1.getDisciplina()
				 * .setNota3(Double.parseDouble(JOptionPane.
				 * showInputDialog("Digite nota da disciplina3: ")));
				 * aluno1.getDisciplina().setDisciplina4(JOptionPane.
				 * showInputDialog("Disciplina 4? ")); aluno1.getDisciplina()
				 * .setNota4(Double.parseDouble(JOptionPane.
				 * showInputDialog("Digite nota da disciplina4: ")));
				 */

				// mostrando os dados de Jo�o
				/*
				 * System.out.println("O nome �: "+ aluno1.getNome());//o get n�o se usa em
				 * qualquer lugar System.out.println("A idade �: "+ aluno1.getIdade());// apena
				 * para recuperar o dado System.out.println("A data de nascimento �: "+
				 * aluno1.getDataNascimento()); System.out.println("O RG �: "+
				 * aluno1.getRegistroGeral()); System.out.println("O CPF �: "+
				 * aluno1.getNumeroCpf()); System.out.println("O nome da m�e �: "+
				 * aluno1.getNomeMae()); System.out.println("O nome do pai �: "+
				 * aluno1.getNomePai()); System.out.println("A matricula �: "+
				 * aluno1.getDataMatricula()); System.out.println("O nome da escola �: "+
				 * aluno1.getNomeEscola()); System.out.println("A serie matriculada �: "+
				 * aluno1.getSerieMatriculada()); //mostrando media com 2 casas decimais no
				 * printf onde % � um coringa onde entra a variavel
				 * System.out.printf("A m�dia das notas s�o: %.2f \n", aluno1.getMediaNota());
				 */
				// adicionando a lista de alunos
				alunos.add(aluno1);

			} // fim for lista aluno

			// usando o HashMap
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());// inicializando a chave para recuperar no foreacht
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			// dividindo os alunos nas listas
			for (Aluno aluno : alunos) {
				// copmparando a resposta com a classe statica. se aprovado adiciona a lista de
				// aprovados
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					// alunosAprovados.add(aluno);// adiciona na lista aprovado. listas apagadas
					// com hashmap
					maps.get(StatusAluno.APROVADO).add(aluno);// recupera o status e adiciona na lista de aluno
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					// alunosRecuperacao.add(aluno);
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {// aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)
					// alunosReprovados.add(aluno);// reprovados
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}

			} // fim foreacht

			// Imprimindo na tela as listas
			System.out.println("============================LISTA DOS APROVADOS===============================");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Resultado: " + aluno.getAlunoAprovado2() + ". Aluno(a): " + aluno.getNome()
						+ ", m�dia: " + aluno.getMediaNota());
			}
			System.out.println("============================LISTA DOS REPROVADOS===============================");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Resultado: " + aluno.getAlunoAprovado2() + ". Aluno(a) " + aluno.getNome()
						+ ", m�dia: " + aluno.getMediaNota());
			}
			System.out.println("============================LISTA EM RECUPERA��O===============================");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Resultado: " + aluno.getAlunoAprovado2() + ". Aluno(a) " + aluno.getNome()
						+ ", m�dia: " + aluno.getMediaNota());
			}

			// varrendo alista de alunos
			/*
			 * for (Aluno aluno : alunos) { //procurando um nome na lista e dadndo as
			 * informa��es if (aluno.getNome().equalsIgnoreCase("Alex")) {
			 * System.out.println(aluno);// descri��o do objeto na memoria
			 * System.out.println("A m�dia do aluno �: " + aluno.getMediaNota());
			 * System.out.println("resultado: " + aluno.getAlunoAprovado2());
			 * System.out.println("======================== FIM aluno " + aluno.getNome() +
			 * " ===================================="); break; } }
			 */
			/*
			 * // removendo aluno na lista for (Aluno aluno : alunos) { if
			 * (aluno.getNome().equalsIgnoreCase("Alex")) { alunos.remove(aluno); break; }
			 * else { System.out.println(aluno);// descri��o do objeto na memoria
			 * System.out.println("A m�dia do aluno �: " + aluno.getMediaNota());
			 * System.out.println("resultado: " + aluno.getAlunoAprovado2());
			 * System.out.println("======================== FIM aluno " + aluno.getNome() +
			 * " ===================================="); } }
			 * 
			 * // imprimindo os alunos que sobrarm na lista for (Aluno aluno : alunos)
			 * {//lista de aluno System.out.println("Aluno(s) que sobra(m): ");
			 * System.out.println(aluno.getNome());
			 * System.out.println("Materias do aluno: ");
			 * 
			 * for (Disciplina disciplina : aluno.getDisciplinas()) {//na disciplina pegar
			 * as disciplinas do aluno System.out.println(disciplina.getDisciplina()); } }
			 */

			// percorrendo lista por posi�oes
			/*
			 * for (int pos = 0; pos < alunos.size(); pos++) { Aluno aluno =
			 * alunos.get(pos);
			 * 
			 * // fazendo troca de aluno por index if
			 * (aluno.getNome().equalsIgnoreCase("alex")) { // instancia-se um novo aluno
			 * Aluno trocar = new Aluno(); trocar.setNome("aluno foi trocado");// troca-se
			 * todos os campos pois � um novo aluno
			 * 
			 * Disciplina disciplina = new Disciplina();// instancia-se uma nova disciplina
			 * disciplina.setDisciplina("Matematica"); disciplina.setNota(96.0);
			 * 
			 * // adicionando a disciplina trocada na lista de disciplina
			 * trocar.getDisciplinas().add(disciplina);
			 * 
			 * // adicionando o aluno trocado alunos.set(pos, trocar); // substituindo o
			 * aluno na variavel usada para imprimir na tela aluno = alunos.get(pos); }
			 * 
			 * System.out.println("Aluno " + aluno.getNome());
			 * System.out.println("A m�dia do aluno �: " + aluno.getMediaNota());
			 * System.out.println("resultado: " + aluno.getAlunoAprovado2());
			 * System.out.println( "======================== FIM aluno " + aluno.getNome() +
			 * " ===================================="); // percorrendo a lista de discplina
			 * do aluno for (Disciplina disc : aluno.getDisciplinas()) {
			 * System.out.println("Materia: " + disc.getDisciplina() + " nota: " +
			 * disc.getNota()); System.out.println("======================== FIM aluno " +
			 * aluno.getNome() + " ===================================="); } }
			 */

			/*
			 * obsoleto // calculando aprova��o System.out.println("Resultado: " +
			 * aluno1.getAlunoAprovado()); // ou usando ternarios
			 * System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" :
			 * "Reprovado")); // USANDO O SEGUNDO M�TODO System.out.println("Resultado2: " +
			 * aluno1.getAlunoAprovado2());
			 */

			/*
			 * Aluno aluno2 = new Aluno();//aluno pedro
			 * aluno2.setNome(JOptionPane.showInputDialog("Digite o nome do aluno2: "));
			 * aluno2.setIdade(Integer.valueOf(JOptionPane.
			 * showInputDialog("Digite a idade do aluno2: ")));
			 * aluno2.setDataNascimento(JOptionPane.
			 * showInputDialog("Digite a data de nascimento do aluno2: ")); //atributo
			 * protegido, acessado apenas por metodos e pela propria classe
			 * aluno2.setRegistroGeral(JOptionPane.
			 * showInputDialog("Digite o Registro geral do aluno2: "));
			 * aluno2.setNumeroCpf(JOptionPane.showInputDialog("Digite o CPF do aluno2: "));
			 * aluno2.setNomeMae(JOptionPane.
			 * showInputDialog("Digite o nome da m�e do aluno2: "));
			 * aluno2.setNomePai(JOptionPane.
			 * showInputDialog("Digite o nome do pai do aluno2: "));
			 * aluno2.setDataMatricula(JOptionPane.
			 * showInputDialog("Digite a matr�cula do aluno2: "));
			 * aluno2.setNomeEscola(JOptionPane.
			 * showInputDialog("Digite o nome da escola do aluno2: "));
			 * aluno2.setSerieMatriculada(JOptionPane.
			 * showInputDialog("Digite a serie do aluno2: "));
			 * aluno2.setNota1(Double.parseDouble(JOptionPane.
			 * showInputDialog("Digite a 1� nota do aluno2: ")));
			 * aluno2.setNota2(Double.parseDouble(JOptionPane.
			 * showInputDialog("Digite a 1� nota do aluno2: ")));
			 * aluno2.setNota3(Double.parseDouble(JOptionPane.
			 * showInputDialog("Digite a 1� nota do aluno2: ")));
			 * aluno2.setNota4(Double.parseDouble(JOptionPane.
			 * showInputDialog("Digite a 1� nota do aluno2: ")));
			 * 
			 * //saida de dados com o toString System.out.println(aluno2);//mostra o objeto
			 * pode ou n�o ter o .toString System.out.println("Am�dia do aluno �: "+
			 * aluno2.getMediaNota());//media System.out.println("resultado: "+
			 * aluno2.getAlunoAprovado2());
			 * 
			 * System.out.println("======================== FIM aluno "+ aluno2.getNome()
			 * +" ====================================");
			 * 
			 * /* Aluno aluno3 = new Aluno();//aluno alex Aluno aluno4 = new Aluno("Maria");
			 * //criando objeto com parametro Aluno aluno5 = new Aluno("Jos�", 50);
			 */
			/* � o mesmo que estar referenciando um construtor no java */

			// toString. Descri��o do objeto na memoria
			/*
			 * Aluno aluno = new Aluno(); System.out.println(aluno.toString());//pode ou n�o
			 * ter .tostring
			 */

		} // fim valida��o
	}

}
