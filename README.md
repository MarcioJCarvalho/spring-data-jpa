
# Projeto Spring Data JPA

## 🎯 Objetivo do Projeto
O objetivo deste projeto é conhecer os principais conceitos de mapeamento objeto relacional (ORM) usando o Spring Data JPA. Para isso, uma API RESTful será desenvolvida com ênfase na modelagem de suas entidades, no domínio de uma academia de ginástica.

## 🛑 Pré-requistos
- [X]  Fundamentos do Spring Boot
- [X]  Noções de SQL

## 🚦 Guia
    1. Apresentação do Projeto Base
    2. Configuração do banco de dados (SGBD MySQL)
    3. Aplicando as annotations 
    4. Execução do fluxo back-end: Controller - Service - Repository
    5. Validação - Hibernate Validator
    6. Consultas Avançadas - Derived Query - Native Query

## 🛠 Tecnologias Utilizadas
* IDE IntelliJ
* Java 11
* Maven
* Spring Web
* Spring Data JPA
* MySQL Driver
* Hibernate Validator
* Lombok
* Postman

# [Anotações de Mapeamento](https://strn.com.br/artigos/2018/12/11/todas-as-anotações-do-jpa-anotações-de-mapeamento/)
__@Entity__ Usada para especificar que a classe anotada atualmente representa um tipo de entidade.

__@Table__ Usada para especificar a tabela principal da entidade atualmente anotada.

__@Id__ Especifica o identificador da entidade. Uma entidade deve sempre ter um atributo identificado.

__@GeneratedValue__ Especifica que o valor do identificador de entidade é gerado automaticamente.

__@Column__ Usada para especificar o mapeamento entre um atributo de entidade básico e a coluna da tabela de banco de dados.

__@JoinColumn__ Usada para especificar a coluna FOREIGN KEY. Indica que a entidade é a responsável pelo relacionamento.

__@OneToMany__ Usada para especificar um relacionamento de banco de dados um-para-muitos.

__@OneToOne__ Usada para especificar um relacionamento de banco de dados um-para-um.

__@ManyToOne__ Usada para especificar um relacionamento de banco de dados muitos-para-um.

cascade Realizar operações em cascata só faz sentido em relacionamentos Pai - Filho.

mappedBy Indica qual é o lado inverso ou não dominante da relação.

## 🔗 Links Úteis
 * [Spring Initializr](https://start.spring.io)
 * [Common application properties](https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/common-application-properties.html)
 * [Spring Data JPA - Reference Documentation](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.repositories)
 * [Validation Reference Implementation: Reference Guide](https://docs.jboss.org/hibernate/stable/validator/reference/en-US/html_single/#validator-gettingstarted)

## 🤝 Contribuindo
Este repositório foi criado para fins de estudo, então contribua com ele. Se te ajudei de alguma forma, ficarei feliz em saber. E caso você conheça alguém que se identidique com o conteúdo, não deixe de compatilhar.

Se possível:
* ⭐️ Star o projeto
* 🐛 Encontrar e relatar issues

---
Made with 💙 by MÁRCIO 👋 [See my LinkedIn](https://www.linkedin.com/in/marciojcarvalho/)


