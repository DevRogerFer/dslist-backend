# Projeto DSList - Intensivão Java Spring
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/DevRogerFer/dslist-backend/blob/main/LICENSE)
# Sobre o Projeto
https://dslist-backend-production-ccfb.up.railway.app/games

DSList é uma aplicação back end construída durante a semana do evento **Intensivão Java Spring**, organizado pela plataforma de ensino DevSuperior (https://devsuperior.com.br/).

A aplicação consiste em organizar uma lista fictícia de games, trazendo algumas de suas principais características, tais como o título, ano de lançamento, uma imagem que o represente e uma curta descrição.
Possibilita a reorganização da lista de acordo com a preferência do usuário.

## Padrão de Camadas
Desenvolvida no padrão de camadas MVC (Model, View, Controller):

![Padrão Camadas](https://github.com/DevRogerFer/dslist-backend/blob/main/assets/1.padrao_camadas.jpg)

# Modelo de Domínio DSList:
![Modelo Domínio](https://github.com/DevRogerFer/dslist-backend/blob/main/assets/2.modelo_dominio_dslist.jpg)

## Banco de Dados
Como base de dados para o ambiente local de homologação e testes, foi utilizado o H2 Database.
Para o ambiente de produção, foi utilizado o PostgreSQL e pgAdmin com deploy no Railway App.

## Ambiente Local (H2 + Postman):
Demonstração do H2 Database original, antes da reorganização dos games na lista:

![H2 Database](https://github.com/DevRogerFer/dslist-backend/blob/main/assets/3.bd_h2_origin.jpg)

H2 Database após a reorganização dos games na lista (ListReplacement):

![H2 Database](https://github.com/DevRogerFer/dslist-backend/blob/main/assets/4.bd_h2_list_replacement.jpg)

Demonstração do Postman com requisição GET no endpoint "/games":

![Postman](https://github.com/DevRogerFer/dslist-backend/blob/main/assets/5.postman_endpoint_games.jpg)

## Ambiente de Produção (PostgreSQL + Railway App):
Banco de dados PostgreSQL executando no ambiente de produção do Railway App:

![PostgreSQL](https://github.com/DevRogerFer/dslist-backend/blob/main/assets/6.postgresql_railwarapp.jpg)

Aplicação executando em ambiente de produção do Railway App no endpoint "/lists/{id}/games (GameByLists):

![RailwayApp](https://github.com/DevRogerFer/dslist-backend/blob/main/assets/7.railwayapp_endpoint_gamebylists.jpg)

## Conteúdos abordados:
- Conceitos:
  - Sistemas web e recursos
  - Cliente/Servidor, HTTP, JSON
  - Padrão Rest para API web
- Estruturação de projeto Spring Rest
- Entidades e ORM
- Database seeding
- Padrão de camadas (MVC)
- Controller, service, repository
- Padrão DTO
- Relacionamentos N-N
- Classe de associação, embedded id
- Consultas SQL no Spring Data JPA
- Projections
- Dicas de currículo e portfólio
- Perfis de projeto (test, dev e prod)
- Ambiente local com Docker Compose
- Processo de homologação local
- Processo de deploy com CI/CD
- Configuração de CORS
- Design e implementação de endpoint especial
- Operação de atualização no Spring
- Operações com List
- Verbo HTTP e idempotência

# Tecnologias utilizadas
## Back end
  - Java
  - Spring Boot
  - Docker Compose
  - JPA/ Hibernate
  - Maven
## Implantação em produção
  - Back end: Railway App
  - Banco de dados: PostgreSQL

# Autor
Rogério Fernandes Siqueira

https://www.linkedin.com/in/devrogerfer/

https://freelancer.com.br/freelancers/rog%C3%A9rio-2QVWBR25?nocache=1
