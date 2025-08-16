# Simulador de Carro em Java

Este é um projeto simples de um simulador de carro desenvolvido em Java. Ele permite que o usuário interaja com um carro virtual através de um menu de console, realizando ações como ligar, desligar, acelerar, frear e trocar de marcha.

## Funcionalidades

*   **Ligar e Desligar:** O carro pode ser ligado e desligado.
*   **Aceleração e Desaceleração:** A velocidade do carro pode ser aumentada ou diminuída.
*   **Troca de Marchas:** O usuário pode aumentar e diminuir as marchas do carro.
*   **Movimento:** O carro pode virar para a esquerda e para a direita.
*   **Feedback em Tempo Real:** O sistema fornece feedback constante sobre o estado do carro, como velocidade e marcha atual.

## Como Executar

1.  **Pré-requisitos:**
    *   Java Development Kit (JDK) instalado.

2.  **Compilação:**
    *   Abra um terminal na raiz do projeto.
    *   Compile os arquivos `.java` para a pasta `bin`:
        ```bash
        javac -d bin src/Car.java src/Main.java
        ```

3.  **Execução:**
    *   Execute a classe `Main` a partir da pasta `bin`:
        ```bash
        java -cp bin Main
        ```

## Controles

O programa oferece um menu de opções para controlar o carro:

*   `1. Ligar o carro`
*   `2. Desligar o carro`
*   `3. Aumentar a velocidade`
*   `4. Diminuir a velocidade`
*   `5. Colocar marcha em drive (+)`
*   `6. Reduzir marcha (-)`
*   `7. Marcha atual`
*   `8 - Virar para a esquerda`
*   `9 - Virar para a direita`
*   `10 - Verificar velocidade atual`
*   `0. Sair`
