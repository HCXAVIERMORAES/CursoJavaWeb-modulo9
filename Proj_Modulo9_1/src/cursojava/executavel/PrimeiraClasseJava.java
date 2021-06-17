package cursojava.executavel;

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
		
		//criando um objeto real na memoria
		Aluno aluno1 = new Aluno();//aluno joão.
		aluno1.nome = "João";
		aluno1.idade = 43;
		
		Aluno aluno2 = new Aluno();//aluno pedro
		Aluno aluno3 = new Aluno();//aluno alex
		Aluno aluno4 = new Aluno("Maria"); //criando objeto com parametro
		Aluno aluno5 = new Aluno("José", 50);
		/*é o mesmo que estar referenciando um construtor no java*/
	}

}
