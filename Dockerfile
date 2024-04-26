FROM  ubuntu:latest
FROM  openjdk:17
RUN mkdir student
COPY target/StudentDemo-0.0.1-SNAPSHOT.war /student
EXPOSE 8080
CMD ["java", "-jar","student/StudentDemo-0.0.1-SNAPSHOT.war"]
