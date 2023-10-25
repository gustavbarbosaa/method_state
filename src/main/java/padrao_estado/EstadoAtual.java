package padrao_estado;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EstadoAtual implements Estado {
    private final Pedido pedido;
    @Override
    public void pago() {

    }

    @Override
    public void enviarPedido() {

    }

    @Override
    public void cancelarPedido() {

    }
}
