## 📝 Descrição 
## E-commerce com Spring Boot, React.js e MySQL ##
Este é um projeto de e-commerce completo desenvolvido do zero utilizando tecnologias modernas. O objetivo é demonstrar a criação de uma aplicação web de comércio eletrônico que inclui funcionalidades como autenticação de usuário, gerenciamento de produtos, carrinho de compras e integração com PayPal para envio de faturas. O projeto é dividido em duas partes principais: backend e frontend.

## 📝 Tecnologias Utilizadas
Backend:

Java com Spring Boot: Utilizado para criar a API RESTful que gerencia os dados e a lógica de negócios.
Spring Data JPA: Para interação com o banco de dados MySQL.
Spring Security: Para autenticação e autorização de usuários.
MySQL: Banco de dados relacional utilizado para armazenar os dados da aplicação.
PayPal SDK: Para integração com o PayPal e envio de faturas.
Maven: Para gerenciamento de dependências e build do projeto.
Postman: Para testar os endpoints da API.
Frontend:

React.js: Para criar uma interface de usuário interativa e responsiva.
Axios: Para fazer requisições HTTP para a API backend.
React Router: Para gerenciar as rotas e navegação da aplicação.
## 📝 Funcionalidades
## Backend
Gerenciamento de Produtos: Adição, atualização, listagem e remoção de produtos.
Autenticação e Autorização: Registro e login de usuários utilizando Spring Security.
Carrinho de Compras: Adição e remoção de produtos do carrinho de compras do usuário.
Integração com PayPal: Criação e envio de faturas utilizando a API do PayPal.
## Frontend
Home Page: Listagem de produtos disponíveis.
Detalhes do Produto: Visualização detalhada de cada produto.
Carrinho de Compras: Visualização e gerenciamento do carrinho de compras do usuário.
Finalização de Compra: Envio de fatura por email utilizando PayPal.
Estrutura do Projeto
## Backend
Modelos: Classes que representam as entidades do banco de dados (Product, User, Cart).
Repositórios: Interfaces para acesso e manipulação dos dados no banco de dados.
Serviços: Classes que contêm a lógica de negócios.
Controladores: Classes que expõem os endpoints da API.
Configurações: Configurações de segurança e integração com PayPal.
## Frontend
Componentes: Componentes React para Home, ProductDetail e Cart.
Serviços: Requisições HTTP utilizando Axios para interagir com a API backend.
Rotas: Configuração de rotas utilizando React Router.
Como Executar o Projeto
## Backend

## 📝 Clone o repositório:

sh
Copiar código
git clone https://github.com/seu-usuario/ecommerce-backend.git
cd ecommerce-backend
Configure o banco de dados MySQL:

Crie um banco de dados chamado ecommerce.
Atualize o arquivo application.properties com suas credenciais do MySQL e do PayPal.
Instale as dependências e execute o projeto:

sh
Copiar código
mvn clean install
mvn spring-boot:run
Frontend
Clone o repositório:

sh
Copiar código
git clone https://github.com/seu-usuario/ecommerce-frontend.git
cd ecommerce-frontend
## 📝 Instale as dependências e execute o projeto:

sh
Copiar código
npm install
npm start
Teste da API com Postman
Crie uma nova coleção no Postman.
Adicione requisições para testar os endpoints:
GET /api/products para listar produtos.
POST /api/products para criar um novo produto.
GET /api/users para listar usuários.
POST /api/users/register para registrar um novo usuário.
GET /api/carts/{userId} para obter o carrinho de um usuário.
POST /api/carts/{cartId}/add para adicionar um produto ao carrinho.
DELETE /api/carts/{cartId}/remove/{productId} para remover um produto do carrinho.
POST /api/invoices/create para criar uma fatura.
POST /api/invoices/send/{invoiceId} para enviar uma fatura.
