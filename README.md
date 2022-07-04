# RestDateFormat

Modifying the DateFormat in REST Response based on user's Input Date Pattern (via header)

POST:
curl --location --request POST 'http://localhost:8080/' \
--header 'Authorization: Bearer hello' \
--header 'Content-Type: application/json' \
--data-raw '{
    "eId": 3,
    "name": "Joe",
    "dob": "2022-07-24",
    "doj": "2022-07-26",
    "dojt": "2017-01-13T17:09:42.411"
}'


GET:
curl --location --request GET 'http://localhost:8080/' \
--header 'userId: john' \
--header 'dateFormat: dd/MM/yyyyy' \
--data-raw ''
