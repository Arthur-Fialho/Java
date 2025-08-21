# Bootcamp Project

## Descrição

Este é um projeto em Java que simula uma plataforma de bootcamp. A plataforma permite a criação de bootcamps, que por sua vez contêm cursos e mentorias. Os desenvolvedores podem se inscrever nos bootcamps, progredir nos conteúdos e acompanhar seu desenvolvimento.

## Funcionalidades

- **Criação de Bootcamps:** Permite a criação de bootcamps com nome, descrição e um conjunto de conteúdos (cursos e mentorias).
- **Criação de Cursos e Mentorias:** Possibilita a criação de cursos com carga horária e mentorias com data definida.
- **Inscrição de Desenvolvedores:** Desenvolvedores podem se inscrever em bootcamps para acessar os conteúdos.
- **Acompanhamento de Progresso:** Os desenvolvedores podem marcar os conteúdos como concluídos e acompanhar seu progresso.
- **Cálculo de XP:** O sistema calcula a experiência (XP) total de um desenvolvedor com base nos conteúdos concluídos.

## Como Executar

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
2. **Navegue até o diretório do projeto:**
   ```bash
   cd nome-do-repositorio
   ```
3. **Compile os arquivos Java:**
   ```bash
   javac -d bin src/Main.java src/br/com/bootcamp/project/domain/*.java
   ```
4. **Execute a classe principal:**
   ```bash
   java -cp bin Main
   ```
## Estrutura do Projeto
O projeto está organizado da seguinte forma:

- `src`: Contém os arquivos de código-fonte `.java`.
  - `Main.java`: A classe principal que executa a simulação.
  - `br/com/bootcamp/project/domain`: Pacote que contém as classes de domínio do projeto:
    - `Bootcamp.java`: Representa um bootcamp.
    - `Conteudo.java`: Classe abstrata que representa um conteúdo do bootcamp.
    - `Curso.java`: Representa um curso.
    - `Mentoria.java`: Representa uma mentoria.
    - `Dev.java`: Representa um desenvolvedor.
- `bin`: Contém os arquivos `.class` compilados.
- `lib`: Contém as bibliotecas de terceiros (se houver).
- `README.md`: Este arquivo.
