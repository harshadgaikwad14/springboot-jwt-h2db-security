>>> Register User

POST /register HTTP/1.1
Host: localhost:8080
Content-Type: application/json
cache-control: no-cache
Postman-Token: d6840f6e-80a8-46dc-afa1-68feb9e53e3b
{
    "username": "admin",
    "password": "admin"
}

============================
>>> Generate Token

POST /authenticate HTTP/1.1
Host: localhost:8080
Content-Type: application/json
cache-control: no-cache
Postman-Token: d1da8369-de79-4a2f-8277-e46dc8a9fff2
{
    "username": "admin",
    "password": "admin"
}

Response : 
{
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTU3MDYzOTE5NSwiaWF0IjoxNTcwNjIxMTk1fQ.9_nJA5gw-CIaoPmVtMl1roO2cY5HHfpc22mwkVHl36V-287XES7tM4VedCIr8mkrZ08qg_KpO55uZ6dl3NvAxw"
}

=====================

>>> Access Resource 

GET /hello HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTU3MDYzOTE5NSwiaWF0IjoxNTcwNjIxMTk1fQ.9_nJA5gw-CIaoPmVtMl1roO2cY5HHfpc22mwkVHl36V-287XES7tM4VedCIr8mkrZ08qg_KpO55uZ6dl3NvAxw
cache-control: no-cache
Postman-Token: 65581112-5aaa-4f8e-afd3-cebec2450202


Response : 

Hello World

