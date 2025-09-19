provides information about countries that are downloaded by webcrawler

curl -X GET http://localhost:8080/api/countries/exists/Norway
true / false 

curl -X GET http://localhost:8080/api/countries/Norway
{
  "id": 1,
  "uid": "country-001",
  "version": 1,
  "name": "Norway",
  "capital": "Oslo",
  "population": 5421241,
  "area": 148729
}

curl -X GET http://localhost:8080/api/countries
{ 
  name : country
, name : country1
}

