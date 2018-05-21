# This Dockerfile is ran by Maven during the `package` phase.
# If running manually it should be built from the elucidate-server
# module after building `annotations.war` artifact.

# We use a JRE 10 image so the JVM is able to discover Docker's
# memory/cpu cgroup settings.
FROM tomcat:8-jre10
MAINTAINER Gary Tierney <gary.tierney@digirati.com>
EXPOSE 8080

ARG ARTIFACT_NAME="annotation.war"
ADD target/${ARTIFACT_NAME} /usr/local/tomcat/webapps/annotation.war

ENV BASE_SCHEME="http"
ENV BASE_HOST="localhost"
ENV BASE_PORT="8080"
ENV BASE_PATH="/annotation"

ENV DATABASE_URL="jdbc:postgresql://database:5432/annotations"
ENV DATABASE_USER="annotations_user"
ENV DATABASE_PASSWORD=""

ENV CATALINA_OPTS="-Ddb.url=$DATABASE_URL -Ddb.user=$DATABASE_USER -Ddb.password=$DATABASE_PASSWORD"
