package padrao_estado;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CanceladoEstado implements Estado{
    private final Pedido pedido;

    @Override
    public void pago() {
        this.pedido.setEstadoAtual(this.pedido.getCancelarPedido());
    }

    @Override
    public void enviarPedido() {
        throw new IllegalStateException("O pedido não pode ser enviado pois foi cancelado");
    }

    @Override
    public void cancelarPedido() {
        throw new IllegalStateException("O pedido já foi cancelado");
    }
}
