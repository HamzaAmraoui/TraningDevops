FROM openjdk:17
ADD target/demo-0.0.1-SNAPSHOT.jar /usr/share/training-spring-boot.jar
CMD ["java", "-jar", "usr/share/training-spring-boot.jar"]