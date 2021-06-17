package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		/*Construtuores: � a forma de criar um objeto na memoria do java. Tem-se que estar fora
		 *dele. Sintaxe: classe  vari�vel = new objeto do tipo da classe(). 
		 *EX: Aluno aluno1 = new Aluno();		podem receber nenhum ou v�rios  par�metros.
		 ************************************************************************************
		 *Aluno aluno1; objeto ainda n�o existe na memoria
		 *************************************************************************************
		 * new Aluno() � uma instancia(cria��o de objeto)
		 * aluno1 � uma refer�ncia para o objeto aluno
		 * **********************************************************************************
		 * Usa-se o ponto final '.' para acessar as caracteristicas do objeto. Para se ter 
		 * acesso aos atributos estes devem ser publicos (public) para serem vistos por outras
		 * classes, ou aatrav�s de metodos, que � o recomendado.
		 * Por patr�o s�o privados(private) ex: aluno1.nome = "Jo�o";*/
		
		//criando um objeto real na memoria
		Aluno aluno1 = new Aluno();//aluno jo�o.
		aluno1.nome = "Jo�o";
		aluno1.idade = 43;
		
		Aluno aluno2 = new Aluno();//aluno pedro
		Aluno aluno3 = new Aluno();//aluno alex
		Aluno aluno4 = new Aluno("Maria"); //criando objeto com parametro
		Aluno aluno5 = new Aluno("Jos�", 50);
		/*� o mesmo que estar referenciando um construtor no java*/
	}

}
