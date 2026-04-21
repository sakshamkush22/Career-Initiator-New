FROM tomcat:9.0

# dist folder ke andar se file copy karein
COPY dist/careerinitiator.in.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]