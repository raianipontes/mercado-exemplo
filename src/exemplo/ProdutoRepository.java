package exemplo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutoRepository {
    private Map<String, Produto> catalogo;

    public ProdutoRepository() {
        this.catalogo = new HashMap<String, Produto>();

    }
    public void addProduto(Produto p) {
        catalogo.put(p.getId(), p).getId();
    }

    public void updateProduto(String idProduto, String novoNome, String novoFabricante) {
        Produto produto = catalogo.get(idProduto);

        produto.setNome(novoNome);
        produto.setFabricante(novoFabricante);
    }

    public String removeProduto(String idProduto) {
        return catalogo.remove(idProduto).getId();
    }

    public Produto getProduto(String idProduto) {
        return catalogo.get(idProduto);
    }

    public List<Produto>getProdsByName(String nome) {
        List<Produto> prods = new ArrayList<Produto>();
        for (Produto p: catalogo.values()) {
            if (p.getNome().contains(nome)) {
                prods.add(p);
            }
        }
        return prods;
    }
}
