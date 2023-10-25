package padrao_estado;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PagoEstado implements Estado{
    private final Pedido pedido;

    @Override
    public void pago() {
        this.pedido.setEstadoAtual(this.pedido.getPago());
    }

    @Override
    public void enviarPedido() {

    }

    @Override
    public void cancelarPedido() {

    }
}
