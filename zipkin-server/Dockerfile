FROM java:8
VOLUME /tmp
ADD target/zipkin-server.jar /zipkin-server.jar
EXPOSE 8081
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/zipkin-server.jar"]