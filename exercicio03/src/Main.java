import Entidade.Cliente;
import Entidade.ItemPedido;
import Entidade.Pedido;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        ItemPedido monitor = new ItemPedido("Monitor 22\"", 750.0);
        ItemPedido teclado = new ItemPedido("Teclado Mecanico", 120.0);
        ItemPedido mouse = new ItemPedido("Mouse Wireless", 110.0);

        Cliente cliente1 = new Cliente("José Leão", "78945612310");
        Cliente cliente2 = new Cliente("Márcia Lira", "65498732110");


        Pedido pedido1 = new Pedido(2210, cliente1, LocalDate.parse("2026-04-10"));

        pedido1.adicionarProduto(monitor, 2);
        pedido1.adicionarProduto(teclado, 1);
        pedido1.adicionarProduto(mouse, 1);

        pedido1.fecharPedido();


        Pedido pedido2 = new Pedido(2215, cliente2, LocalDate.now());

        pedido2.adicionarProduto(teclado, 1);
        pedido2.adicionarProduto(mouse, 1);

        pedido2.fecharPedido();

    }
}
