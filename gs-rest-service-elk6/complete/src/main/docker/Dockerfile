FROM openjdk:8-jre-alpine
COPY elk-client-1.0.0-SNAPSHOT.jar /usr/local/rtrs/app.jar
WORKDIR /usr/local/rtrs

RUN echo "Asia/Taipei" > /etc/timezone

EXPOSE 8088
CMD ["sh", "-c", "java ${JVM_OPTS} -jar /usr/local/rtrs/app.jar"]