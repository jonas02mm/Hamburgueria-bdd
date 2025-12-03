package steps;

import io.cucumber.java.en.*;
import peppa.hamburgueria.CardapioService;
import peppa.hamburgueria.PedidoService;
import org.junit.Assert;

public class PedidoSteps {

    private CardapioService cardapio = new CardapioService();
    private PedidoService pedido = new PedidoService();

    @Given("que o cliente escolheu {string}")
    public void que_o_cliente_escolheu(String item) {
        double preco = cardapio.buscarPreco(item);
        pedido.adicionarItem(preco);
    }

    @Given("também escolheu {string}")
    public void tambem_escolheu(String item) {
        double preco = cardapio.buscarPreco(item);
        pedido.adicionarItem(preco);
    }

    @When("o sistema calcula o total")
    public void o_sistema_calcula_o_total() {
        // Nenhuma lógica necessária aqui para este scenario
    }

    @Then("o valor final deve ser {double}")
    public void o_valor_final_deve_ser(Double esperado) {
        Assert.assertEquals(esperado, pedido.getTotal(), 0.001);
    }
}
