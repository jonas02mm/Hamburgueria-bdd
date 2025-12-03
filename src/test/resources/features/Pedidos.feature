Feature: Registrar pedidos de hambúrguer
  Como cliente da hamburgueria
  Quero registrar meus pedidos
  Para saber o valor total

  Scenario: Adicionar itens ao pedido
    Given que o cliente escolheu "X-Burguer"
    And também escolheu "Refrigerante"
    When o sistema calcula o total
    Then o valor final deve ser 21.0