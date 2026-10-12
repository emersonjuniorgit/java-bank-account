# 🏦 Sistema Bancário em Java

## 📌 Sobre o Projeto

O projeto consiste em uma aplicação bancária desenvolvida em Java, executada pelo terminal, que simula operações básicas de uma conta bancária e aplica regras de negócio específicas.

A aplicação permite cadastrar uma pessoa, criar uma conta a partir de um depósito inicial e realizar operações financeiras por meio de um menu interativo.

## 🎯 Finalidade

O objetivo é praticar os fundamentos da linguagem Java e os conceitos de Programação Orientada a Objetos (POO), aplicando-os na construção de uma aplicação prática.

O desenvolvimento também busca exercitar o raciocínio lógico, a organização do código e a implementação de regras de negócio.

## ⚙️ Funcionalidades

- **Cadastro de pessoa:** recebe o nome e a idade do usuário.
- **Consulta de saldo:** exibe o saldo atual da conta.
- **Consulta de cheque especial:** apresenta informações sobre o cheque especial e seu limite.
- **Depósito:** permite adicionar valores ao saldo da conta.
- **Saque:** verifica a disponibilidade de saldo antes de realizar a operação.
- **Pagamento de boletos:** verifica a disponibilidade de saldo antes de efetuar o pagamento.
- **Verificação de cheque especial:** consulta a condição implementada para a conta.
- **Menu interativo:** permite selecionar operações e encerrar o programa.

## 💰 Regras de Negócio

- A idade informada deve estar entre 18 e 100 anos, inclusive.
- A conta bancária é criada a partir de um depósito inicial.
- Depósitos de até R$ 500,00 adicionam R$ 50,00 ao cheque especial.
- Depósitos acima de R$ 500,00 adicionam 50% do valor depositado ao cheque especial.
- Saques superiores ao saldo disponível são recusados.
- Pagamentos de boletos com saldo insuficiente são recusados.
- O programa possui um método para calcular uma taxa de 20% relacionada ao cheque especial.

## 🛠️ Tecnologia Utilizada

- Java

## 🧱 Estrutura do Projeto

```text
src/
├── Main.java
└── entities/
    ├── Pessoa.java
    └── ContaBancaria.java
```

### Organização das Classes

**Main.java**

Responsável pela interação com o usuário, pela leitura dos dados e pelo controle do menu de operações.

**Pessoa.java**

Representa a pessoa associada à conta bancária, armazenando nome e idade e disponibilizando métodos relacionados a esses atributos.

**ContaBancaria.java**

Representa a conta bancária e reúne os atributos e métodos relacionados ao saldo, ao cheque especial e às operações financeiras.

## 📚 Conceitos Praticados

- Classes e objetos.
- Encapsulamento.
- Construtores.
- Atributos e métodos.
- Métodos com parâmetros e valores de retorno.
- Relacionamento entre objetos.
- Estruturas condicionais (`if/else`).
- Estrutura de seleção (`switch`).
- Laço de repetição (`do-while`).
- Entrada de dados pelo terminal.
- Implementação de regras de negócio.

## ▶️ Como Executar

### Pré-requisitos

- JDK instalado.
- Git instalado.
- IDE compatível com Java, como IntelliJ IDEA.

### Clonar o Repositório

Abra o terminal e execute:

```bash
git clone https://github.com/emersonjuniorgit/java-bank-account.git
```

Entre na pasta do projeto:

```bash
cd java-bank-account
```

### Executar a Aplicação

1. Abra o projeto no IntelliJ IDEA.
2. Configure o JDK.
3. Localize a classe `Main.java`.
4. Execute o método `main()`.
5. Informe os dados solicitados e utilize o menu interativo para acessar as operações bancárias.

## 👨‍💻 Contexto de Desenvolvimento

Este projeto foi desenvolvido como parte dos meus estudos em Java, com foco na consolidação dos fundamentos da linguagem e na aplicação prática dos conceitos de Programação Orientada a Objetos.

A implementação representa uma etapa do meu aprendizado, permitindo praticar a criação de classes, a organização de métodos e a tradução de requisitos em código.

---

**Projeto educacional desenvolvido para praticar Java e Programação Orientada a Objetos.**