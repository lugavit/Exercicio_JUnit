package carrinho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;

class CarrinhoTest {

    private Carrinho carrinho;

    @BeforeEach
    void setUp() {
        carrinho = new Carrinho();
    }

    @Test
    void startsEmptyWithZeroTotal() {
        assertEquals(0, carrinho.getQtdeItems());
        assertEquals(0.0, carrinho.getValorTotal());
    }

    @Test
    void addsItemsAndCalculatesTheirTotal() {
        carrinho.addItem(new Produto("Book", 25.0));
        carrinho.addItem(new Produto("Game", 40.0));

        assertEquals(2, carrinho.getQtdeItems());
        assertEquals(65.0, carrinho.getValorTotal());
    }

    @Test
    void removesAnExistingItem() throws ProdutoNaoEncontradoException {
        Produto item = new Produto("Book", 25.0);
        carrinho.addItem(item);

        carrinho.removeItem(item);

        assertEquals(0, carrinho.getQtdeItems());
        assertEquals(0.0, carrinho.getValorTotal());
    }

    @Test
    void throwsWhenRemovingAnItemThatIsNotInTheCart() {
        assertThrows(
                ProdutoNaoEncontradoException.class,
                () -> carrinho.removeItem(new Produto("Missing", 10.0)));
        assertEquals(0, carrinho.getQtdeItems());
    }

    @Test
    void emptiesTheCart() {
        carrinho.addItem(new Produto("Book", 25.0));
        carrinho.addItem(new Produto("Game", 40.0));

        carrinho.esvazia();

        assertEquals(0, carrinho.getQtdeItems());
        assertEquals(0.0, carrinho.getValorTotal());
    }
}
