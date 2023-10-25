package padrao_estado;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EnviadoEstado implements Estado{
    private final Pedido pedido;

    @Override
    public void pago() {
        throw new IllegalStateException("Pedido já foi pago!");
    }

    @Override
    public void enviarPedido() {
        throw new IllegalStateException("Pedido já foi enviado!");
    }

    @Override
    public void cancelarPedido() {
        this.pedido.setEstadoAtual(this.pedido.getCancelarPedido());
    }
}
