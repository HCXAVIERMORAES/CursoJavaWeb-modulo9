package clean.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

public class Aluno2 {
	//codigo sem comentorios
	
		private String nome;
		private int idade;
		private String dataNascimento; 
		private String registroGeral;
		private String numeroCpf;
		private String nomeMae;
		private String nomePai;
		private String dataMatricula;
		private String nomeEscola;
		private String serieMatriculada;

		
		List<Disciplina2> disciplinas = new ArrayList<Disciplina2>();

		// set e get da lista de disciplina
		public void setDisciplinas(List<Disciplina2> disciplinas) {
			this.disciplinas = disciplinas;
		}

		public List<Disciplina2> getDisciplinas() {
			return disciplinas;
		}

		
		public Aluno2() {
		}

		// construtor que recebe paramentro
		public Aluno2(String nomePadrao) {
			nome = nomePadrao;
		}

		public Aluno2(String nomePadrao, int idadePadrao) {
			nome = nomePadrao;
			idade = idadePadrao;
		}

		// GET e SET
		
		// metodo para receber dado
		public void setNome(String nome) {
			this.nome = nome;
		}

		
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

		// metodo média com lista
		public double getMediaNota() {

			Double somaNotas = 0.0;
			// usando um forEacht
			for (Disciplina2 disciplina : disciplinas) {
				somaNotas += disciplina.getNota();
			}
			return somaNotas / disciplinas.size();
		}

		public boolean getAlunoAprovado() {
			double media = this.getMediaNota();
			if (media >= 70) {
				return true;
			} else {
				return false;
			}
		}

		// mesmo método,porém retornando strings é menos usado
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

		// toString. apos a criação de discilina
		@Override
		public String toString() {// colocado \n para quebra de linha e substituido '=' por ':'
			return "Aluno [nome: " + nome + ", idade: " + idade + ", data Nascimento: " + dataNascimento
					+ ", registro Geral: " + registroGeral + ", numero Cpf: " + numeroCpf + ", \nnome Mae: " + nomeMae
					+ ", nome Pai: " + nomePai + ", data Matricula: " + dataMatricula + ", nome Escola: " + nomeEscola
					+ ", serie Matriculada: " + serieMatriculada + ",\n disciplinas: " + disciplinas + "]";
		}
		
		// metodo eguals e hashcode diferente do primeiro código
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((dataMatricula == null) ? 0 : dataMatricula.hashCode());
			result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
			result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
			result = prime * result + idade;
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			result = prime * result + ((nomeEscola == null) ? 0 : nomeEscola.hashCode());
			result = prime * result + ((nomeMae == null) ? 0 : nomeMae.hashCode());
			result = prime * result + ((nomePai == null) ? 0 : nomePai.hashCode());
			result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
			result = prime * result + ((registroGeral == null) ? 0 : registroGeral.hashCode());
			result = prime * result + ((serieMatriculada == null) ? 0 : serieMatriculada.hashCode());
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
			Aluno2 other = (Aluno2) obj;
			if (dataMatricula == null) {
				if (other.dataMatricula != null)
					return false;
			} else if (!dataMatricula.equals(other.dataMatricula))
				return false;
			if (dataNascimento == null) {
				if (other.dataNascimento != null)
					return false;
			} else if (!dataNascimento.equals(other.dataNascimento))
				return false;
			if (disciplinas == null) {
				if (other.disciplinas != null)
					return false;
			} else if (!disciplinas.equals(other.disciplinas))
				return false;
			if (idade != other.idade)
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			if (nomeEscola == null) {
				if (other.nomeEscola != null)
					return false;
			} else if (!nomeEscola.equals(other.nomeEscola))
				return false;
			if (nomeMae == null) {
				if (other.nomeMae != null)
					return false;
			} else if (!nomeMae.equals(other.nomeMae))
				return false;
			if (nomePai == null) {
				if (other.nomePai != null)
					return false;
			} else if (!nomePai.equals(other.nomePai))
				return false;
			if (numeroCpf == null) {
				if (other.numeroCpf != null)
					return false;
			} else if (!numeroCpf.equals(other.numeroCpf))
				return false;
			if (registroGeral == null) {
				if (other.registroGeral != null)
					return false;
			} else if (!registroGeral.equals(other.registroGeral))
				return false;
			if (serieMatriculada == null) {
				if (other.serieMatriculada != null)
					return false;
			} else if (!serieMatriculada.equals(other.serieMatriculada))
				return false;
			return true;
		}


}
