FROM adoptopenjdk/openjdk11:jdk-11.0.11_9-alpine
VOLUME /tmp
COPY ./build/libs/config-management-with-spring-cloud-k8s-1.0.0.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -jar /app.jar --debug