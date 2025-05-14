# java-socket-server-client
Projeto de comunicação cliente-servidor em Java utilizando sockets TCP. O cliente se conecta ao servidor e recebe a data e hora atual. O servidor aguarda conexões na porta 65535 e responde com a data do sistema. Demonstra conceitos de rede e entrada/saída (I/O).


## Objetivo do Projeto

Este projeto tem como objetivo colocar em prática o uso de **sockets** em **Java** para implementar uma comunicação simples entre um **cliente** e um **servidor**. A ideia é entender como funciona a troca de mensagens em rede, utilizando o protocolo **TCP**.

### O que Aprendi

Durante a implementação deste projeto, aprendi os seguintes conceitos:

- **Sockets TCP**: Como criar uma conexão entre cliente e servidor utilizando o protocolo TCP em Java.
- **Comando `ServerSocket`**: Como o servidor cria um socket e aguarda conexões de clientes.
- **Entrada/Saída em Java**: Manipulação de dados enviados e recebidos através de streams.
- **Multithreading** (Caso você queira expandir no futuro): Uma extensão possível para permitir múltiplos clientes simultaneamente.

## Descrição do Funcionamento

### 1. **Servidor**
   - O **servidor** aguarda as **conexões** dos **clientes** na **porta 65535**.
   - Quando um cliente se conecta, o servidor envia a **data e hora atual** como resposta.
   
### 2. **Cliente**
   - O **cliente** solicita ao usuário o **endereço IP** do servidor e faz a conexão.
   - Após a conexão, o cliente exibe a **data e hora** que o servidor enviou em uma janela gráfica, usando o **JOptionPane**.

Este projeto foi realizado de forma simples e pode ser expandido com funcionalidades como autenticação, múltiplos clientes ou até mesmo integração com banco de dados.

