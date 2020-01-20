FROM openjdk:8-jre-alpine
COPY eureka-client-1.0.0-SNAPSHOT.jar /usr/local/rtrs/client.jar
COPY pinpoint-bootstrap-1.8.5.jar /usr/local/rtrs/pinpoint-bootstrap-1.8.5.jar
WORKDIR /usr/local/rtrs

RUN echo "Asia/Taipei" > /etc/timezone

EXPOSE 8080
CMD ["sh", "-c", "java ${JVM_OPTS} -jar /usr/local/rtrs/client.jar"]