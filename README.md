### Sistema de Registro de Usuários em banco de dados MySQL




### Postman

### CURL
```
curl --location --request POST 'localhost:8080/api/v1/registration' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "Jonathan",
    "lastName": "Silva",
    "email": "jonathan@gmail.com",
    "password": "password"
}'
```
### Tutorial
Para utilizar o método de post e basta utilizar o formato

{

"firstName": "Jonathan",

"lastName": "Silva",

"email": "jonathan@gmail.com",

"password": "password"

}


Com isso o usuário será registrado no banco de dados

### Através de localhost:8080/swagger-ui.html seria possível ter acesso aos métodos

Infelizmente o swagger ainda não está funcional devido a um bug envolvendo um arquivo HTML que não existe no meu computador, GitHub e nem mesmo na outra máquina
que testei, mas ele ainda substitui a interface no localhost.

### Atualizações Planejadas
1 - Reformulação do projeto para maior simplificação

2 - Implementação de interface responsiva

3 - Customização da interface para melhor associação à marca Oliveira Trade

4 - Implementação de novas funcionalidades
