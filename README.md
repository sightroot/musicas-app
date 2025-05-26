
# Music Management App

Este é um projeto de aplicação web desenvolvida com **Spring Boot** e **H2 Database**. O objetivo é permitir o cadastro e a listagem de músicas, com validação de campos obrigatórios para garantir que os dados inseridos sejam válidos.

### Funcionalidades:
- **Listagem de Músicas**: Exibe todas as músicas cadastradas.
- **Cadastro de Nova Música**: Formulário para cadastrar novas músicas, com validação dos campos (título, artista e ano de lançamento).

### Tecnologias Utilizadas:
- **Spring Boot**: Framework para criação de aplicações web Java.
- **H2 Database**: Banco de dados relacional em memória (configurado para persistir em arquivo).
- **JPA (Java Persistence API)**: Para o gerenciamento de dados relacionais.
- **Bootstrap**: Framework CSS para estilização do frontend.

---

## Como Executar o Projeto

### 1. Clonando o Repositório

Clone o repositório do GitHub:

```bash
git clone https://github.com/SEU_USUARIO/music-management-app.git
cd music-management-app
```

### 2. Configuração do Ambiente

Certifique-se de que você tenha **Java 21** ou superior instalado no seu computador. Você pode verificar se o Java está instalado executando o comando:

```bash
java -version
```

### 3. Rodando o Projeto

Se você não tem o **Maven** instalado, o projeto já inclui o **Maven Wrapper** (`mvnw`), então você pode rodar o comando diretamente:

```bash
.\mvnw spring-boot:run
```

Ou, se você já tiver o **Maven** instalado globalmente, execute:

```bash
mvn spring-boot:run
```

Isso irá iniciar a aplicação no servidor **localhost:8080**.

### 4. Acessando a Aplicação

Após iniciar a aplicação, abra o navegador e vá até:

- **Página de Listagem de Músicas**: `http://localhost:8080/musicas`
- **Página de Cadastro de Músicas**: `http://localhost:8080/musicas/novo`

### 5. Acessando o Console H2 (Banco de Dados)

A aplicação usa o banco de dados **H2** (embora você possa configurá-lo para outro banco, como MySQL). Para acessar o console do banco de dados, vá até:

```
http://localhost:8080/h2-console
```

- **JDBC URL**: `jdbc:h2:file:C:/Users/daniel.yuji_v/musicas-2025` (ou o caminho que você configurou)
- **Username**: `sa`
- **Password**: (deixe em branco)

---

## Estrutura do Projeto

A estrutura do projeto é a seguinte:

```
src/
 └── main/
      └── java/
           └── com/
                └── example/
                     └── demo/
                          ├── DemoApplication.java          # Classe principal do Spring Boot
                          ├── Musica.java                  # Entidade Musica
                          ├── MusicaController.java        # Controlador das requisições
                          ├── MusicaService.java           # Lógica de serviço para músicas
                          └── MusicaRepository.java        # Repositório JPA para persistência
      └── resources/
           └── static/
                └── index.html                  # Página inicial
           └── templates/
                └── musicaForm.html             # Formulário de cadastro de música
                └── musicas.html                # Página de listagem de músicas
           └── application.properties          # Configurações do Spring Boot e do H2
```

### Descrição dos Arquivos:
- **Musica.java**: Representa a entidade Musica no banco de dados.
- **MusicaController.java**: Controlador que lida com as rotas e interações do usuário.
- **MusicaService.java**: Lógica de serviço que interage com o repositório de músicas.
- **MusicaRepository.java**: Interface do JPA para interação com o banco de dados.
- **application.properties**: Configurações do Spring Boot e H2 Database.

---

## Como Contribuir

1. **Fork o repositório**.
2. **Crie uma branch** para a sua feature: `git checkout -b minha-feature`.
3. **Commit suas mudanças**: `git commit -am 'Adiciona nova funcionalidade'`.
4. **Push para a branch**: `git push origin minha-feature`.
5. **Abra um Pull Request** para o repositório principal.

---

## Licença

Este projeto está sob a licença **MIT**. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

### Personalizações

- **Validação de Formulário**: Usando **Java Bean Validation** (`@NotBlank` e outras anotações) para garantir que todos os campos do formulário sejam preenchidos corretamente.
- **Interação com o Banco de Dados**: A aplicação usa **Spring Data JPA** para realizar a persistência dos dados de música no banco de dados H2.
