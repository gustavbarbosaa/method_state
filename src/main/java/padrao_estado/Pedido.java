package padrao_estado;

import lombok.Data;

@Data
public class Pedido {
    private Estado aguardandoPagamento, pago, cancelarPedido, enviado, estadoAtual;

    public Pedido() {
        this.aguardandoPagamento = new AguardandoPagamentoEstado(this);
        this.pago = new PagoEstado(this);
        this.cancelarPedido = new CanceladoEstado(this);
        this.enviado = new EnviadoEstado(this);
        this.estadoAtual = this.aguardandoPagamento;
    }
}
