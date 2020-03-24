public class Pedido {
	
	private int qtd, qtdMaxima;
	private double valorTotal;
	private Produto[] listaProdutos;
	
	public Pedido() {
		this.qtd = 0;
		this.qtdMaxima = 10;
		this.listaProdutos = new Produto [this.qtdMaxima];
	}
	
	public Pedido(int qtd) {
		this.qtd = 0;
		this.qtdMaxima = qtd;
		this.listaProdutos = new Produto [this.qtdMaxima];
	}
	
	public boolean addProduto(Produto p) {
		if(this.qtd == this.qtdMaxima){
			this.expandeVetor();
		}
			this.listaProdutos[this.qtd] = p;
			this.qtd += 1;
			return true;
		
	}	
	
	public void expandeVetor() {
		this.qtdMaxima *= 2;
		Produto aux[] = new Produto[this.qtdMaxima];
		
		for(int i = 0; i < this.qtd; i++) {
			aux[i] = this.listaProdutos[i];
		}
		
		this.listaProdutos = aux;
	}
	
	public String toString() {
		StringBuilder a = new StringBuilder();
		
		for(int i = 0; i < qtd; i++){
			a.append("Nome: ");
			a.append(this.listaProdutos[i].getNome());
			a.append("\t");
			a.append("Valor: R$");
			a.append(this.listaProdutos[i].getValor());
			a.append("\n");
		}
		return a.toString();
	}
	
}
