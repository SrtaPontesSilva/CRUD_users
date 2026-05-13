# CRUD de Usuários - Spring Boot API

API REST simples para gerenciamento de usuários (CRUD), construída com Spring Boot, Spring Data JPA e banco em memória H2.

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 Database (em memória)
- Maven

---

## 📌 Funcionalidades

- Criar usuário (Create)
- Listar todos os usuários (Read)
- Buscar usuário por ID (Read)
- Atualizar usuário (Update)
- Deletar usuário (Delete)

---

## 📂 Estrutura do projeto

```bash
src/main/java/com/example/demo
├── controller   → endpoints REST
├── service      → regras de negócio
├── repository   → acesso ao banco de dados
├── model        → entidade JPA
└── exception    → tratamento de erros (em evolução)
```

---

## 🔗 Base URL

```txt
http://localhost:8080/users
```

---

## 📌 Endpoints da API

### 📥 Criar usuário

**POST** `/users`

#### Request

```json
{
  "name": "Eduarda",
  "email": "eduarda@email.com"
}
```

#### Response esperado

```txt
201 Created
```

---

## 📄 Listar todos os usuários

**GET** `/users`

#### Response

```txt
200 OK
```

---

## 🔍 Buscar usuário por ID

**GET** `/users/{id}`

### Exemplo

```http
GET http://localhost:8080/users/1
```

#### Response

```txt
200 OK
ou
404 Not Found
```

---

## ✏️ Atualizar usuário

**PUT** `/users/{id}`

#### Request

```json
{
  "name": "Nome Atualizado",
  "email": "novo@email.com"
}
```

#### Response

```txt
200 OK
ou
404 Not Found
```

---

## ❌ Deletar usuário

**DELETE** `/users/{id}`

#### Response

```txt
200 OK
ou
404 Not Found
```

---

## 📊 Status HTTP utilizados

| Status | Significado |
|---|---|
| 200 OK | Requisições bem-sucedidas |
| 201 Created | Criação de recurso |
| 204 No Content | Opcional para delete em melhorias futuras |
| 404 Not Found | Recurso não encontrado |
| 500 Internal Server Error | Erro inesperado |

---

## 🧪 Como executar o projeto

### 1. Rodar aplicação

```bash
./mvnw spring-boot:run
```

### 2. Acessar no navegador

```txt
http://localhost:8080
```

---

## 🧪 Como testar no Postman

### ✔ Criar usuário

- **Method:** POST
- **URL:** `http://localhost:8080/users`

#### Body (raw / JSON)

```json
{
  "name": "Teste",
  "email": "teste@email.com"
}
```

---

### ✔ Listar usuários

- **Method:** GET
- **URL:** `http://localhost:8080/users`

---

### ✔ Buscar por ID

- **Method:** GET
- **URL:** `http://localhost:8080/users/1`

---

### ✔ Atualizar usuário

- **Method:** PUT
- **URL:** `http://localhost:8080/users/1`

#### Body

```json
{
  "name": "Atualizado",
  "email": "novo@email.com"
}
```

---

### ✔ Deletar usuário

- **Method:** DELETE
- **URL:** `http://localhost:8080/users/1`

---

## 🧠 Arquitetura

O projeto segue arquitetura em camadas:

- **Controller** → recebe requisições HTTP
- **Service** → regras de negócio
- **Repository** → acesso ao banco de dados
- **Model** → entidade JPA
- **Exception** → estrutura preparada para evolução
