FROM openjdk:21-jdk-slim
ADD target/*.jar micro-docker.jar
ENV JAVA_OPTS=
CMD java ${JAVA_OPTS} -jar micro-docker.jar