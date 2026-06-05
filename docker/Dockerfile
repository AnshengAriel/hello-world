FROM openjdk:11.0.3-stretch
LABEL authors="ariel"

EXPOSE 7079

WORKDIR /root

ADD helloworld/*.jar /root/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]