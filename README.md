# Resturant_Weeklytest
# Requirments
IntelliJIDEA
* Serverport: 8080 (use: localhost:8080)
* Java version: 17
* Everything is present in the pom.xml (no need to download any library)

## Steps to run Resturant model System
* Download the source code and import in intellijIDEA.
* Go to localhost:8080/ URL * Type endpoints in The
* UserIdURL Resturant will have the following details
* id
* Name
* Address
* number
* speciality
* Total_staff

Rest will have following operations -
### -> Add Rest Info - 
In AddRest functionality we Post Rest info through Postman and it gets added to the Rest list -
* End point-http://localhost:8080/addRest
### -> Get Rest Info by Id -
In this functionality we provide a perticular REst info by sending the id in url through @Pathvariable -
* Endpoint-http://localhost:8080/api/findById/{id}
### Get all REst Info -
This functionality provides all Rest info list -
* Endpoint- http://localhost:8080/getRest
###  Update REst Info by Id-
This functionality Updates a perticular Rest info through Postman by sending id in url -
* Endpoint -> http://localhost:8080/update/{Id}

###  Delete Rest Info by Id-
This functionality deletes particular Rest info through Postman using the Delete method by sending the resturant-id in URL-
* Endpoint-> http://localhost:8080/delete/{id}
## Note
* You can change server port by setting properties in application.properties file i.e.
   server.port=8081
