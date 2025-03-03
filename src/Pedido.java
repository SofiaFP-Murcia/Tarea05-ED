public class Pedido {
    private Cliente cliente;
    public Pedido(Cliente cliente) {
        this.setCliente(cliente);
    }

    public void procesarPedido(double total, boolean esVip) {
        if (esVip) {
            if (total > 100) {
                double descuento = total * 0.15;
                double precioFinal = total - descuento;
                System.out.println("Pedido VIP aprobado. Total: " + precioFinal + " (descuento aplicado: " + descuento + ")");
            } else {
                System.out.println("Pedido VIP aprobado. Total: " + total);
            }
        } else {
            if (total > 100) {
                double descuento = total * 0.10;
                double precioFinal = total - descuento;
                System.out.println("Pedido aprobado. Total: " + precioFinal + " (descuento aplicado: " + descuento + ")");
            } else {
                System.out.println("Pedido aprobado. Total: " + total);
            }
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
