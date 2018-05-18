# This Dockerfile is ran by Maven during the `package` phase.
# If running manually it should be built from the elucidate-server
# module after building `annotations.war` artifact.

# We use a JRE 10 image so the JVM is able to discover Docker's
# memory/cpu cgroup settings.
FROM tomcat:8-jre10
MAINTAINER Gary Tierney <gary.tierney@digirati.com>

ENV eluicdate.server.properties /srv

# The file name of the built elucidate-server artifact.
ARG ARTIFACT_NAME
ADD target/${ARTIFACT_NAME} /usr/local/tomcat/webapps/annotations.war

EXPOSE 8080
