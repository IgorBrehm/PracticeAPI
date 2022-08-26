# PracticeAPI - CRUD

## Tema

	Você deverá desenvolver uma CRUD API voltada para a administração de uma lista de compras.
	O banco de dados será tratado como o carrinho de compras.
	
## Banco de Dados

	Poderá ser utilizado o MySQL.

## Definição dos Endpoints

	GET: /api/v1/compras/listaCompras -> retorna todos os itens atualmente no carrinho, ou lista vazia se estiver vazio.
	GET: /api/v1/compras/{id} -> retorna um item específico do carrinho, ou 404 caso não exista.
	POST: /api/v1/compras -> adiciona um item ao carrinho.
	PUT: /api/v1/compras/{id} -> modifica alguma informação de um item no carrinho.
	DELETE: /api/v1/compras/{id} -> remove um item do carrinho.

## Objetos

	Leite: {
		id: String,
		tipo: String,
		contemLactose: Boolean,
		teorGordura: Integer,
		marca: String,
		preço: Double
	},
	Cafe: {
		id: String,
		tipo: String,
		contemCafeina: Boolean,
		marca: String,
		preço: Double
	},
	Cerveja: {
		id: String,
		tipo: String,
		contemAlcool: Boolean,
		teorAlcoolico: Integer,
		marca: String,
		preço: Double
	}

## Requisitos: Parte 1

	1. Deve haver validação de payload. (Faça ao menos um customValidator)
	2. Testes unitários.
	3. Tratamento de exceções. (Se precisar)
	4. Respeitar clean code e SOLID.
	5. Criar os scripts de configuração das tabelas do banco de dados.
	
## Requisitos: Parte 2

	1. Adicionar endpoints GET para listar itens através de filtros.
	2. (Opcional) Adicionar autenticação JWT.
	3. (Opcional) Containerizar a aplicação. (Gerar o arquivo JAR, criar imagem Docker)
	4. (Opcional) Configurar teste de cobertura de código com Jacoco.
