package exemplo;

import java.util.List;

public class ProdutoService {
    ProdutoRepository prodRep;
    LoteRepository loteRep;
    List<Produto> listForProdsLote(String nome) {
        List<Lote> lotes = loteRep.getAll();
        List <Produto> prods = getProdsFromLotes(lotes);
        List <Produto> prodsOk = getProdsByName(nome, prods);
        return listForProdsLote(nome);
    }
    List <Produto> listProdByName(String nome) {
        List<Produto> prods = prodRep.getAll();
        List<Produto> prodsOk = getProdsByName(nome, prods);
        return listProdByName(nome);
    }
}
