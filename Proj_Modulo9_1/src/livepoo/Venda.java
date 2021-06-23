package livepoo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda { /*é so uma classe, um objeto. A pricipal função de um objeto é organizar os dados*/
	/*Relação 1 para muitos. uma venda tem muitos produtos*/
	private long id;
	private String descricaoVenda;
	private String nomeCliente;
	private String enderecoEntrrega;
	private BigDecimal valorTotal;
	
	//instancindo uma lista
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	/*Metodo para adicionar mais usado quando se desejar fazer varias validaçoes  da lista*/
	public void addProduto( Produto produto) {
		this.listaProdutos.add(produto);//metodo adiciona na lista.pode-se fazer validaçoes antes de adicionar
	}
	
	//metodo para calcular o total da venda
	public double totalVendas() {
		double total = 0.0;
		for (Produto produto : listaProdutos) {
			total += produto.getValor().doubleValue();			
		}
		return total;
	}
	
	//get e set
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricaoVenda() {
		return descricaoVenda;
	}
	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEnderecoEntrrega() {
		return enderecoEntrrega;
	}
	public void setEnderecoEntrrega(String enderecoEntrrega) {
		this.enderecoEntrrega = enderecoEntrrega;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	//toString
	@Override
	public String toString() {
		return "Venda [id= " + id + ", descricao Venda= " + descricaoVenda + ", nome Cliente= " + nomeCliente
				+ ",\n endereco Entrrega= " + enderecoEntrrega + ", valor Total= " + valorTotal + ", lista Produtos= "
				+ listaProdutos + "]";
	}
	
	
	
	
	
	
}
