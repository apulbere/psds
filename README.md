### Proof of concept, application working with sql and nosql databases based on active profile

### Prerequisites
* Oracle Database
* MongoDB
* [Optionally] Java 14
* execute `./mvnw clean install`


#### Run with Oracle
```
./mvnw spring-boot:run -Dspring-boot.run.profiles=orca -f petshop-app/pom.xml -Porca
```

#### Run with MongoDB
```
./mvnw spring-boot:run -Dspring-boot.run.profiles=mongo -f petshop-app/pom.xml -Pmongo
```


#### Useful
Temporarily change Java version on MacOS
```
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-14.jdk/Contents/Home 
```
If you have `ORA-12705: Cannot access NLS data files or invalid environment specified` then you should pass the following VM options
```
-Duser.region=us -Duser.language=en
```