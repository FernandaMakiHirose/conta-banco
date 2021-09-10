# Criando uma conta no banco
## Requisitos
- [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/#section=windows)
- Java e Maven instalados

## Licença
Distribuido sob a licença MIT License. Veja `LICENSE` para mais informações.

## Dica - Use o terminal para...
Checar se o Java está instalado:
>java --version

Checar se o Maven está instalado:
>mvn -v 

## Como executar o projeto?
1) Clone o projeto no terminal com o seguinte comando: `https://github.com/FernandaMakiHirose/conta-banco.git`
2) Abra o projeto no IntelliJ IDEA
3) Aceitei o IntelliJ IDEA instalar as dependências e o Maven. Irá aparecer uma opção de aceitar fazer o download.
4) No path `\conta-banco\src\main\java\fernandamakihirose\contabanco\ContaBancoApplication.java` digite no terminal: `mvn spring-boot:run`

## Como inicializei o projeto?
- Utilizei o site [Spring Initializr](https://start.spring.io/) para gerar meu projeto
- Project: [X] Maven Project
- Language: [X] Java
- Spring Boot: [X] 2.5.4
- Group: fernandamakihirose
- Artifact: conta-banco
- Name: conta-banco
- Description: Demo project for Spring Boot
- Package name: fernandamakihirose.conta-banco
- Packaging: [X] Jar
- Java: [X] 11 
- Dependencies: Lombok
