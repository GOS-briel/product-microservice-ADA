
# 🧪 Projeto Final



## 📌 Descrição



Este projeto tem como objetivo a construção de uma **API REST utilizando o framework Spring Boot**. A aplicação deve permitir o cadastro e manutenção de registros em uma base de dados, implementando as operações básicas de um CRUD completo.



> 📌 **Tema livre:** Os alunos poderão escolher o domínio da aplicação (ex: cadastro de filmes, produtos, alunos, livros, etc).


---



## 🔗 Endpoints Obrigatórios



A API deve conter os seguintes endpoints para pelo menos **uma entidade principal**:



| Método | Rota | Descrição |

|--------|---------------------------|-------------------------------------------|

| GET | `/{entidade}` | Retorna todos os registros |

| GET | `/{entidade}/{id}` | Retorna um registro por ID |

| POST | `/{entidade}` | Cria um novo registro |

| PUT | `/{entidade}/{id}` | Atualiza **completamente** um registro |

| DELETE| `/{entidade}/{id}` | Deleta um registro |

| PATCH | `/{entidade}/{id}` | Atualiza **parcialmente** um registro |


> ⚠️ Substitua `{entidade}` pelo nome do recurso escolhido no projeto (ex: `livros`, `produtos`, etc).



---



## 💾 Requisitos Técnicos



- ✅ **Persistência em banco de dados**

- Banco sugerido: **H2** (em memória) ou **PostgreSQL**



- ✅ **Framework**: Quarkus/ Spring Boot



---



## ⚙️ Requisitos Opcionais



Você pode incrementar seu projeto com funcionalidades adicionais. Escolha conforme a capacidade do grupo:



- 🔄 Consumo de uma **API pública externa**

- ✨ Funcionalidade extra relacionada ao tema (ex: relatório, filtro por categoria, exportação, etc)

- 🔐 Autenticação básica (Basic Auth)

- 📃 Integração com **Swagger/OpenAPI** para documentação

- 💻 Frontend simples (em qualquer tecnologia)



---



## 📁 Entregáveis



- 👥 Projeto em grupo: **4 integrantes** ou **individual**

- 📦 Entrega:

- Repositório no **GitHub**

- OU arquivo **.zip** enviado via plataforma LMS



> ✅ **Inclua um README.md no repositório explicando o tema do projeto, instruções de execução e os integrantes do grupo. (para que optar por ser em grupo)**



---



## ✅ Checklist de Avaliação



- [ ] Funcionalidade dos endpoints

- [ ] Conexão com banco de dados

- [ ] Código limpo e estruturado

- [ ] Uso adequado de boas práticas REST

- [ ] Funcionalidades extras (se aplicável)