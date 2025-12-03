package peppa.hamburgueria;

import java.util.HashMap;
import java.util.Map;

public class CardapioService {

    private Map<String, Double> cardapio = new HashMap<>();

    public CardapioService() {
        cardapio.put("X-Burguer", 15.0);
        cardapio.put("X-Salada", 18.0);
        cardapio.put("X-Bacon", 20.0);
        cardapio.put("Refrigerante", 6.0);
        cardapio.put("Batata", 10.0);
    }

    public double buscarPreco(String item) {
        return cardapio.getOrDefault(item, 0.0);
    }
}
