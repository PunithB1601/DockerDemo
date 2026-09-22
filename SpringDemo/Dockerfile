FROM openjdk-17
RUN 'mvn clean package -DskipTest'
COPY /target/Demo.jar /usr/app/Demo.jar
WORKDIR /usr/app
ENTRYPOINT [ "java","-jar","Demo.jar"]
