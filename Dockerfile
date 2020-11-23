FROM adoptopenjdk/openjdk14:jdk-14.0.2_12-ubuntu-slim
RUN addgroup --system spring && adduser --system --ingroup spring spring
USER spring:spring
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

#FROM adoptopenjdk/openjdk14:jdk-14.0.2_12-ubuntu-slim
#RUN addgroup --system spring && adduser --system --ingroup spring spring
#USER spring:spring
#COPY build/libs/*.jar *.jar
#ENTRYPOINT ["java","-jar","/demo-0.0.1-SNAPSHOT"]