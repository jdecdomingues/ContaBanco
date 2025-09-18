# Desafio de Projeto: Simulando uma Conta Bancária Através do Terminal

![Java](https://img.shields.io/badge/Java-17%2B-blue?style=for-the-badge&logo=java)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

Este projeto foi desenvolvido como parte do desafio de código "Simulando uma Conta Bancária Através do Terminal" do bootcamp **Santander 2024 - Backend com Java**, oferecido pela [Digital Innovation One (DIO)](https://www.dio.me/).

## 🎯 Objetivo do Desafio

O objetivo principal era criar um programa simples em Java que simulasse a interação com um terminal bancário. O desafio focou em reforçar o aprendizado sobre os seguintes conceitos básicos:

* **Sintaxe Java:** Declaração de variáveis, tipos de dados e estrutura de classes.
* **Entrada e Saída de Dados:** Utilização da classe `Scanner` para receber dados do usuário via terminal.
* **Manipulação de Dados:** Concatenação de strings e formatação de mensagens de saída.

## 🖥️ Funcionalidades

O programa executa as seguintes ações:
1.  Solicita ao usuário que insira o número da conta.
2.  Solicita o número da agência.
3.  Solicita o nome do cliente.
4.  Solicita o saldo inicial da conta.
5.  Ao final, exibe uma mensagem de confirmação com todos os dados inseridos.

## 🛠️ Tecnologias Utilizadas

* **Java 17:** Versão LTS da linguagem utilizada para o desenvolvimento.
* **Biblioteca `java.util.Scanner`:** Para a captura de dados de entrada do usuário no console.

## ▶️ Como Executar o Projeto

Para executar este projeto, você precisará ter o **JDK (Java Development Kit)** instalado em sua máquina.

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/jdecdomingues/ContaBanco.git
    ```

2.  **Navegue até o diretório do código-fonte:**
    ```bash
    cd ContaBanco/src
    ```

3.  **Compile o arquivo Java:**
    ```bash
    javac ContaTerminal.java
    ```

4.  **Execute o programa:**
    ```bash
    java ContaTerminal
    ```

5.  **Interaja com o programa:**
    O terminal solicitará que você insira os dados da conta. Após preencher todas as informações, uma mensagem de confirmação será exibida.

### Exemplo de Interação

```
Por favor, digite o número da Conta:
1021
Por favor, digite o número da Agência:
067-8
Por favor, digite o seu nome:
MARIO ANDRADE
Por favor, digite o seu saldo:
237.48

Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```

---
