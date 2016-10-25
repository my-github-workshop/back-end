FROM us.gcr.io/github-workshop/front-end:0.2

MAINTAINER Academy Github Workshop <academy.github.workshop@gmail.com>

COPY target/back-end-0.0.1-SNAPSHOT.jar /back-end/java/back-end.jar

EXPOSE 8080

WORKDIR /back-end
ENTRYPOINT ["java", "-jar", "./java/back-end.jar"]
