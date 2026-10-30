<p align="center"><img src="assets/lynow-corp-platform-banner.jpg" width="100%" alt="lynow-corp-platform"></p>

<p align="center">Back-end para conectar clientes e profissionais em serviços pontuais.</p>


<p align="center"><a href="#visão-geral">Visão geral</a> &nbsp;·&nbsp; <a href="#recursos">Recursos</a> &nbsp;·&nbsp; <a href="#como-executar">Como executar</a></p>

<p align="center"><img src="assets/identity/divider.svg" alt="" width="100%"></p>

<a id="explore-o-projeto"></a>

## Por onde começar


- **[API](lynow-api/Backend-api/src/main/java/com/lynow/lynow_api/controller/UsuarioController.java)** — Controlador de usuários.
- **[Modelo](lynow-api/Backend-api/src/main/java/com/lynow/lynow_api/model/Usuario.java)** — Representação dos dados de usuário.
- **[Persistência](lynow-api/Backend-api/src/main/java/com/lynow/lynow_api/repository/UsuarioRepository.java)** — Interface de acesso aos dados.


<a id="visão-geral"></a>

## Visão geral

Estruturado como um monorepo, o projeto reúne a modelagem relacional em **MySQL** (usuários, oportunidades e chaves estrangeiras) e o motor back-end em **Java 17 com Spring Boot**, aplicando arquitetura em camadas (Controller, Model e Repository) e persistência automatizada via **Spring Data JPA / Hibernate**.

<a id="recursos"></a>

## Recursos

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

## Tecnologias

- **Java 17 & Spring Boot** para construção do servidor web embutido e injeção de dependências;
- **Spring Data JPA / Hibernate** para persistência objeto-relacional;
- **MySQL** como banco de dados relacional na porta 3306;
- **Maven Wrapper (mvnw / mvnw.cmd)** para build reproduzível sem exigir instalação global do Maven.

<details>
<summary>Arquitetura</summary>

```mermaid
flowchart LR
    A["Cliente HTTP / Postman"] -->|GET / POST JSON| B["UsuarioController"]
    B --> C["UsuarioRepository · Spring Data JPA"]
    C --> D["Hibernate ORM"]
    D --> E["(MySQL · lynow_db)"]
```

</details>

<details>
<summary>Estrutura do repositório</summary>

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

</details>

<a id="como-executar"></a>

## Como executar

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

## Decisões técnicas

- **Padrão Repository com Spring Data JPA:** reduz drasticamente o código repetitivo de acesso a dados e garante transações seguras.
- **Separação em camadas (controller, model, repository):** prepara o terreno para a inclusão de regras de negócio e autenticação JWT na camada de serviço.

<p align="center"><img src="assets/identity/divider.svg" alt="" width="100%"></p>

<p align="center">
  <a href="https://github.com/arthurlynow098">GitHub</a> &nbsp;·&nbsp;
  <a href="https://arthurentsev.vercel.app/">Portfólio</a> &nbsp;·&nbsp;
  <a href="https://www.linkedin.com/in/entsevarthur/">LinkedIn</a>
</p>