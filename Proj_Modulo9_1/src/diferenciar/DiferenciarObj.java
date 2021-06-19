package diferenciar;

import cursojava.classes.Aluno;

public class DiferenciarObj {

	public static void main(String[] args) {
		/*Equals e Hashcode (São para diferenciar objetos)
		 * equals compara objetos e retorna o verdadeiro*/
		//aluno1 aparentimente igual a aluno2
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		aluno1.setNumeroCpf("123");
		Aluno aluno2 = new Aluno();
		
		aluno2.setNome("Alex");
		aluno2.setNumeroCpf("1234");//se mesmo cpf são iguais se cpf diferente o resltado tbm é difernte
		
		if(aluno1.equals(aluno2)){
			System.out.println("alunos iguais");
		} else {
			System.out.println("alunos não são iguais");
		}/*sem geral o equals e Hashcode o resultado é que são diferentes
		  *gerando-os como se gera e no mesmo local que os sets e gets passam a serem iguais 
		  *pois os metodos são sobreescritos
		  *observar os dados que são unicos no sistema 
		  *é bom gera-los tambem junto com os sets e gets*/
		
	}

}
