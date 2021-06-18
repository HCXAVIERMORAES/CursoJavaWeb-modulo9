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
		/*aluno1.nome = "João"; para atributo public seria assim. Errado
		aluno1.idade = 43;*/
		
		//correto. Com metodo set e get
		//dados do alluno joão
		aluno1.setNome("João da silva");
		aluno1.setIdade(20);
		aluno1.setDataNascimento("14/05/2001"); //atributo protegido, acessado apenas por 
		aluno1.setRegistroGeral("8.888.445");//metodos e pela propria classe
		aluno1.setNumeroCpf("055.999.666-00");
		aluno1.setNomeMae("Carla");
		aluno1.setNomePai("Marcus Aurelio");
		aluno1.setDataMatricula("30/02/2019");
		aluno1.setNomeEscola("FGv");
		aluno1.setSerieMatriculada("1ª");
		//notas recebendo valores
		aluno1.setNota1(80.5);
		aluno1.setNota2(50.5);
		aluno1.setNota3(65.4);
		aluno1.setNota4(73.5);		
		
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
		
		System.out.println("======================== FIM aluno "+ aluno1.getNome() +" ====================================");
		
		Aluno aluno2 = new Aluno();//aluno pedro
		aluno2.setNome("Pedro Rosa");
		aluno2.setIdade(20);
		aluno2.setDataNascimento("18/10/2001");
		
		System.out.println("O nome é: "+ aluno2.getNome());//o get não se usa em qualquer lugar
		System.out.println("A idade é: "+ aluno2.getIdade());// apena para recuperar o dado
		System.out.println("A data de nascimento é: "+ aluno2.getDataNascimento());
		System.out.println("idem ao aluno 1");
		
		System.out.println("======================== FIM aluno "+ aluno2.getNome() +" ====================================");
		Aluno aluno3 = new Aluno();//aluno alex
		Aluno aluno4 = new Aluno("Maria"); //criando objeto com parametro
		Aluno aluno5 = new Aluno("José", 50);
		/*é o mesmo que estar referenciando um construtor no java*/
	}

}
