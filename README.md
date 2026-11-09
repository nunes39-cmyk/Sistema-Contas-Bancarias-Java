# 🏦 Sistema de Contas Bancárias em Java

![Java](https://img.shields.io/badge/Java-POO-orange)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen)
![Projeto](https://img.shields.io/badge/Projeto-Acadêmico-blue)

## 📖 Sobre o projeto

Este projeto consiste em uma simulação de operações bancárias desenvolvida em **Java**, com o objetivo de aplicar conceitos fundamentais da **Programação Orientada a Objetos (POO)**.

O sistema demonstra a diferença entre uma conta bancária comum e uma conta especial, utilizando **herança, encapsulamento, sobrescrita de métodos e polimorfismo**.

Foi desenvolvido como atividade acadêmica da disciplina de Linguagem Orientada a Objetos, do curso de Análise e Desenvolvimento de Sistemas.

## ⚙️ Funcionalidades

- Simulação de saques em contas bancárias.
- Verificação de saldo disponível.
- Bloqueio de saques superiores ao saldo da conta comum.
- Definição de limite adicional para contas especiais.
- Possibilidade de utilizar o limite da conta especial.
- Recusa de saques que ultrapassem o saldo somado ao limite.
- Exibição do saldo inicial e final.
- Demonstração prática de polimorfismo.

## 🧩 Estrutura do sistema

### Classe `Conta`

Representa uma conta bancária convencional.

**Principais características:**
- Atributo privado `saldo`.
- Métodos `getSaldo()` e `setSaldo()`.
- Método `sacar()`, que permite retirar dinheiro somente quando existe saldo suficiente.

### Classe `ContaEspecial`

Herda as características da classe `Conta` utilizando `extends`.

**Principais características:**
- Atributo privado `limite`.
- Métodos `getLimite()` e `setLimite()`.
- Sobrescrita do método `sacar()` com `@Override`.
- Permissão para realizar saques utilizando o limite adicional.

### Classe `Main`

Responsável por executar os testes e demonstrar o funcionamento das duas modalidades de conta.

## 💻 Exemplo de execução

**Conta comum**

```text
=== CONTA COMUM ===
Saldo inicial: R$ 500.0
Saque realizado? true
Saldo final: R$ 200.0
```

**Conta especial**

```text
=== CONTA ESPECIAL ===
Saldo inicial: R$ 500.0
Limite adicional: R$ 300.0
Saque realizado? true
Saldo final: R$ -200.0
```

Na conta especial, o saldo negativo representa a utilização de R$ 200,00 do limite disponível.

## 🧠 Conceitos aplicados

| Conceito | Aplicação |
|---|---|
| Encapsulamento | Proteção dos atributos utilizando `private` |
| Herança | `ContaEspecial` herda de `Conta` |
| Polimorfismo | Referência do tipo `Conta` utilizada com um objeto `ContaEspecial` |
| Sobrescrita | Redefinição do método `sacar()` com `@Override` |
| Métodos | Operações de consulta, alteração e saque |
| Condicionais | Verificação das condições para permitir ou recusar saques |

## 🚀 Como executar

**Pré-requisito:** Java JDK instalado no computador.

1. Baixe ou clone este repositório.
2. Certifique-se de que o arquivo principal esteja nomeado como `Main.java`.
3. Abra o terminal na pasta do projeto.
4. Compile o programa:

```bash
javac Main.java
```

5. Execute:

```bash
java Main
```

Também é possível executar o código em compiladores Java online, como o OnlineGDB.

## 📌 Observações

Este é um projeto acadêmico e não representa um sistema bancário real.

Os valores de saldo, limite e saque são definidos diretamente no código para demonstrar o funcionamento dos métodos.

O programa não possui interface gráfica, banco de dados ou cadastro de clientes.

## 📚 Objetivo acadêmico

Atividade da **Unidade 03 — Seção 03**, da disciplina de Linguagem Orientada a Objetos, do curso de Análise e Desenvolvimento de Sistemas da Faculdade Anhanguera.

O objetivo é demonstrar o uso de polimorfismo por meio da implementação de contas bancárias com diferentes regras de saque.

## 👨‍💻 Autor

**Miguel Nunes Ribeiro**

Estudante de Análise e Desenvolvimento de Sistemas.

GitHub: [@nunes39-cmyk](https://github.com/nunes39-cmyk)

---

⭐ Projeto desenvolvido para fins de estudo e prática de Programação Orientada a Objetos em Java.
