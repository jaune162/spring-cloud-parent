FROM java:8
VOLUME /tmp
ADD target/nacos-book-service.jar /nacos-book-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/nacos-book-service.jar"]