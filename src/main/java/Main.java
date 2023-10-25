import br.edu.catolica.es.initial_state.Pedido;

public class Main {
    public static void main(String[] args) {
        var  pedido = new Pedido();

        pedido.cancelarPedido();
        pedido.enviarPedido();
    }
}