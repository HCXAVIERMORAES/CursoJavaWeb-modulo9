package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		/*Construtuores: � a forma de criar um objeto na memoria do java. Tem-se que estar fora
		 *dele. Sintaxe: classe  vari�vel = new objeto do tipo da classe(). 
		 *EX: Aluno aluno1 = new Aluno();		podem receber nenhum ou v�rios  par�metros.
		 */
		//Aluno aluno1; objeto ainda n�o existe na memoria
		Aluno aluno1 = new Aluno();//aluno j�o
		
		//criando um objeto real na memoria
		Aluno aluno2 = new Aluno();//aluno pedro
		Aluno aluno3 = new Aluno();//aluno alex
		Aluno aluno4 = new Aluno("Maria"); //criando objeto com parametro
		Aluno aluno5 = new Aluno("Jos�", 50);
		/*� o mesmo que estar referenciando um construtor no java*/
	}

}
