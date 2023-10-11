FROM openjdk:17-jdk-slim
ADD target/*.jar micro-docker.jar
EXPOSE 8080
ENV JAVA_OPTS=
CMD java ${JAVA_OPTS} -jar micro-docker.jar