sample application Projects
=======
This contains all library projects and web applications
for Flint Integration and Extensibility

Module Structure
========
Libraries:
-------------


Web Applications:
-------------
* fief-camel-fca-web
* fief-camel-jde-web


Build Commands
========
Build only

    mvn install -DskipTests=true

Build and run all tests

    mvn install
    
Build and run tests for a specific module only (eg. fief-spring-batch)
    
    mvn test -Dspring.profiles.active=dev -pl :fief-spring-batch
    
Build and run tests and view the code coverage reports
    
    mvn clean test -Dspring.profiles.active=dev -P=dev-code-coverage
    
Build and run tests against the AECOM DV environment (the web services and database)

    mvn clean test -Dspring.profiles.active=production -Dspring.profiles.subenv=dv911

