package atividade;

public class ContaDeLuz {
	
	// os atributos da conta de luz, 
	private String data_da_leitura, data_do_pagamento_da_conta;
	private double quantidade_de_KW, valor;
	
	// os atributos precisam ser usados pelo os metodos
	// e para a conta é necessario cadastrar
	
	public void ContaDeLuz(String data_da_leitura,String data_do_pagamento_da_conta, double valor, double quantidade_de_KW) {
		this.data_da_leitura = data_da_leitura;
		this.valor = valor;
		this.quantidade_de_KW = quantidade_de_KW;
		this.data_do_pagamento_da_conta = data_do_pagamento_da_conta;
	}
	
	public double getValor() {
		return valor;
	}
	public String getData_da_leitura() {
		return data_da_leitura;
	}
	
	public double getQuantidade_de_KW() {
		return quantidade_de_KW;
	}
}
