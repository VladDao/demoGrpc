#FROM adoptopenjdk/openjdk14:jdk-14.0.2_12-ubuntu-slim
#RUN addgroup --system spring && adduser --system --ingroup spring spring
#USER spring:spring
#COPY build/libs/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]


##FROM adoptopenjdk/openjdk14:jdk-14.0.2_12-ubuntu-slim
#FROM openjdk:15 as demo-rest
##RUN addgroup --system spring && adduser --system --ingroup spring spring
##USER spring:spring
#ARG JAR_FILE=demo-rest/build/libs/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#
#EXPOSE 8080

#FROM openjdk:15 as demo_rest
#ENV MODULE_REST=/root/dev/rest/
#RUN mkdir -p $MODULE_REST/src/main/java
#WORKDIR $MODULE_REST
#COPY demo-rest/build.gradle gradlew gradlew.bat $MODULE_REST
#COPY gradle $MODULE_REST/gradle
#RUN ./gradlew build -x :bootRepackage
##-x test --continue
#COPY demo-rest/.* .
#RUN ./gradlew build

FROM openjdk:15 as demo_rest
ENV APP_HOME=/root/dev/myapp/
RUN mkdir -p $APP_HOME/src/main/java
WORKDIR $APP_HOME
COPY build.gradle gradlew gradlew.bat $APP_HOME
COPY gradle $APP_HOME/gradle
# download dependencies
#RUN ./gradlew build -x :bootJar -x test --continue
#COPY . .
RUN ./gradlew build

FROM openjdk:15
WORKDIR /root/
COPY --from=demo_rest /root/dev/myapp/build/libs/myapp.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","/myapp.jar"]

#FROM adoptopenjdk/openjdk14:jdk-14.0.2_12-ubuntu-slim
#RUN addgroup --system spring && adduser --system --ingroup spring spring
#USER spring:spring
#COPY build/libs/*.jar *.jar
#ENTRYPOINT ["java","-jar","/demo-0.0.1-SNAPSHOT"]