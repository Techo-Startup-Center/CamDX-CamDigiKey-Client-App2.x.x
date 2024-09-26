docker pull amazoncorretto:17-alpine-jdk
./mvnw clean package jib:dockerBuild -DskipTests
docker compose -f docker-compose.dev.yaml up -d --force-recreate --build camdigikey_client_app
docker logs camdigikey_client_app -f --tail 100
