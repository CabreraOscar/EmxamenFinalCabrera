#inicia con la imagen base que contiene Java runtime
FROM openjdk:17-jdk-alpine

# se agregar el jar del microservicio al contenedor
COPY target/ExamenPracticoM5A-0.0.1-SNAPSHOT.jar ExamenPracticoM5A-0.0.1-SNAPSHOT.jar

#se ejecuta el microservicio
ENTRYPOINT ["java","-jar","/ExamenPracticoM5A-0.0.1-SNAPSHOT.jar"]