
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

###Através de localhost:8080/swagger-ui.html também é possível ter acesso aos métodos
