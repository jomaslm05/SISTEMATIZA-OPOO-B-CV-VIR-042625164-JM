Calculadora IMC - Java POO
Descrição

Sistema de cálculo de Índice de Massa Corporal (IMC) desenvolvido em Java utilizando os principais conceitos de Programação Orientada a Objetos:

Interface
Classe Abstrata
Herança
Polimorfismo
Encapsulamento
Composição
Recursão
Tratamento de Exceções
Maven

O sistema permite cadastrar pessoas e atletas, calcular o IMC, classificar os resultados e manter um histórico dos cálculos realizados.

Pré-requisitos

Antes de executar o projeto, certifique-se de possuir instalado:

Java JDK 17 ou superior
Maven 3.8 ou superior

Verifique as versões:

java --version
mvn --version
Estrutura do Projeto
calculadora-imc/
│
├── pom.xml
├── README.md
│
└── src/
    └── main/
        └── java/
            ├── Main.java
            ├── CalculadoraIMC.java
            ├── PessoaBase.java
            ├── Pessoa.java
            ├── Atleta.java
            ├── Historico.java
            ├── SistemaIMC.java
            ├── CalculadoraRecursiva.java
            └── EntradaInvalidaException.java
Função de cada classe
Classe	Responsabilidade
CalculadoraIMC	Interface que define o contrato para cálculo e classificação do IMC
PessoaBase	Classe abstrata base do sistema
Pessoa	Implementa o cálculo padrão do IMC
Atleta	Especialização de Pessoa com classificação própria
Historico	Armazena os cálculos realizados
SistemaIMC	Coordena processamento e histórico
CalculadoraRecursiva	Demonstra recursão através da potência
EntradaInvalidaException	Exceção personalizada
Main	Menu principal e interação com o usuário
Como Compilar

Abra um terminal na raiz do projeto e execute:

mvn clean package

Se a compilação ocorrer corretamente, o Maven exibirá:

BUILD SUCCESS
Como Executar
Opção 1 - Executar classes compiladas
java -cp target/classes Main
Opção 2 - Executar pelo Maven
mvn exec:java -Dexec.mainClass="Main"
Demonstração de Uso

Exemplo de execução:

=== MENU ===
1-Cadastrar Pessoa
2-Cadastrar Atleta
3-Calcular IMC
4-Exibir Histórico
0-Sair

Opção: 1

Nome: João
Idade: 20
Peso: 75
Altura: 1.75

Pessoa cadastrada.

Opção: 3

Altura²: 3.0625
João | IMC: 24.49 | Peso normal

Opção: 4

João | IMC: 24.49 | Peso normal
Conceitos de POO Aplicados
Interface

A interface CalculadoraIMC define os métodos obrigatórios para cálculo e classificação do IMC.

Classe Abstrata

A classe PessoaBase serve como modelo para as subclasses.

Herança

Pessoa herda de PessoaBase e Atleta herda de Pessoa.

Polimorfismo

O método classificarIMC() é sobrescrito em Atleta, produzindo comportamentos diferentes para objetos distintos.

Encapsulamento

Os atributos são privados e acessados por getters/setters.

Composição

A classe SistemaIMC possui um objeto Historico.

Recursão

A classe CalculadoraRecursiva implementa potência sem utilizar Math.pow().

Exceções

A classe EntradaInvalidaException trata entradas inválidas sem encerrar o programa abruptamente.

Dependência Utilizada

O projeto utiliza:

JUnit Jupiter 5.10.2

Justificativa:
A dependência foi adicionada para possibilitar a criação de testes unitários futuros seguindo boas práticas de desenvolvimento Java.

Autor

Projeto desenvolvido para fins acadêmicos na disciplina de Programação Orientada a Objetos.
