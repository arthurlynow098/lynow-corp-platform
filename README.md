<a id="top"></a>

<p align="center"><img src="assets/identity-v2/banner.png" alt="Lynow Corp" width="100%"></p>

<p align="center">Back-end para conectar clientes e profissionais em serviços pontuais.</p>

<p align="center">
<img alt="Java" src="https://img.shields.io/badge/Java-2877B8?style=for-the-badge&amp;logo=openjdk&amp;logoColor=white">
<img alt="Spring Boot" src="https://img.shields.io/badge/Spring%20Boot-2877B8?style=for-the-badge&amp;logo=springboot&amp;logoColor=white">
<img alt="MySQL" src="https://img.shields.io/badge/MySQL-2877B8?style=for-the-badge&amp;logo=mysql&amp;logoColor=white">
</p>


<p align="center"><a href="#visão-geral">Visão geral</a> &nbsp;·&nbsp; <a href="#recursos">Recursos</a> &nbsp;·&nbsp; <a href="#como-executar">Como executar</a></p>


<a id="explore-o-projeto"></a>

<a id="por-onde-começar"></a>

<p><img src="assets/identity-v2/section-01.svg" alt="Por onde começar" width="100%"></p>


- **[API](lynow-api/Backend-api/src/main/java/com/lynow/lynow_api/controller/UsuarioController.java)** — Controlador de usuários.
- **[Modelo](lynow-api/Backend-api/src/main/java/com/lynow/lynow_api/model/Usuario.java)** — Representação dos dados de usuário.
- **[Persistência](lynow-api/Backend-api/src/main/java/com/lynow/lynow_api/repository/UsuarioRepository.java)** — Interface de acesso aos dados.


<a id="visão-geral"></a>

<a id="sobre-o-projeto"></a>

<p><img src="assets/identity-v2/section-02.svg" alt="Sobre o projeto" width="100%"></p>

Estruturado como um monorepo, o projeto reúne a modelagem relacional em **MySQL** (usuários, oportunidades e chaves estrangeiras) e o motor back-end em **Java 17 com Spring Boot**, aplicando arquitetura em camadas (Controller, Model e Repository) e persistência automatizada via **Spring Data JPA / Hibernate**.

<a id="recursos"></a>



<p><img src="assets/identity-v2/section-03.svg" alt="Recursos" width="100%"></p>

**API RESTful de Usuários**<br>
UsuarioController expõe endpoints HTTP (GET /usuarios e POST /usuarios) com serialização JSON automática.

**Mapeamento ORM com JPA**<br>
A entidade Usuario mapeia colunas, tipos e restrições diretamente para o schema relacional do MySQL.

**Repositório Desacoplado**<br>
UsuarioRepository estende JpaRepository, fornecendo operações CRUD transacionais sem SQL boilerplate.

**Endpoint de Diagnóstico**<br>
RecepcaoController oferece verificação rápida de disponibilidade e resposta da API.

**Monorepo Banco + API**<br>
Scripts SQL de criação de tabelas e carga inicial ficam versionados ao lado da aplicação Spring Boot.

<a id="tecnologias"></a>



<p><img src="assets/identity-v2/section-04.svg" alt="Tecnologias" width="100%"></p>

- **Java 17 & Spring Boot** para construção do servidor web embutido e injeção de dependências;
- **Spring Data JPA / Hibernate** para persistência objeto-relacional;
- **MySQL** como banco de dados relacional na porta 3306;
- **Maven Wrapper (mvnw / mvnw.cmd)** para build reproduzível sem exigir instalação global do Maven.

<a id="arquitetura"></a>

<p><img src="assets/identity-v2/section-05.svg" alt="Arquitetura" width="100%"></p>


```mermaid
flowchart LR
    A["Cliente HTTP / Postman"] -->|GET / POST JSON| B["UsuarioController"]
    B --> C["UsuarioRepository · Spring Data JPA"]
    C --> D["Hibernate ORM"]
    D --> E["(MySQL · lynow_db)"]
```


<a id="estrutura-do-repositório"></a>

<p><img src="assets/identity-v2/section-06.svg" alt="Estrutura do repositório" width="100%"></p>


```text
lynow-corp-platform/
├── assets/
│   └── identity/banner.png               Banner do projeto
├── lynow-api/
│   └── Backend-api/
│       ├── src/main/java/com/lynow/lynow_api/
│       │   ├── controller/UsuarioController.java   Endpoints REST de usuários
│       │   ├── model/Usuario.java                  Entidade JPA mapeada
│       │   ├── repository/UsuarioRepository.java   Interface JpaRepository
│       │   ├── RecepcaoController.java             Rota de boas-vindas / healthcheck
│       │   └── LynowApiApplication.java            Ponto de entrada Spring Boot
│       ├── src/main/resources/
│       │   └── application.properties              Configuração de DataSource MySQL
│       └── pom.xml                                 Dependências Maven do projeto
└── README.md
```


<a id="como-executar"></a>



<p><img src="assets/identity-v2/section-07.svg" alt="Como executar" width="100%"></p>

1. Clone o repositório:
   ```bash
   git clone https://github.com/arthurlynow098/lynow-corp-platform.git
   cd lynow-corp-platform/lynow-api/Backend-api
   ```
2. Certifique-se de ter um servidor **MySQL** ativo com o schema lynow_db criado e configure seu usuário e senha em src/main/resources/application.properties:
   ```properties
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   ```
3. Inicie a API com o Maven Wrapper:
   ```powershell
   .\mvnw.cmd spring-boot:run
   ```
4. Teste os endpoints em http://localhost:8080/usuarios via Postman, Insomnia ou curl.

<a id="decisões-técnicas"></a>



<p><img src="assets/identity-v2/section-08.svg" alt="Decisões técnicas" width="100%"></p>

- **Padrão Repository com Spring Data JPA:** reduz drasticamente o código repetitivo de acesso a dados e garante transações seguras.
- **Separação em camadas (controller, model, repository):** prepara o terreno para a inclusão de regras de negócio e autenticação JWT na camada de serviço.


<p align="center">
  <a href="https://github.com/arthurlynow098">GitHub</a> &nbsp;·&nbsp;
  <a href="https://arthurentsev.vercel.app/">Portfólio</a> &nbsp;·&nbsp;
  <a href="https://www.linkedin.com/in/entsevarthur/">LinkedIn</a>
</p>

<a id="identidade-e-créditos"></a>

<p><img src="assets/identity-v2/section-09.svg" alt="Identidade e créditos" width="100%"></p>

<table><tr><td width="150"><img src="assets/identity-v2/logo.png" alt="Lobo" width="130"></td><td><strong>Lobo</strong><br>Cooperação entre integrantes de uma rede.<br><br><a href="assets/identity-v2/logo.png">Logo em PNG</a> · <a href="assets/identity-v2/banner.png">Banner em PNG</a></td></tr></table>

Artes da coleção fornecida por **Arthur Entsev**, com adaptação das logos e acabamento dos banners realizados com auxílio de geração de imagens. Referências de identidade e apresentação: [LynowCut](https://github.com/arthurlynow098/LynowCut), [LynowMic](https://github.com/arthurlynow098/LynowMic) e [LynowCatch](https://github.com/arthurlynow098/LynowCatch). Os créditos e avisos do conteúdo original foram preservados.

<p align="center"><a href="#top">Voltar ao topo ↑</a> · <a href="https://github.com/arthurlynow098">Arthur Entsev</a> · <a href="https://arthurentsev.vercel.app/">Portfólio</a></p>
