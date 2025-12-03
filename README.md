# Hamburgueria BDD 
### Integrantes da Dupla : 
Jonas Magalhães Miranda - RA 42322378

Este projeto implementa o comportamento de um sistema simples de pedidos de uma hamburgueria utilizando BDD (Behavior Driven Development) com Cucumber, JUnit e Maven.
O objetivo é simular um fluxo de pedido, adicionando itens do cardápio e calculando o valor total do pedido com base no cardápio definido.

### 

## Tecnologias Utilizadas

Java 17
Maven (gerenciamento de dependências)
Cucumber (BDD - Behavior Driven Development)
JUnit (execução dos testes)

## Cenário de Teste: Pedidos

O projeto implementa testes para validar operações relacionadas a pedidos, conforme definido no arquivo Pedidos.feature.

Feature: Sistema de Pedidos
Scenario: Criar um novo pedido
Given que o cliente informa um produto valido
When o pedido é criado
Then o sistema deve registrar o pedido com sucesso

## Arquivos Importantes

Pedidos.feature
Arquivo responsável pela definição dos cenários BDD.

PedidoSteps.java
Contém a implementação dos passos usando anotações @Given, @When, @Then.

RunnerTest.java
Executa os cenários utilizando o Cucumber com JUnit.
