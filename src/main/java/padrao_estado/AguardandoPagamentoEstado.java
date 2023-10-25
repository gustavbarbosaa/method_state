package padrao_estado;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AguardandoPagamentoEstado implements Estado {
    private final Pedido pedido;

    @Override
    public void pago() {
        this.pedido.setEstadoAtual(this.pedido.getPago());
    }

    @Override
    public void enviarPedido() {
        throw new IllegalStateException("O pedido ainda não foi pago!");
    }

    @Override
    public void cancelarPedido() {
        this.pedido.setEstadoAtual(this.pedido.getCancelarPedido());
    }
}
