# ConstrucaoSW
Projeto de software para reúso, para a disciplina de Construção de Software

Uso:

Para rodar a API, é necessário que o MySQL server esteja rodando, na porta padrão (3306).

Após isso, executar a solução na sua IDE de preferência. A porta de execução é 8080

A API possui mapeados os seguintes objetos (para mapear outros objetos, é necessário adicionar as respectivas classes em com.yamapi.crud_rest.repository):

Project:

    String projectName; (PK)
    
    int numberMembers;
    
    String description;
    
    String dueDate;
    
User: 

    String username; (PK)
    
    String password;
    
    String name;
    
    String email;
 
 
 As requisições seguem o seguinte padrão:
 
 http://localhost:8080/{objeto}/{parametro}
 
 As operações HTTP suportadas são:
 
 Get - retorna todos os elementos de uma coleção (esta requisição não possui parâmetros).
 
 Get - retorna um objeto especificado
 
 Post - cria um novo objeto
 
 Put - atualiza um objeto especificado (obs: campos não declarados no body da requisição são atualizados com o valor <null>)
    
 Delete - remove um objeto especificado
 
 Segue abaixo um exemplo de body para requisições POST e PUT:
 
 {
 "username":"marlon",
 "password":"123",
 "name":"marlon",
 "email":"marlon@teste.com.br"
 }
 
 
