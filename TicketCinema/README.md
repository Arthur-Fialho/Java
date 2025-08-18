# TicketCinema

Este é um simples programa em Java para gerenciar a venda de ingressos de cinema.

## Visão Geral

O programa define uma estrutura básica para diferentes tipos de ingressos, incluindo ingressos normais, meia-entrada e pacotes família.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `src/`: Contém o código-fonte Java.
  - `Ticket.java`: Classe abstrata que representa um ingresso.
  - `HalfEntry.java`: Representa um ingresso de meia-entrada.
  - `FamilyTicket.java`: Representa um ingresso família com desconto para grupos.
  - `Main.java`: Classe principal para demonstrar o uso das classes de ingresso.
- `bin/`: Contém os arquivos de classe compilados.
- `lib/`: Contém as bibliotecas (atualmente vazia).

## Como Compilar e Executar

### Pré-requisitos

- Java Development Kit (JDK) instalado.

### Compilação

Para compilar os arquivos-fonte, navegue até o diretório raiz do projeto e execute o seguinte comando:

```bash
javac -d bin src/*.java
```

### Execução

Para executar o programa, use o seguinte comando a partir do diretório raiz:

```bash
java -cp bin Main
```

## Tipos de Ingressos

- **Ingresso Normal**: Um ingresso com preço padrão.
- **Meia-Entrada**: Um ingresso que custa metade do preço de um ingresso normal.
- **Ingresso Família**: Um pacote de ingressos que oferece um desconto de 5% na compra de 4 ou mais ingressos.

## Exemplo de Uso

A classe `Main.java` contém exemplos de como criar e usar cada tipo de ingresso:

```java
public class Main {

    public static void main(String[] args) {
        
        // Exemplo de uso das classes de Ingresso
        FamilyTicket familyTicket = new FamilyTicket(4);
        familyTicket.setMovieName("Vingadores: Ultimato");
        familyTicket.setIsDubbed("Sim");
        System.out.println(familyTicket);

        HalfEntry halfEntry = new HalfEntry("A Origem", "Não");
        System.out.println(halfEntry);

        // como criar um ingresso normal
        Ticket regularTicket = new Ticket(20, "Matrix", "Sim") {
            @Override
            public String toString() {
                return "RegularTicket{" +
                        "value=" + getValue() +
                        ", movieName='" + getMovieName() + ''' +
                        ", isDubbed='" + getIsDubbed() + ''' +
                        '}';
            }
        };
        System.out.println(regularTicket); 
    }
}
```
