# ☕ Java Studies and Projects

[![Java Version](https://img.shields.io/badge/Java-25-orange.svg?style=flat-square&logo=openjdk)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.1.0-green.svg?style=flat-square&logo=springboot)](https://spring.io/projects/spring-boot)
[![Build](https://img.shields.io/badge/Build-Maven-red.svg?style=flat-square&logo=apachemaven)](https://maven.apache.org/)
[![Semester](https://img.shields.io/badge/Semester-4th_Period-blue.svg?style=flat-square)](#)

This repository is dedicated to my learning journey and development in the **Java ecosystem**, as part of the **Computer Systems Analysis and Development** program at the **Federal Institute of Triângulo Mineiro (IFTM)**.

It serves as a portfolio to version and store exercises, assignments, and projects from different subjects, showcasing my progress and the skills acquired throughout the semesters.

---

## 📂 Repository Structure

The `main` branch contains the **current semester's work in progress**, while completed semesters are preserved in dedicated branches for reference.

### 🎓 Completed Semesters (Archived Branches)

| Branch | Subject | Period | Status |
|--------|---------|--------|--------|
| [`3rd-oop-searching-sorting-java`](../../tree/3rd-oop-searching-sorting-java) | Object-Oriented Programming & Searching and Sorting | 3rd Semester (2026.1) | ✅ Completed |

> Semesters taught in C are archived in the [`iftm-ads-c-studies`](https://github.com/DevLuquinha/iftm-ads-c-studies) repository.

---

## 🚧 Current Semester - 4th Period (2026.2)

Focused on the **Spring Framework**, moving from plain Java into dependency injection, scheduled jobs, and data persistence with Spring Data JPA.

```text
iftm-ads-java-studies/
└── 01-classroom-projects/             # Projects built during class
    └── 01-spring-without-web/         # Scheduled CSV importer (no web layer)
        ├── samples/                   # Sample CSV files for the import job
        └── src/main/java/web/springwithoutweb/
            ├── job/                   # @Scheduled directory monitor
            ├── model/                 # JPA entities
            ├── repository/            # Spring Data repositories
            └── service/               # File readers and import orchestration
```

### 📘 01-spring-without-web

A Spring Boot application **without a web layer**, built to demonstrate that the framework is far more than an HTTP server:

* **Dependency Injection & Stereotypes:** `@Component`, `@Service`, and constructor injection wiring the application together.
* **Scheduled Tasks:** `@EnableScheduling` with a `@Scheduled(fixedDelayString = "${app.system.read-interval}")` job that polls a directory every 10 seconds.
* **Strategy Pattern via Injection:** `ImporterService` receives a `List<FileReader>`, so new file formats are supported by simply adding a new `@Component` — no changes to the importer itself.
* **Spring Data JPA:** `SalesRecord` mapped as an `@Entity` and persisted through a `JpaRepository`, backed by an in-memory H2 database.
* **Transactional Boundaries:** `@Transactional` guaranteeing that a file is either fully imported or not at all.
* **Externalized Configuration:** polling interval and input directory read from `application.properties`.

---

## 🛠️ Technologies

- **Language:** Java (JDK 25)
- **Framework:** Spring Boot 4.1.0 (Spring Data JPA, Spring Scheduling)
- **Build Tool:** Maven (via the bundled `mvnw` wrapper)
- **Database:** H2 (in-memory)
- **IDE:** Visual Studio Code

---

## ⚙️ How to Run

No global Maven installation is required — the wrapper handles it.

```bash
cd 01-classroom-projects/01-spring-without-web

# The job consumes the files it reads, so work from a copy of the samples
mkdir -p input && cp samples/*.csv input/

./mvnw spring-boot:run
```

Every 10 seconds the job scans `input/`, persists each record into H2, renames the processed files to `*.csv.processed`, and prints the sales report to the console. Both `input/` and `target/` are ignored by Git, so running the application never dirties the working tree.

To only compile and run the tests:

```bash
./mvnw clean verify
```

---

## 👨‍💻 About

**Student:** Lucas Emmanuel  
**Institution:** IFTM - Federal Institute of Triângulo Mineiro  
**Program:** Computer Systems Analysis and Development  

---

Feel free to explore the code and follow my progress! 🎯

---

<details>
  <summary>🇧🇷 Versão em Português</summary>

# ☕ Estudos e Projetos em Java

Este repositório é dedicado à minha jornada de aprendizado e desenvolvimento no **ecossistema Java**, como parte do curso de **Análise e Desenvolvimento de Sistemas (ADS)** no **Instituto Federal do Triângulo Mineiro (IFTM)**.

Ele serve como portfólio para versionar e armazenar exercícios, trabalhos e projetos de diferentes disciplinas, registrando minha evolução e as habilidades adquiridas ao longo dos períodos.

---

## 📂 Estrutura do Repositório

A branch `main` contém o **trabalho em andamento do semestre atual**, enquanto os semestres concluídos são preservados em branches dedicadas para referência.

### 🎓 Semestres Concluídos (Branches Arquivadas)

| Branch | Disciplinas | Período | Status |
|--------|-------------|---------|--------|
| [`3rd-oop-searching-sorting-java`](../../tree/3rd-oop-searching-sorting-java) | Programação Orientada a Objetos & Pesquisa e Ordenação | 3º Semestre (2026.1) | ✅ Concluído |

> Os semestres cursados em C estão arquivados no repositório [`iftm-ads-c-studies`](https://github.com/DevLuquinha/iftm-ads-c-studies).

---

## 🚧 Semestre Atual - 4º Período (2026.2)

Focado no **Spring Framework**, saindo do Java puro para injeção de dependências, tarefas agendadas e persistência de dados com Spring Data JPA.

```text
iftm-ads-java-studies/
└── 01-classroom-projects/             # Projetos desenvolvidos em aula
    └── 01-spring-without-web/         # Importador de CSV agendado (sem camada web)
        ├── samples/                   # Arquivos CSV de exemplo para o job de importação
        └── src/main/java/web/springwithoutweb/
            ├── job/                   # Monitor de diretório com @Scheduled
            ├── model/                 # Entidades JPA
            ├── repository/            # Repositórios do Spring Data
            └── service/               # Leitores de arquivo e orquestração da importação
```

### 📘 01-spring-without-web

Uma aplicação Spring Boot **sem camada web**, feita para demonstrar que o framework é muito mais do que um servidor HTTP:

* **Injeção de Dependências e Estereótipos:** `@Component`, `@Service` e injeção via construtor conectando a aplicação.
* **Tarefas Agendadas:** `@EnableScheduling` com um job `@Scheduled(fixedDelayString = "${app.system.read-interval}")` que varre um diretório a cada 10 segundos.
* **Padrão Strategy via Injeção:** o `ImporterService` recebe uma `List<FileReader>`, então dar suporte a um novo formato de arquivo é só criar mais um `@Component` — sem alterar o importador.
* **Spring Data JPA:** `SalesRecord` mapeado como `@Entity` e persistido por um `JpaRepository`, com banco H2 em memória.
* **Fronteiras Transacionais:** `@Transactional` garantindo que um arquivo seja importado por completo ou não seja importado.
* **Configuração Externalizada:** intervalo de varredura e diretório de entrada lidos do `application.properties`.

---

## 🛠️ Tecnologias

- **Linguagem:** Java (JDK 25)
- **Framework:** Spring Boot 4.1.0 (Spring Data JPA, Spring Scheduling)
- **Ferramenta de Build:** Maven (através do wrapper `mvnw` já incluso)
- **Banco de Dados:** H2 (em memória)
- **IDE:** Visual Studio Code

---

## ⚙️ Como Executar

Não é necessário ter o Maven instalado globalmente — o wrapper resolve isso.

```bash
cd 01-classroom-projects/01-spring-without-web

# O job consome os arquivos que lê, então trabalhe sobre uma cópia dos exemplos
mkdir -p input && cp samples/*.csv input/

./mvnw spring-boot:run
```

A cada 10 segundos o job varre a pasta `input/`, persiste cada registro no H2, renomeia os arquivos processados para `*.csv.processed` e imprime o relatório de vendas no console. Tanto `input/` quanto `target/` são ignorados pelo Git, então rodar a aplicação nunca suja a árvore de trabalho.

Para apenas compilar e rodar os testes:

```bash
./mvnw clean verify
```

---

## 👨‍💻 Sobre

**Estudante:** Lucas Emmanuel  
**Instituição:** IFTM - Instituto Federal do Triângulo Mineiro  
**Curso:** Análise e Desenvolvimento de Sistemas  

---

Sinta-se à vontade para explorar os códigos e acompanhar minha evolução! 🎯
</details>
