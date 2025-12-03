package peppa.hamburgueria;

public class PedidoService {

    private double total = 0;

    public void adicionarItem(double preco) {
        total += preco;
    }

    public double getTotal() {
        return total;
    }
}
