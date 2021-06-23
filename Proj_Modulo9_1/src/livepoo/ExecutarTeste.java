package livepoo;

import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {
		// Agora as classes se transformam em objetos reais
		
		//criando onde colocara os produtos da venda
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Módulo POO");
		produto1.setValor(BigDecimal.valueOf(100.0));
		
		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Módulo de spring rest");
		produto2.setValor(BigDecimal.valueOf(300.0));
		
		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Módulo angular 8");
		produto3.setValor(BigDecimal.valueOf(150.0));
		
		Produto produto4 = new Produto();
		produto4.setId(4L);
		produto4.setNome("Módulo Hibernet");
		produto4.setValor(BigDecimal.valueOf(300.0));
		
		Venda venda = new Venda(); //instanciando, criando venda na memoria
		
		//setando venda e seus atributos
		venda.setDescricaoVenda("Venda curso java");
		venda.setEnderecoEntrrega("Entrega pelo email");
		venda.setId(10L);//Para identificar que é um long
		venda.setNomeCliente("Paulo");
		venda.setValorTotal(BigDecimal.valueOf(197.00));//convertendo para double
		
		venda.getListaProdutos().add(produto1);//adicionando produto na lista de venda
		venda.getListaProdutos().add(produto2);//não da para fazer validações
		venda.addProduto(produto3); //adicionano pelo metodo. darpara fazer validações
		venda.addProduto(produto4);
		
		/*pegar um produto em uma lista de venda e pegra a lista de produtos*/
		for (Produto produto : venda.getListaProdutos()) {
			System.out.println("Descrição do produto: "+ produto);
		}
		
		
		//System.out.println("Descrição da : "+ venda.getDescricaoVenda());
		//usando o tostring passando o objeto direto
		System.out.println("Descrição da : " + venda);
		System.out.println("Descrição da : " + venda.getDescricaoVenda() + "Total: "+ venda.totalVendas());
		
	}

}
