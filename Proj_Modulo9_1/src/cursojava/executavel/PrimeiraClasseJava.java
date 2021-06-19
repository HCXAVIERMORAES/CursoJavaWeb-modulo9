package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		/*Construtuores: É a forma de criar um objeto na memoria do java. Tem-se que estar fora
		 *dele. Sintaxe: classe  variável = new objeto do tipo da classe(). 
		 *EX: Aluno aluno1 = new Aluno();		podem receber nenhum ou vários  parâmetros.
		 ************************************************************************************
		 *Aluno aluno1; objeto ainda não existe na memoria
		 *************************************************************************************
		 * new Aluno() é uma instancia(criação de objeto)
		 * aluno1 é uma referência para o objeto aluno
		 * **********************************************************************************
		 * Usa-se o ponto final '.' para acessar as caracteristicas do objeto. Para se ter 
		 * acesso aos atributos estes devem ser publicos (public) para serem vistos por outras
		 * classes, ou aatravés de metodos, que é o recomendado.
		 * Por patrão são privados(private) ex: aluno1.nome = "João";*/
		
		/*Entrada de dado pelo teclado
		 * por variavel
		 * direta - aluno1.setRegistroGeral(JOptionPane.showInputDialog("Digite o Registro geral do aluno: "));
		 * */
		
	    String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno? ");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento? ");
				
		//criando um objeto real na memoria
		Aluno aluno1 = new Aluno();//aluno joão.
		/*aluno1.nome = "João";// para atributo public seria assim. Errado
		aluno1.idade = 43;*/
		
		//correto. Com metodo set e get
		//dados do aluno joão
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));//convertendo String em inteiro - int.
		aluno1.setDataNascimento(dataNascimento); //atributo protegido, acessado apenas por metodos e pela propria classe 
		//passando diretamente 
		aluno1.setRegistroGeral(JOptionPane.showInputDialog("Digite o Registro geral do aluno: "));
		aluno1.setNumeroCpf(JOptionPane.showInputDialog("Digite o CPF: "));
		aluno1.setNomeMae(JOptionPane.showInputDialog("Digite o nome da mãe do aluno: "));
		aluno1.setNomePai(JOptionPane.showInputDialog("Digite o nome do pai do aluno: "));
		aluno1.setDataMatricula(JOptionPane.showInputDialog("Digite a matrícula do aluno: "));
		aluno1.setNomeEscola(JOptionPane.showInputDialog("Digite o nome da escola do aluno: "));
		aluno1.setSerieMatriculada(JOptionPane.showInputDialog("Digite a serie do aluno: "));
		//notas recebendo valores
		//e fazendo a conversão de string para double
		aluno1.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota do aluno: ")));
		aluno1.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota do aluno: ")));
		aluno1.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota do aluno: ")));
		aluno1.setNota4(Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota do aluno: ")));		
		
		//mostrando os dados de João
		System.out.println("O nome é: "+ aluno1.getNome());//o get não se usa em qualquer lugar
		System.out.println("A idade é: "+ aluno1.getIdade());// apena para recuperar o dado
		System.out.println("A data de nascimento é: "+ aluno1.getDataNascimento());
		System.out.println("O RG é: "+ aluno1.getRegistroGeral());
		System.out.println("O CPF é: "+ aluno1.getNumeroCpf());
		System.out.println("O nome da mãe é: "+ aluno1.getNomeMae());
		System.out.println("O nome do pai é: "+ aluno1.getNomePai());
		System.out.println("A matricula é: "+ aluno1.getDataMatricula());
		System.out.println("O nome da escola é: "+ aluno1.getNomeEscola());
		System.out.println("A serie matriculada é: "+ aluno1.getSerieMatriculada());
		//mostrando media com 2 casas decimais no printf onde % é um coringa onde entra a variavel
		System.out.printf("A média das notas são: %.2f \n", aluno1.getMediaNota());
		
		//calculando aprovação
		System.out.println("Resultado: " + aluno1.getAlunoAprovado());
		// ou usando ternarios
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		//USANDO O SEGUNDO MÉTODO	
		System.out.println("Resultado2: " + aluno1.getAlunoAprovado2());
		
		System.out.println("======================== FIM aluno "+ aluno1.getNome() +" ====================================");
		
		Aluno aluno2 = new Aluno();//aluno pedro
		aluno2.setNome(JOptionPane.showInputDialog("Digite o nome do aluno2: "));
		aluno2.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Digite a idade do aluno2: ")));
		aluno2.setDataNascimento(JOptionPane.showInputDialog("Digite a data de nascimento do aluno2: ")); //atributo protegido, acessado apenas por metodos e pela propria classe 
		aluno2.setRegistroGeral(JOptionPane.showInputDialog("Digite o Registro geral do aluno2: "));
		aluno2.setNumeroCpf(JOptionPane.showInputDialog("Digite o CPF do aluno2: "));
		aluno2.setNomeMae(JOptionPane.showInputDialog("Digite o nome da mãe do aluno2: "));
		aluno2.setNomePai(JOptionPane.showInputDialog("Digite o nome do pai do aluno2: "));
		aluno2.setDataMatricula(JOptionPane.showInputDialog("Digite a matrícula do aluno2: "));
		aluno2.setNomeEscola(JOptionPane.showInputDialog("Digite o nome da escola do aluno2: "));
		aluno2.setSerieMatriculada(JOptionPane.showInputDialog("Digite a serie do aluno2: "));
		aluno2.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota do aluno2: ")));
		aluno2.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota do aluno2: ")));
		aluno2.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota do aluno2: ")));
		aluno2.setNota4(Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota do aluno2: ")));
		
		//saida de dados com o toString
		System.out.println(aluno2);//mostra o objeto pode ou não ter o .toString
		System.out.println("Amédia do aluno é: "+ aluno2.getMediaNota());//media
		System.out.println("resultado: "+ aluno2.getAlunoAprovado2());
		
		System.out.println("======================== FIM aluno "+ aluno2.getNome() +" ====================================");
		/*
		Aluno aluno3 = new Aluno();//aluno alex
		Aluno aluno4 = new Aluno("Maria"); //criando objeto com parametro
		Aluno aluno5 = new Aluno("José", 50);*/
		/*é o mesmo que estar referenciando um construtor no java*/
		
		//toString. Descrição do objeto na memoria
		Aluno aluno = new Aluno();
		System.out.println(aluno.toString());//pode ou não ter .tostring
	}

}
