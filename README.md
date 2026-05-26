# Task Manager API 📋

Uma API REST para gerenciamento de tarefas e usuários, desenvolvida com Spring Boot e MySQL.

## 🚀 Tecnologias

- **Java 17**
- **Spring Boot 3.2**
- **Spring Data JPA**
- **MySQL 8.0**
- **Maven**
- **Lombok**

## 📋 Funcionalidades

### Usuários
- ✅ Criar novo usuário
- ✅ Listar todos os usuários
- ✅ Buscar usuário por ID
- ✅ Atualizar dados do usuário
- ✅ Deletar usuário

### Tarefas
- ✅ Criar nova tarefa
- ✅ Listar tarefas de um usuário
- ✅ Buscar tarefa por ID
- ✅ Atualizar tarefa
- ✅ Marcar tarefa como concluída
- ✅ Deletar tarefa

## 🛠️ Instalação

### Pré-requisitos
- Java 17+
- Maven 3.8+
- MySQL 8.0+

### Passos

1. Clone o repositório:
```bash
git clone https://github.com/Gabsphzx/task-manager-api.git
cd task-manager-api
```

2. Configure o banco de dados:
```sql
CREATE DATABASE task_manager;
USE task_manager;
```

3. Configure as variáveis de ambiente em `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/task_manager
spring.datasource.username=root
spring.datasource.password=sua_senha
```

4. Execute a aplicação:
```bash
mvn spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

## 📚 Endpoints

### Usuários
```
GET    /api/users              - Listar todos os usuários
POST   /api/users              - Criar novo usuário
GET    /api/users/{id}         - Buscar usuário por ID
PUT    /api/users/{id}         - Atualizar usuário
DELETE /api/users/{id}         - Deletar usuário
```

### Tarefas
```
GET    /api/tasks              - Listar todas as tarefas
POST   /api/tasks              - Criar nova tarefa
GET    /api/tasks/{id}         - Buscar tarefa por ID
PUT    /api/tasks/{id}         - Atualizar tarefa
DELETE /api/tasks/{id}         - Deletar tarefa
GET    /api/users/{userId}/tasks - Listar tarefas de um usuário
```

## 📝 Exemplo de Requisição

### Criar Usuário
```bash
curl -X POST http://localhost:8080/api/users \
  -H "Content-Type: application/json" \
  -d '{
    "name": "João Silva",
    "email": "joao@email.com",
    "password": "senha123"
  }'
```

### Criar Tarefa
```bash
curl -X POST http://localhost:8080/api/tasks \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Estudar Spring Boot",
    "description": "Aprender sobre JPA e REST",
    "userId": 1,
    "priority": "HIGH",
    "status": "PENDING"
  }'
```

## 🏗️ Estrutura do Projeto

```
src/
├── main/
│   ├── java/com/taskmanager/
│   │   ├── TaskManagerApplication.java
│   │   ├── controller/
│   │   │   ├── UserController.java
│   │   │   └── TaskController.java
│   │   ├── service/
│   │   │   ├── UserService.java
│   │   │   └── TaskService.java
│   │   ├── repository/
│   │   │   ├── UserRepository.java
│   │   │   └── TaskRepository.java
│   │   ├── model/
│   │   │   ├── User.java
│   │   │   └── Task.java
│   │   ├── dto/
│   │   │   ├── UserDTO.java
│   │   │   └── TaskDTO.java
│   │   └── exception/
│   │       ├── ResourceNotFoundException.java
│   │       └── GlobalExceptionHandler.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/com/taskmanager/
```

## 📖 Conceitos Aprendidos

Este projeto abrange:
- REST API principles
- Spring Boot fundamentals
- JPA/Hibernate
- CRUD operations
- Exception handling
- DTOs (Data Transfer Objects)
- Repository pattern

## 🤝 Contribuições

Sinta-se livre para fazer fork e enviar PRs!

## 📄 Licença

MIT

---

**Desenvolvido como projeto de portfólio para demonstrar conhecimento em Java e Spring Boot** 💻