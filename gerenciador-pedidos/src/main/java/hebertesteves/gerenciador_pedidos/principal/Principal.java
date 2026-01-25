package hebertesteves.gerenciador_pedidos.principal;

import hebertesteves.gerenciador_pedidos.model.Categoria;
import hebertesteves.gerenciador_pedidos.model.Pedido;
import hebertesteves.gerenciador_pedidos.model.Produto;
import hebertesteves.gerenciador_pedidos.repository.CategoriaRepository;
import hebertesteves.gerenciador_pedidos.repository.PedidoRepository;
import hebertesteves.gerenciador_pedidos.repository.ProdutoRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal {
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private CategoriaRepository categoriaRepository;
    private PedidoRepository pedidoRepository;
    private ProdutoRepository produtoRepository;

    public Principal(CategoriaRepository categoriaRepository, PedidoRepository pedidoRepository, ProdutoRepository produtoRepository) {
        this.categoriaRepository = categoriaRepository;
        this.pedidoRepository = pedidoRepository;
        this.produtoRepository = produtoRepository;
    }

    public void exibir() {
        Categoria categoria = new Categoria("Eletrônicos");
        Pedido pedido = new Pedido(LocalDate.parse("25/01/2026", dtf));
        Produto produto = new Produto("Samsung S25", 3500.00);

        categoriaRepository.save(categoria);
        pedidoRepository.save(pedido);
        produtoRepository.save(produto);
    }
}
