# spring-boot-jpa-demo

Demontrates using Spring Data JPA with Spring MVC REST Controllers  
- How to return a single object where the query is expected to  return one.
- How to do paged queries that return slices or pages.
- How to do "Projections".
- How to throw custom Exceptions that return specific HTTP codes.
- How to validate objects passed to Controllers.
- How to pass optional and required parameters.
- How to convert Get parameters to an object.
- How to used Named queries.
- How to use Lombok with Spring Boot.

Notes:
- And embedded database is used so the app is runnable.
- While this application does mostly do REST it is not 100% REST.
- Entities typically should not be returned by Controllers but is done for demo purposes.
- See the spring-boot-mongodb-demo for the same app only using MongoDB.