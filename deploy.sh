docker pull amazoncorretto:17-alpine-jdk
./mvnw clean package jib:dockerBuild -P $1 -DskipTests
docker compose -f docker-compose.$1.yaml up -d --force-recreate --build camdigikey_client_app
docker logs camdigikey_client_app -f --tail 100
