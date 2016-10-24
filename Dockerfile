FROM us.gcr.io/github-workshop/front-end:0.2

MAINTAINER Academy Github Workshop <academy.github.workshop@gmail.com>

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/back-end/java/back-end.jar"]

COPY target/back-end-0.0.1-SNAPSHOT.jar /back-end/java/back-end.jar
