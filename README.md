# Project Store

### Sobre o Projeto
Esse projeto tem como objetivo criar uma loja de roupas, onde o Funcionario da Loja
possa atender aos clientes, cadastrar produtos, e registrar pedidos do cliente.

### Objetivo
Este projeto foi desenvolvido como parte do curso técnico, seguindo uma metodologia mais tradicional da realização de um CRUD e da 
conexão com banco de dados apresentada em sala de aula, com uma abordagem somente para entender como funciona um CRUD, criando uma
classe Main para cada função do CRUD, como um teste unitário. Como estudante estou em busca de uma constante evolução, explorando tecnologias mais modernas 
como Spring Boot e padrões atuais de desenvolvimento.

Embora mantenha a estrutura original do projeto que foi ensinado em sala de aula, ele representa um importante passo na minha jornada de aprendizado,
enquanto continuo me desenvolvendo e descobrindo novas formas de construir aplicações mais robustas e eficientes.

### Tecnologias
- Java
- MySQL

### Funcionalidades
- Cadastrar Funcionarios
- Cadastrar Clientes
- Cadastrar Produtos
- Cadastrar Pedidos
- Visualizar Clientes
- Visualizar Funcionarios
- Visualizar Produtos
- Visualizar Pedidos

### Conceitos Implementados
- Conexão basica com o Banco de Dados
- CRUD de maniera mais tradicional
- Polimofismo
- Classe e Método Abstrato
- Herança
- Associação

### Como Executar o Projeto
1. Pré-requisitos:
   - Java JDK 8 ou superior instalado
   - MySQL instalado
   - IDE de sua preferência (Eclipse, NetBeans, IntelliJ)

2. Configuração do Banco de Dados:
   - Crie um banco de dados MySQL
   - Na classe ConnectionFactory, configure as seguintes variáveis:
     - URL: "jdbc:mysql://localhost:3306/NOME_DO_SEU_BANCO"
     - USER: Seu usuário MySQL
     - PASS: Sua senha MySQL

3. Execute o script SQL para criar as tabelas (disponível em `database/ProjectStoreA2.sql`)

4. Execute as classes de teste:
   - No diretório 'Testes', você encontrará classes Main específicas para cada operação CRUD
   - Cada classe Main representa um teste unitário para uma funcionalidade específica
   - Execute a classe Main correspondente à operação que deseja testar
