package cursojava.classes;

public class Aluno {
	//Atributos do Aluno, ou seja , as caracteristicas do aluno no mundo real
		public String nome; //para acesso direto por outras classes
		public int idade;
		private String dataNascimento; //atributo protegido, acessado apenas por metodos e pela propria classe
		String registroGeral;
		String numeroCpf;
		String nomeMae;
		String nomePai;
		String dataMatricula;
		String nomeEscola;
		String serieMatriculada;
		
		//construtores Aluno aluno4 = new Aluno();
		/*é o mesmo que estar referenciando um construtor no java*/
		public Aluno() {//construtor padrão do java - cria os dados na memoria		
		}
		
		//construtor que recebe paramentro
		public Aluno(String nomePadrao) {// assim se pode inicar os objetos passando o nome
			nome = nomePadrao;
		}
		
		public Aluno(String nomePadrao,int idadePadrao) {// assim se pode inicar os objetos passando o nome
			nome = nomePadrao;
			idade = idadePadrao;
		}

}
