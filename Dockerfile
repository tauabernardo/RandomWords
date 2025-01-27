# Use uma imagem base do JDK
FROM openjdk:17-jdk-alpine

# Diretório de trabalho no container
WORKDIR /app

# Copia o arquivo JAR gerado pelo Maven para o container
COPY target/randomw-0.0.1-SNAPSHOT.jar app.jar

# Comando para executar o JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
