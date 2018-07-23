# springxml
A prototype example Spring web application configured without annotations

## Configuration

The Spring dispatcher servlet is expecting to find a context configuration in the local web application
`conf/spring.xml` file. Spring application configuration is ideally externalized and not embedded inside
of the war application itself; though some components might be best configured inside of the web application
archive (typically in the WEB-INF directory), and other configuration options externalized.

Modify the `conf/spring.xml` file from the distribution. Place it in a suitable location to be included
inside a docker volume or copied directly into the web application container.

The examples below use a Docker container based on Tomcat. The web application archive is copied into
the image via the docker build step. While the spring configuration file, in the example, is mounted
as a docker volume file.

## Building

```
$> mvn clean verify

$> docker build -t taftster/springxml .
```


## Running

```
docker run \
  -it --rm \
  -p 8080:8080 \
  -v /path/to/conf/spring.xml:/usr/local/tomcat/conf/spring.xml \
  taftster/springxml
```

## Browsing

```
http://localhost:8080/springxml
```
