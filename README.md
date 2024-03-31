# TRAINING ON MICROSERVICES

### What is spring application context?
The Spring Application Context is the central interface within the Spring Framework for providing configuration information to the application and managing the beans (objects) that compose the application. It's essentially the container that holds all the beans and manages their lifecycle.

### Notes for the upcoming program on Udemy
- Set up a spring boot project (java 21, web dependency)
- make sure java_home is version 21

@MockBean: A bean is any object managed by the spring container (@service, @component, ...)
@Autowired: manages all dependencies and auto injects them when needed

### To run a test
$ mvnw -Dtest=MultiplicationServiceTest test