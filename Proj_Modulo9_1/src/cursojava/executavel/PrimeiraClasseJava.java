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
		/*aluno1.nome = "Jo�o"; para atributo public seria assim. Errado
		aluno1.idade = 43;*/
		
		//correto. Com metodo set e get
		//dados do alluno jo�o
		aluno1.setNome("Jo�o da silva");
		aluno1.setIdade(20);
		aluno1.setDataNascimento("14/05/2001"); //atributo protegido, acessado apenas por 
		aluno1.setRegistroGeral("8.888.445");//metodos e pela propria classe
		aluno1.setNumeroCpf("055.999.666-00");
		aluno1.setNomeMae("Carla");
		aluno1.setNomePai("Marcus Aurelio");
		aluno1.setDataMatricula("30/02/2019");
		aluno1.setNomeEscola("FGv");
		aluno1.setSerieMatriculada("1�");
		//notas recebendo valores
		aluno1.setNota1(80.5);
		aluno1.setNota2(50.5);
		aluno1.setNota3(65.4);
		aluno1.setNota4(73.5);		
		
		//mostrando os dados de Jo�o
		System.out.println("O nome �: "+ aluno1.getNome());//o get n�o se usa em qualquer lugar
		System.out.println("A idade �: "+ aluno1.getIdade());// apena para recuperar o dado
		System.out.println("A data de nascimento �: "+ aluno1.getDataNascimento());
		System.out.println("O RG �: "+ aluno1.getRegistroGeral());
		System.out.println("O CPF �: "+ aluno1.getNumeroCpf());
		System.out.println("O nome da m�e �: "+ aluno1.getNomeMae());
		System.out.println("O nome do pai �: "+ aluno1.getNomePai());
		System.out.println("A matricula �: "+ aluno1.getDataMatricula());
		System.out.println("O nome da escola �: "+ aluno1.getNomeEscola());
		System.out.println("A serie matriculada �: "+ aluno1.getSerieMatriculada());
		//mostrando media com 2 casas decimais no printf onde % � um coringa onde entra a variavel
		
		System.out.printf("A m�dia das notas s�o: %.2f \n", aluno1.getMediaNota());
		
		System.out.println("======================== FIM aluno "+ aluno1.getNome() +" ====================================");
		
		Aluno aluno2 = new Aluno();//aluno pedro
		aluno2.setNome("Pedro Rosa");
		aluno2.setIdade(20);
		aluno2.setDataNascimento("18/10/2001");
		
		System.out.println("O nome �: "+ aluno2.getNome());//o get n�o se usa em qualquer lugar
		System.out.println("A idade �: "+ aluno2.getIdade());// apena para recuperar o dado
		System.out.println("A data de nascimento �: "+ aluno2.getDataNascimento());
		System.out.println("idem ao aluno 1");
		
		System.out.println("======================== FIM aluno "+ aluno2.getNome() +" ====================================");
		Aluno aluno3 = new Aluno();//aluno alex
		Aluno aluno4 = new Aluno("Maria"); //criando objeto com parametro
		Aluno aluno5 = new Aluno("Jos�", 50);
		/*� o mesmo que estar referenciando um construtor no java*/
	}

}
