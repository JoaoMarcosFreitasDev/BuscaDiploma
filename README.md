# 🎓 BuscaDiploma API

![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen?style=flat-square&logo=spring)
![JPA](https://img.shields.io/badge/JPA-Hibernate-purple?style=flat-square)

## 📋 Sobre o Projeto

API REST desenvolvida em **Java 17** com **Spring Boot**, voltada para busca e comparação de faculdades, cursos EAD, polos presenciais e gerenciamento de usuários. O projeto segue o padrão Controller → Service → Repository, com entidades mapeadas via JPA/Hibernate e código reduzido pelo Lombok.

---

## 🏗️ Tecnologias

- Java 17
- Spring Boot 3.x
- Spring Data JPA + Hibernate
- Lombok
- PostgreSQL
- Maven

## 📦 Entidades

| Entidade | Descrição |
|---|---|
| **Faculdade** | Instituição com CNPJ, nota MEC e redes sociais |
| **Curso** | Vinculado à faculdade, com modalidade e duração |
| **Polo** | Unidade com geolocalização (lat/lng) e endereço |
| **PoloHasCurso** | Relação polo ↔ curso com turno e mensalidade |
| **Usuario** | Conta com foto de perfil e redes sociais |

## 🔗 Endpoints Principais

```
POST   /faculdade        → Cadastrar faculdade
GET    /faculdade        → Listar todas
GET    /faculdade/{id}   → Buscar por ID
PUT    /faculdade/{id}   → Atualizar
DELETE /faculdade/{id}   → Remover

POST   /curso            → Criar curso
GET    /curso            → Listar todos
PATCH  /polos/{id}       → Atualização parcial
POST   /usuario          → Criar usuário
```

## ⚙️ Como rodar

```bash
git clone https://github.com/seu-usuario/buscadiploma-api
cd buscadiploma-api
# Configure o banco em application.properties
./mvnw spring-boot:run
```

---
Feito com ☕ e Spring Boot
