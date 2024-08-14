# Automação de testes integrados (API)
Projeto com finalidade de validar o sistema de API da Leão Multimarcas, utilizando RestAssured para automação dos testes.

## Tecnologias utilizadas

- Java
- RestAssured

## Configuração do ambiente - Execução pelo terminal
Para executar esse projeto é necessário as configurações das variáveis de ambiente 
JDK e Maven:

    - Java: Certifique-se de que o JDK (Java Development Kit) esteja instalado em sua máquina e que a variável de ambiente `JAVA_HOME` esteja configurada corretamente.

    - Maven: Instale o Maven e configure a variável de ambiente `MAVEN_HOME`. Adicione o diretório `bin` do Maven ao `PATH`.

## Como executar
1. Clone este repositório em sua máquina local
2. Abra o projeto em uma IDE ou no Terminal
3. Execute o comando abaixo

Executar os testes pelo terminal

    mvn test -Dtest=*Test


