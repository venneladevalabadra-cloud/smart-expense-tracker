FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN chmod +x mvnw && ./mvnw clean package -DskipTests

EXPOSE 8080

ENV SPRING_PROFILES_ACTIVE=render

CMD ["sh", "-c", "java -Dserver.port=${PORT:-8080} -jar target/*.jar"]
