FROM tomcat:8.5-jre8

COPY target/springxml.war /usr/local/tomcat/webapps
