FROM openjdk:8-jre-alpine
COPY admin-1.0.0-SNAPSHOT.jar /usr/local/rtrs/admin.jar
WORKDIR /usr/local/rtrs

RUN echo "Asia/Taipei" > /etc/timezone

EXPOSE 8888
CMD ["sh", "-c", "java ${JVM_OPTS} -jar /usr/local/rtrs/admin.jar"]