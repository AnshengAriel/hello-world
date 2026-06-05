FROM openjdk:11.0.3-stretch
LABEL authors="ariel"

EXPOSE 7079

WORKDIR /root

# 工作空间默认是Dockerfile文件所在目录
ADD *.jar /root/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]