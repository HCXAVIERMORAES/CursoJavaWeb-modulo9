package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

public class Aluno {
	// Atributos do Aluno, ou seja , as caracteristicas do aluno no mundo real
	// public String nome; //para acesso direto por outras classes
	private String nome;// padr�o para proteger a variavel de acesso direto
	private int idade;
	private String dataNascimento; // atributo protegido, acessado apenas por metodos e pela propria classe
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculada;

	/*
	 * relacionando disciplina e aluno e com isso consegue-se arrumar o metodo de
	 * media present nessa classe
	 */

	/*
	 * n�o ser� mais usado devido ao acrescimo do list na classe disciplina,
	 * ficando: Disciplina disciplina = new Disciplina();
	 * 
	 * //get e set disciplina public void setDisciplina(Disciplina disciplina) {
	 * this.disciplina = disciplina; }
	 * 
	 * public Disciplina getDisciplina() { return disciplina; }
	 */

	// usando a lista da classe Disciplina, ficando entre '<>'
	List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	// set e get da lista de disciplina
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	// construtores Aluno aluno4 = new Aluno();
	/* � o mesmo que estar referenciando um construtor no java */
	public Aluno() {// construtor padr�o do java - cria os dados na memoria
	}

	// construtor que recebe paramentro
	public Aluno(String nomePadrao) {// assim se pode inicar os objetos passando o nome
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {// assim se pode inicar os objetos passando o nome
		nome = nomePadrao;
		idade = idadePadrao;
	}

	// GET e SET
	/*
	 * M�todos SETTERS e GETTERS do objeto, onde o SET � para adicionar ou receber
	 * dados para os atributos e GET � para resgatar ou obter o valor/dado do
	 * atributo. Todos os objetos em java tem. public porque tem que ser acessado de
	 * qualquer lugar void porque ele n�o vai retornar s� vai receber valor this
	 * (este) se refere a classe, nome ao atributo, e string nome a variavel que
	 * receber� o dado
	 */

	// metodo para receber dado
	public void setNome(String nome) {
		this.nome = nome;
	}

	/*
	 * O GET � similar ao set pois � publico para ser acessado, deve conter o tipo
	 * de dado retornado (String- texto-, int- intreiro-, etc) a palavra GET seguido
	 * da variavel com inicial maiuscula, o que se deseja retornar com a palavra
	 * 'return' seguida da variavel
	 */
	// metodo que retorna (return) o dado
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

	/*
	 * M�todo que retorna a media do aluno. public double getMediaNota() { return
	 * (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() +
	 * disciplina.getNota4()) / 4; } obsoleto pois agora ser� uma lista de
	 * disciplina
	 */

	// metodo m�dia com lista
	public double getMediaNota() {

		Double somaNotas = 0.0;
		// usando um forEacht
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}

	// m�todo para dizer se um aluno esta ou n�o aprovado, logo , um boolean - sim
	// ou n�o.
	/*
	 * O operador this significa que vamos fazer uma chamada para algum m�todo ou
	 * vari�vel dentro do pr�prio objeto
	 */
	// mais usado em sistemas pois fica mais facil de manipular devido ao retorno,
	// true/false
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	// mesmo m�todo,por�m retornando strings � menos usado
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}

		} else {
			return StatusAluno.REPROVADO;
		}
	}

	// metodo eguals e hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		return true;
	}

	// toString. apos a cria��o de discilina
	@Override
	public String toString() {// colocado \n para quebra de linha e substituido '=' por ':'
		return "Aluno [nome: " + nome + ", idade: " + idade + ", data Nascimento: " + dataNascimento
				+ ", registro Geral: " + registroGeral + ", numero Cpf: " + numeroCpf + ", \nnome Mae: " + nomeMae
				+ ", nome Pai: " + nomePai + ", data Matricula: " + dataMatricula + ", nome Escola: " + nomeEscola
				+ ", serie Matriculada: " + serieMatriculada + ",\n disciplinas: " + disciplinas + "]";
	}

}
