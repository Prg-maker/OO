package atividade;



public class ControleDeLuz {
	private String id;
	private ContaDeLuz contas[];
	private int qnt_contas;
	
	public void ControleContas() {
		contas = new ContaDeLuz[120];
		qnt_contas = 0 ;
	}
	
	public boolean AddContas(ContaDeLuz c) {
		if(qnt_contas < 120) {
			contas[qnt_contas] = c;
			qnt_contas++;
		}else {
			return false;
			
		}
		return true;
		
	}
	
	public double calcularMediaContas() {
		double soma = 0;
		for(int i = 0 ; i < qnt_contas ; i++) {
				soma += contas[i].getValor();
		}
		
		return soma/qnt_contas;
	}
	
	public double menorConsumo() {
		
		double menor = 0;;
		
		for(int i = 0 ; i < qnt_contas ; i++) {
			menor = Math.min(menor, contas[i].getValor());
		}
		
		return menor;
	}
	
	
}
