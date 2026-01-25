package hebertesteves.gerenciador_pedidos;

import hebertesteves.gerenciador_pedidos.principal.Principal;
import hebertesteves.gerenciador_pedidos.repository.CategoriaRepository;
import hebertesteves.gerenciador_pedidos.repository.PedidoRepository;
import hebertesteves.gerenciador_pedidos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciadorPedidosApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private PedidoRepository pedidoRepository;

	@Autowired
	private ProdutoRepository produtoRepository;


	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(categoriaRepository, pedidoRepository, produtoRepository);
		principal.exibir();
	}
}
