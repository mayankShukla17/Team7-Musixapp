FROM openjdk
WORKDIR /usr/src
ENV MYSQL_HOST=localhost
ENV MYSQL_DATABASE=root
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=root
COPY ./target/UserModule-0.0.1-SNAPSHOT.jar UserModule-0.0.1-SNAPSHOT.jar
#EXPOSE 8082
ENTRYPOINT ["java","-jar","/usr/src/UserModule-0.0.1-SNAPSHOT.jar"]