# Lynow Corp - Plataforma de Micro-Jobs

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)

## O Problema e a Solução
O mercado atual sofre com a fricção entre clientes que precisam de pequenos serviços rápidos (micro-jobs) e trabalhadores autônomos buscando oportunidades ágeis. 

A **Lynow Corp** é uma plataforma desenvolvida para conectar essas duas pontas. Este repositório contém a fundação do sistema: uma arquitetura de banco de dados relacional robusta acoplada a uma API RESTful desenvolvida em Java com Spring Boot.

## Estrutura do Monorepo

O projeto está dividido em camadas lógicas para facilitar a manutenção e escalabilidade:

* 📁 `/database` -> Contém os scripts SQL de modelagem, criação de tabelas (Usuários e Jobs), relacionamentos (Foreign Keys) e inserção de dados iniciais.
* 📁 `/backend-api` -> O motor do sistema. Uma API REST estruturada no padrão MVC, utilizando Spring Data JPA para comunicação autônoma com o banco de dados.

## Pré-requisitos para Rodar Localmente

Para rodar o ecossistema na sua máquina, você precisará de:
- Java 17 ou superior.
- Maven (Gerenciador de dependências).
- Banco de Dados MySQL operando na porta padrão (3306).
- IDE (IntelliJ IDEA, VS Code ou Eclipse).

## Passo a Passo de Instalação

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/SEU_USUARIO_AQUI/lynow-corp-platform.git](https://github.com/SEU_USUARIO_AQUI/lynow-corp-platform.git)
