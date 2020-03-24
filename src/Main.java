
public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("bolacha", 1.99);
		Produto p2 = new Produto("biscoito", 2.49);
		Produto p3 = new Produto("chocolate", 2.99);
		Produto p4 = new Produto("salgadinho", 2.49);
		Produto p5 = new Produto("pipoca doce", 0.99);
		
		Pedido p = new Pedido(2);
		
		p.addProduto(p1);
		p.addProduto(p2);
		p.addProduto(p3);
		p.addProduto(p4);
		p.addProduto(p5);
		
		System.out.println(p.toString());
	}
}
