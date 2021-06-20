package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

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

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno? ");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento? ");

		// criando um objeto real na memoria
		Aluno aluno1 = new Aluno();// aluno jo�o.
		/*
		 * aluno1.nome = "Jo�o";// para atributo public seria assim. Errado aluno1.idade
		 * = 43;
		 */

		// correto. Com metodo set e get
		// dados do aluno jo�o
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));// convertendo String em inteiro - int.
		aluno1.setDataNascimento(dataNascimento); // atributo protegido, acessado apenas por metodos e pela propria
													// classe
		// passando diretamente
		aluno1.setRegistroGeral(JOptionPane.showInputDialog("Digite o Registro geral do aluno: "));
		aluno1.setNumeroCpf(JOptionPane.showInputDialog("Digite o CPF: "));
		aluno1.setNomeMae(JOptionPane.showInputDialog("Digite o nome da m�e do aluno: "));
		aluno1.setNomePai(JOptionPane.showInputDialog("Digite o nome do pai do aluno: "));
		aluno1.setDataMatricula(JOptionPane.showInputDialog("Digite a matr�cula do aluno: "));
		aluno1.setNomeEscola(JOptionPane.showInputDialog("Digite o nome da escola do aluno: "));
		aluno1.setSerieMatriculada(JOptionPane.showInputDialog("Digite a serie do aluno: "));
		
		/*usando a lista da classe Disciplina */
		Disciplina disciplina1 = new Disciplina();//cria na memoria disciplina1
		disciplina1.setDisciplina("Banco de dados");//nomeia a disciplina1
		disciplina1.setNota(90.0);//acrescenta a nota da disciplina1
		aluno1.getDisciplinas().add(disciplina1);//recupera e adiciona diciplina1 ao aluno1
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matem�tica");
		disciplina2.setNota(80.0);
		aluno1.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(70.0);
		aluno1.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(70.0);
		aluno1.getDisciplinas().add(disciplina4);
		
		/*
		 * notas recebendo valores //e fazendo a convers�o de string para double
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

		// calculando aprova��o
		System.out.println("Resultado: " + aluno1.getAlunoAprovado());
		// ou usando ternarios
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		// USANDO O SEGUNDO M�TODO
		System.out.println("Resultado2: " + aluno1.getAlunoAprovado2());

		System.out.println(aluno1);
		System.out.println("Am�dia do aluno �: " + aluno1.getMediaNota());
		System.out.println("resultado: " + aluno1.getAlunoAprovado2());
		System.out.println(
				"======================== FIM aluno " + aluno1.getNome() + " ====================================");

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
	}

}
