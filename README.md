# JavaFX com JDBC
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/pLogicador/javafx-jdbc-workshop/blob/main/LICENSE) 

# Sobre o projeto

Este projeto é uma aplicação JavaFX conectada a um banco de dados MySQL utilizando JDBC. Foi desenvolvido para introduzir os conceitos de desenvolvimento de aplicações desktop com JavaFX, 
juntamente com a integração de banco de dados via JDBC.


## Layout da Aplicação
![layout](https://github.com/user-attachments/assets/cd61fdda-6b2c-4732-9f62-884f33c95924)

## Cadastro de Departamentos e Vendedores
![demo1](https://github.com/user-attachments/assets/88c5d795-1bb1-43ee-ade5-95f6918ec4c7) ![demo2](https://github.com/user-attachments/assets/c75925b5-fef1-4b33-a7d3-dd5767f794fa)


# Tecnologias utilizadas
## Back end
- JavaFX
- JDBC

# Como executar o projeto

## Pré-requisitos 
* Java 11
* MySQL

## Passos para compilar e executar

<details>
  <summary><strong>1. Compilar e gerar o JAR</strong></summary>

* Gerar o arquivo JAR:
1. Clique com o botão direito no nome do projeto no IDE.
2. Selecione `Exportar`.
3. Vá para `Java` -> `Runnable JAR file` e clique em `Next`.
4. Selecione a classe principal (Main class).
5. Escolha a pasta de destino para salvar o JAR.
6. Em `Library handling`, selecione a terceira opção: `Package required libraries into generated JAR`.

* Pacote com arquivos:
1. Inclua o arquivo `JAR`.
2. Inclua o arquivo `db.properties`.
3. Inclua o `MySQL Connector`.
4. Inclua o `JavaFX SDK`.
5. Inclua o `Java JDK`.

</details>
<details>
  <summary><strong>2. Instalação e configuração do ambiente</strong></summary>

* Instalar o Java:
1. Faça o download e instale a JDK no link: [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/?er=221886).
2. Configure a variável de ambiente `JAVA_HOME` (Ex: `C:\Program Files\Java\jdk-17.0.3`).

* Copiar JavaFX:
3. Baixe o SDK do JavaFX e configure a variável de ambiente `PATH_TO_FX` (Ex: `C:\java-libs\javafx-sdk\lib`).
4. Coloque o MySQL Connector na pasta lib.

* Copiar JAR e db.properties:
5. Copie o arquivo JAR e o arquivo `db.properties` para a pasta de destino onde você deseja executar a aplicação.

</details>
<details>
  <summary><strong>3. Executar a aplicação</strong></summary>
 
```bash
java --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml -cp myapp.jar application.Main

```
</details>
<details>
  <summary><strong>4. (Opcional) Criar um arquivo BAT para execução</strong></summary>
 
```bash
java --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml -cp myapp.jar application.Main
```
</details>
<details>
  <summary><strong>5. (Opcional) Criar um atalho no Windows</strong></summary>

```bash
# No campo "Target" do atalho, use:
"C:\Program Files\Java\jdk-17.0.3\bin\java.exe" --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml -cp myapp.jar application.Main

# No campo "Start in", insira o caminho da pasta onde está o aplicativo:
C:\appfolder
```
</details>

# Autor

 Pedro Miranda - pLogicador

[LinkedIn](https://www.linkedin.com/in/pedroesm/)

