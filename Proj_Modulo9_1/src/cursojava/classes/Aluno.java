package cursojava.classes;

public class Aluno {
	//Atributos do Aluno, ou seja , as caracteristicas do aluno no mundo real
		//public String nome; //para acesso direto por outras classes
		private String nome;//padrão para proteger a variavel de acesso direto
		private int idade;
		private String dataNascimento; //atributo protegido, acessado apenas por metodos e pela propria classe
		private String registroGeral;
		private String numeroCpf;
		private String nomeMae;
		private String nomePai;
		private String dataMatricula;
		private String nomeEscola;
		private String serieMatriculada;
		
		//atributos para calculo de média
		private double nota1;
		private double nota2;
		private double nota3;
		private double nota4;
		
		//gets e sets para media		
		public double getNota1() {
			return nota1;
		}

		public void setNota1(double nota1) {
			this.nota1 = nota1;
		}

		public double getNota2() {
			return nota2;
		}

		public void setNota2(double nota2) {
			this.nota2 = nota2;
		}

		public double getNota3() {
			return nota3;
		}

		public void setNota3(double nota3) {
			this.nota3 = nota3;
		}

		public double getNota4() {
			return nota4;
		}

		public void setNota4(double nota4) {
			this.nota4 = nota4;
		}

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
		
		//GET e SET		
		/*Métodos SETTERS e GETTERS do objeto, onde o SET é para adicionar ou receber dados 
		 * para os atributos e GET é para resgatar ou obter o valor/dado do atributo. Todos os 
		 * objetos em java tem.
		 * public porque tem que ser acessado de qualquer lugar
		 * void porque ele não vai retornar só vai receber valor
		 * this (este) se refere a classe, nome ao atributo, e string nome a variavel que 
		 * receberá  o dado*/
		
		//metodo para receber dado
		public void setNome (String nome) {
			this.nome = nome;
		}
		
		/*O GET é similar ao set pois é publico para ser acessado, deve conter o tipo de dado
		 * retornado (String- texto-, int- intreiro-, etc) a palavra GET seguido da variavel
		 * com inicial maiuscula, o que se deseja retornar com a palavra 'return' seguida da
		 * variavel */
		//metodo que retorna (return) o dado
		public String getNome() {
			return nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public String getRegistroGeral() {
			return registroGeral;
		}

		public void setRegistroGeral(String registroGeral) {
			this.registroGeral = registroGeral;
		}

		public String getNumeroCpf() {
			return numeroCpf;
		}

		public void setNumeroCpf(String numeroCpf) {
			this.numeroCpf = numeroCpf;
		}

		public String getNomeMae() {
			return nomeMae;
		}

		public void setNomeMae(String nomeMae) {
			this.nomeMae = nomeMae;
		}

		public String getNomePai() {
			return nomePai;
		}

		public void setNomePai(String nomePai) {
			this.nomePai = nomePai;
		}

		public String getDataMatricula() {
			return dataMatricula;
		}

		public void setDataMatricula(String dataMatricula) {
			this.dataMatricula = dataMatricula;
		}

		public String getNomeEscola() {
			return nomeEscola;
		}

		public void setNomeEscola(String nomeEscola) {
			this.nomeEscola = nomeEscola;
		}

		public String getSerieMatriculada() {
			return serieMatriculada;
		}

		public void setSerieMatriculada(String serieMatriculada) {
			this.serieMatriculada = serieMatriculada;
		}
		
		//Método que retorna a media do aluno
		public double getMediaNota() {
			return (nota1 + nota2 + nota3 + nota4)/ 4;
		}
		
		
}
