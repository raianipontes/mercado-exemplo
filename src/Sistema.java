import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {
		
		Produto leite = new Produto("Leite", "Parmalat");

		Lote lote = new Lote(leite, 10L);
		ProdutoRepository catalogo = new ProdutoRepository();

		System.out.println(leite);
		System.out.println(lote);

		Produto ovos = new Produto("Ovos", "Tamago");
		Produto pao = new Produto("Pão", "padaria");

		System.out.println(ovos);
		System.out.println(pao);

		catalogo.addProduto(pao);
		catalogo.addProduto(ovos);
		catalogo.addProduto(leite);


	}

}
