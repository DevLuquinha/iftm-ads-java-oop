# ☕ Java Studies - 3rd Semester (ADS - IFTM)

[![Java Version](https://img.shields.io/badge/Java-25-orange.svg?style=flat-square&logo=openjdk)](https://openjdk.org/)
[![IDE](https://img.shields.io/badge/IDE-IntelliJ_IDEA-blue.svg?style=flat-square&logo=intellij-idea)](https://www.jetbrains.com/idea/)
[![Database](https://img.shields.io/badge/Database-MySQL-blue.svg?style=flat-square&logo=mysql)](https://www.mysql.com/)
[![Semester](https://img.shields.io/badge/Semester-3rd_Period-red.svg?style=flat-square)](#)

> 📦 **Archived branch** — this is a snapshot of the 3rd semester. The current semester's work lives on [`main`](../../tree/main).

This repository contains the source code, practical exercises, exam studies, and assignments developed during my **3rd Semester** of the **Systems Analysis and Development (ADS)** program at the **Federal Institute of Triângulo Mineiro (IFTM)**. 

The academic semester focused on two key computer science disciplines using Java under different paradigms and applications:
1. **Object-Oriented Programming (OOP / POO)**: Software design patterns, architecture, robustness, and relational database persistence.
2. **Search and Sorting Algorithms (P&O)**: Advanced data structures (Graphs), traversals, and pathfinding algorithms.

---

## 📂 Repository Structure

The project is structured into clear modules representing the two disciplines, alongside supplementary external resources and libraries:

```text
iftm-ads-java-studies/
├── libs/                              # External library dependencies (.jar)
│   └── mysql-connector-java-8.0.12.jar # JDBC MySQL Database Connector
├── searching-sorting-resources/       # PDF project descriptions & guides
│   ├── 01-assignment-08-graphs/       # Graph traversal assignment requirements
│   └── 02-assignment-09-dijkstra/     # Dijkstra & A* assignment requirements
└── src/
    ├── oop/                           # Object-Oriented Programming Module
    │   ├── classroom_exercises/       # Daily lecture exercises (organized by date)
    │   └── exam_studies/              # Mock tests and exam preparation projects
    └── searching_sorting/             # Search & Sorting Algorithms Module
        ├── assignments/               # Graded practical assignments (BFS, DFS, Dijkstra, A*)
        ├── classroom_exercises/       # Graph implementation practice (English/Portuguese structures)
        └── studies_to_exam/           # Graph & search exam preparation projects
```

---

## 📘 1. Object-Oriented Programming (OOP)

This module focuses on writing clean, modular, and maintainable software using Java. It covers fundamental and advanced OOP concepts, from object modeling to database persistence.

### Key Concepts Covered
* **Classes, Objects, & Attributes**: Modeling real-world entities into Java classes (e.g., `Car`, `Computer`).
* **Encapsulation**: Controlling access via modifiers (`private`, `protected`, `public`) and safeguarding object states with constructors, getters, and setters (e.g., `Account`).
* **Object Relationships (Associations)**: Aggregation and composition to establish relationships between domain models (e.g., `Client` and `Account`, `Team` and `Championship`, `Employee` and `Company`).
* **Inheritance & Polymorphism**: Designing flexible class hierarchies and utilizing dynamic binding. This is demonstrated in the `classroom_exercises/class_26_04_15` package where `Manager`, `Programmer`, and `Secretary` extend an abstract/base `Employee` class, and a `BonusController` polymorphically computes employee benefits.
* **Abstraction & Interfaces**: Decoupling implementation details using abstract classes and contracts (interfaces).
* **Robust Exception Handling**: Custom exception modeling separating *Checked* exceptions (which must be handled or declared) and *Unchecked* runtime exceptions (e.g., `MissingInventoryCheckedException` and `MissingInventoryUncheckedException`).
* **Java Collections**: Managing lists (`ArrayList`, `LinkedList`) and sorting collections of domain models.
* **JDBC & the DAO Pattern**: Establishing relational database connectivity (JDBC) using the MySQL connector jar, building a `ConnectionFactory` singleton, and mapping SQL queries through Data Access Objects (e.g., `ContactDao` to manage `Contact` models).

---

## 🔍 2. Search & Sorting (Graphs & Pathfinding)

This module is dedicated to the study of graph theory, representation methods, and search algorithms applied to solve pathfinding and network traversal problems.

### Key Algorithms & Structures Covered
* **Graph Representation**: Implementing adjacency lists using dedicated `Vertex` and `Edge` objects (provided in both English and Portuguese configurations to consolidate understanding).
* **Graph Traversals**:
  * **BFS (Breadth-First Search / Busca em Largura)**: Layer-by-layer traversal utilizing queues to explore closest vertices first.
  * **DFS (Depth-First Search / Busca em Profundidade)**: Deep traversal utilizing recursion to explore each branch completely before backtracking.
* **Shortest Path Algorithms**:
  * **Dijkstra's Algorithm**: Finding the shortest path from a source vertex to all other vertices in a weighted graph (implemented under `assignments/assignment_09_graphs/dijkstra` and `studies_to_exam/study02`).
  * **A\* Search Algorithm (A-Estrela)**: An informed heuristic search algorithm designed to find the shortest path efficiently. The implementation was tested using the classic **Romania Map Problem**, computing routes to *Bucharest* from starter cities like *Arad* utilizing straight-line distance heuristics (implemented under `assignments/assignment_09_graphs/a_star` and `studies_to_exam/study03`).

---

## 🛠️ Technologies & Tools

* **Programming Language:** Java (JDK 25)
* **IDE:** IntelliJ IDEA Community Edition
* **Database Management System:** MySQL
* **Libraries:** MySQL Connector/J (v8.0.12)
* **Build System:** Plain Java (manual package management)

---

## ⚙️ Setup & How to Run

Because this repository comprises plain Java projects without a build tool like Maven or Gradle, you can run it using your favorite Java IDE:

### 1. Database Setup (For JDBC/DAO Exercises)
The database persistence exercises expect a local MySQL instance with the following settings:
1. Ensure your local MySQL server is running.
2. Create the target database and the necessary table by running:
   ```sql
   CREATE DATABASE IFTM;
   USE IFTM;

   CREATE TABLE contacts (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(255) NOT NULL,
       email VARCHAR(255) NOT NULL,
       address VARCHAR(255) NOT NULL,
       dateOfBirth DATE NOT NULL
   );
   ```
3. The database connection properties in `ConnectionFactory.java` are pre-configured with:
   * **Database URL:** `jdbc:mysql://localhost/IFTM`
   * **Username:** `root`
   * **Password:** `admin`
   * Modify these properties in the source code if your local credentials differ.

### 2. Loading into IntelliJ IDEA
1. Clone this repository locally.
2. Open IntelliJ IDEA and choose **Open**, selecting the repository's root folder.
3. Verify that the SDK is configured to Java JDK 25 (`File > Project Structure > Project > SDK`).
4. To run database-related projects, make sure the database connector jar located in the `libs` folder is added as a library dependency:
   * Right-click `libs/mysql-connector-java-8.0.12.jar` in the file tree and select **Add as Library...** (or register it under `Project Structure > Modules > Dependencies`).
5. Open any `Main.java` file (e.g., in graph assignments or classroom packages) and click the green **Run** button.

---

## 👨‍💻 Academic Details

* **Student:** Lucas Emmanuel
* **Institution:** IFTM – Federal Institute of Triângulo Mineiro
* **Academic Program:** Computer Systems Analysis and Development (ADS)
* **Period:** 3rd Period (2026.1)

---

## 🌍 Portuguese Version / Versão em Português

<details>
<summary><b>Clique para expandir a documentação em Português (Click to expand)</b></summary>

# ☕ Estudos em Java - 3º Período (ADS - IFTM)

> 📦 **Branch arquivada** — este é um snapshot do 3º período. O trabalho do semestre atual está na branch [`main`](../../tree/main).

Este repositório contém o código-fonte, exercícios práticos, estudos para provas e trabalhos desenvolvidos durante o meu **3º Período** no curso de **Análise e Desenvolvimento de Sistemas (ADS)** no **Instituto Federal do Triângulo Mineiro (IFTM)**.

O semestre acadêmico concentrou-se em duas disciplinas fundamentais utilizando Java sob diferentes abordagens e aplicações:
1. **Programação Orientada a Objetos (POO)**: Padrões de projeto, arquitetura de software, robustez e persistência de dados em banco de dados relacional.
2. **Pesquisa e Ordenação (P&O)**: Estruturas de dados avançadas (Grafos), caminhamentos e algoritmos de busca de caminhos.

---

## 📂 Estrutura do Repositório

O projeto está estruturado em módulos claros que representam as duas disciplinas, além de recursos adicionais e bibliotecas externas:

```text
iftm-ads-java-studies/
├── libs/                              # Dependências de bibliotecas externas (.jar)
│   └── mysql-connector-java-8.0.12.jar # Conector JDBC para banco de dados MySQL
├── searching-sorting-resources/       # Arquivos PDF com descrições e roteiros de trabalhos
│   ├── 01-assignment-08-graphs/       # Requisitos do trabalho de caminhamento em grafos
│   └── 02-assignment-09-dijkstra/     # Requisitos do trabalho de Dijkstra e Estrela (A*)
└── src/
    ├── oop/                           # Módulo de Programação Orientada a Objetos (POO)
    │   ├── classroom_exercises/       # Exercícios das aulas cotidianas (organizados por data)
    │   └── exam_studies/              # Exercícios de preparação e simulados de provas
    └── searching_sorting/             # Módulo de Algoritmos de Pesquisa e Ordenação (P&O)
        ├── assignments/               # Trabalhos práticos avaliativos (BFS, DFS, Dijkstra, A*)
        ├── classroom_exercises/       # Prática de implementação de grafos (estruturas em Inglês/Português)
        └── studies_to_exam/           # Projetos de preparação para a prova de grafos
```

---

## 📘 1. Programação Orientada a Objetos (POO)

Este módulo foca na escrita de softwares limpos, modulares e de fácil manutenção utilizando Java. Abrange desde conceitos básicos de modelagem até persistência em banco de dados.

### Principais Conceitos Abordados
* **Classes, Objetos e Atributos**: Modelagem de entidades do mundo real em classes Java (ex: `Car`, `Computer`).
* **Encapsulamento**: Controle de acesso através de modificadores (`private`, `protected`, `public`) e proteção de estados com construtores, getters e setters (ex: `Account`).
* **Associações entre Objetos**: Agregação e composição para estabelecer relacionamentos entre modelos de domínio (ex: `Client` e `Account`, `Team` e `Championship`, `Employee` e `Company`).
* **Herança e Polimorfismo**: Criação de hierarquias de classes flexíveis e uso de vinculação dinâmica. Isso é demonstrado no pacote `classroom_exercises/class_26_04_15`, onde `Manager`, `Programmer` e `Secretary` herdam de uma classe base/abstrata `Employee`, e um `BonusController` calcula de forma polimórfica os benefícios dos funcionários.
* **Abstração e Interfaces**: Desacoplamento de detalhes de implementação através de classes abstratas e contratos (interfaces).
* **Tratamento de Exceções Robustas**: Modelagem de exceções customizadas diferenciando exceções do tipo *Checked* (que exigem tratamento obrigatório) de exceções do tipo *Unchecked* (de tempo de execução), como `MissingInventoryCheckedException` e `MissingInventoryUncheckedException`.
* **Coleções (Java Collections)**: Manipulação de listas (`ArrayList`, `LinkedList`) e ordenação de coleções de objetos.
* **JDBC e o Padrão DAO**: Conexão com banco de dados relacional (JDBC) utilizando o conector MySQL, criando um gerenciador de conexão singleton `ConnectionFactory` e mapeando operações SQL por meio de Data Access Objects (ex: `ContactDao` para gerenciar o modelo `Contact`).

---

## 🔍 2. Pesquisa e Ordenação (Grafos e Algoritmos de Caminho)

Este módulo é dedicado ao estudo da teoria dos grafos, métodos de representação computacional e algoritmos de busca aplicados à resolução de problemas de redes e caminhos mínimos.

### Principais Algoritmos e Estruturas Abordados
* **Representação de Grafos**: Implementação de listas de adjacência utilizando objetos específicos de `Vertex` (Vértice) e `Edge` (Aresta), codificados tanto em inglês quanto em português para consolidar a lógica.
* **Caminhamentos/Buscas em Grafos**:
  * **BFS (Breadth-First Search / Busca em Largura)**: Exploração por níveis utilizando filas para visitar primeiro os vértices mais próximos.
  * **DFS (Depth-First Search / Busca em Profundidade)**: Exploração profunda utilizando recursão para percorrer ramos inteiros antes de retroceder.
* **Algoritmos de Caminho Mínimo**:
  * **Algoritmo de Dijkstra**: Encontra os caminhos mais curtos a partir de um vértice de origem para todos os outros nós em um grafo valorado (implementado em `assignments/assignment_09_graphs/dijkstra` e `studies_to_exam/study02`).
  * **Algoritmo de Busca A\* (A-Estrela)**: Algoritmo de busca informada baseado em heurística para traçar rotas eficientes. A implementação foi validada utilizando o clássico **Problema do Mapa da Romênia**, calculando rotas até *Bucharest* a partir de cidades iniciais como *Arad* com base na heurística de distância em linha reta (implementado em `assignments/assignment_09_graphs/a_star` e `studies_to_exam/study03`).

---

## 🛠️ Tecnologias e Ferramentas

* **Linguagem de Programação:** Java (JDK 25)
* **IDE:** IntelliJ IDEA Community Edition
* **Gerenciador de Banco de Dados:** MySQL
* **Bibliotecas:** MySQL Connector/J (v8.0.12)
* **Gerenciamento de Build:** Java puro (gerenciamento manual de pacotes)

---

## ⚙️ Configuração e Execução

Como este repositório é composto por projetos Java convencionais sem ferramentas de build (como Maven ou Gradle), você pode executá-los através da sua IDE Java favorita:

### 1. Configuração do Banco de Dados (Para Exercícios de JDBC/DAO)
Os exercícios de persistência esperam uma instância local do MySQL configurada da seguinte forma:
1. Certifique-se de que o servidor local do MySQL está ativo.
2. Crie o banco de dados e a tabela necessária executando o script SQL abaixo:
   ```sql
   CREATE DATABASE IFTM;
   USE IFTM;

   CREATE TABLE contacts (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(255) NOT NULL,
       email VARCHAR(255) NOT NULL,
       address VARCHAR(255) NOT NULL,
       dateOfBirth DATE NOT NULL
   );
   ```
3. As propriedades de conexão na classe `ConnectionFactory.java` vêm pré-configuradas com:
   * **URL de Conexão:** `jdbc:mysql://localhost/IFTM`
   * **Usuário:** `root`
   * **Senha:** `admin`
   * Caso suas credenciais locais do MySQL sejam diferentes, altere esses valores diretamente na classe de conexão.

### 2. Importando no IntelliJ IDEA
1. Clone este repositório localmente.
2. Abra o IntelliJ IDEA, selecione **Open** e escolha a pasta raiz do repositório.
3. Garanta que o SDK do projeto esteja configurado para a versão JDK 25 (`File > Project Structure > Project > SDK`).
4. Para rodar os exercícios com banco de dados, adicione o arquivo jar do conector localizado na pasta `libs` como biblioteca do módulo:
   * Clique com o botão direito sobre `libs/mysql-connector-java-8.0.12.jar` na árvore de arquivos e selecione **Add as Library...** (ou configure em `Project Structure > Modules > Dependencies`).
5. Abra qualquer arquivo `Main.java` (seja de trabalhos práticos de grafos ou pacotes das aulas de POO) e clique no botão verde **Run** (Executar).

---

## 👨‍💻 Dados Acadêmicos

* **Aluno:** Lucas Emmanuel
* **Instituição:** IFTM – Instituto Federal do Triângulo Mineiro
* **Curso:** Análise e Desenvolvimento de Sistemas (ADS)
* **Período:** 3º Período (2026.1)

</details>
