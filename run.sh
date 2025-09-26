mvn clean package -DskipTests
docker build . -t mauron/micro-docker:1
docker push mauron/micro-docker:1
