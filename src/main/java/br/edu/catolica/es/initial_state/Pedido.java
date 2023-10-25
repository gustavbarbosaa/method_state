package br.edu.catolica.es.initial_state;

public class Pedido {
    private Estado estado;

    public Pedido() {
        this.estado = Estado.AGUARDANDO_PAGAMENTO;
    }

    public void pago() {
        if (this.estado.equals(Estado.AGUARDANDO_PAGAMENTO)) {
            this.estado = Estado.PAGO;
        } else {
            System.out.println("Pedido aguardando pagamento!");
        }
    }

    public void cancelarPedido() {
        if (this.estado.equals(Estado.AGUARDANDO_PAGAMENTO)) {
            this.estado = Estado.CANCELADO;
        } else if (this.estado.equals(Estado.PAGO)) {
            this.estado = Estado.PAGO;
        } else {
            System.out.println("Pedido cancelado");
        }
    }

    public void enviarPedido() {
        if (this.estado.equals(Estado.PAGO)) {
            this.estado = Estado.ENVIADO;
        } else {
            System.out.println("Pedido não foi enviado, pague safado!");
        }
    }
}
