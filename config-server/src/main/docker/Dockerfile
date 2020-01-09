FROM openjdk:8-jre-alpine
COPY config-server-1.0.0-SNAPSHOT.jar /usr/local/rtrs/config-server.jar
WORKDIR /usr/local/rtrs

RUN echo "Asia/Taipei" > /etc/timezone

EXPOSE 9999
CMD ["sh", "-c", "java ${JVM_OPTS} -jar /usr/local/rtrs/config-server.jar"]