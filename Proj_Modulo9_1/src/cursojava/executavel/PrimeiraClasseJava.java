package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		/*Construtuores: É a forma de criar um objeto na memoria do java. Tem-se que estar fora
		 *dele. Sintaxe: classe  variável = new objeto do tipo da classe(). 
		 *EX: Aluno aluno1 = new Aluno();		podem receber nenhum ou vários  parâmetros.
		 */
		//Aluno aluno1; objeto ainda não existe na memoria
		Aluno aluno1 = new Aluno();//aluno jão
		
		//criando um objeto real na memoria
		Aluno aluno2 = new Aluno();//aluno pedro
		Aluno aluno3 = new Aluno();//aluno alex
		Aluno aluno4 = new Aluno("Maria"); //criando objeto com parametro
		Aluno aluno5 = new Aluno("José", 50);
		/*é o mesmo que estar referenciando um construtor no java*/
	}

}
