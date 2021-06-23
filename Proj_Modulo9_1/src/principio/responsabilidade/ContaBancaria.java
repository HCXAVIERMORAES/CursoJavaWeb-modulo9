package principio.responsabilidade;

public class ContaBancaria {
	/*O princ�pio da responsabilidade de um objeto: este tem que fazer o processamento dentro dele pr�prio deste que 
	 * tudo o que ele precisa esteja dentro dele EX:*/
	
	private String descricao;
	private double saldo = 8000;
	
	//metodo de soma
	public void soma100Reais() {
		saldo += 100; //tudo que se precisa esta dentro do objeto	
	}
	
	public void diminui100Reais() {
		saldo -= 100; 	
	}
	
	public void sacarDinheiro(double sacar) {//para sacar passa-se por par�metro o valor sacado
		saldo -= sacar;
	}
	
	public void depositarDinheiro(double deposito) {//para depositar passa-se por par�metro o valor a se depositar
		saldo += deposito;
	}
	
	//construtore
	//retornar para o usuario o saldo
	public double getSaldo() {
		return saldo;
	}
	
	//set a descri��o 
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//retornar a descri���o
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
	
	
	
}
