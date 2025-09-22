provides information about countries that are downloaded by webcrawler  
  
Technical requirements:  
Java 21 or higher  
Apache Maven 3.9.x or later  
MongoDB 4.4+  

To Run a Project :  
mvn clean install  
java -jar countriesWebApi-1.0-VERSION.jar    
    
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
  
