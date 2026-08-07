# EasyBytes Microservices

This README contains the Maven and Docker commands used to build, run, inspect, and manage the microservices.

## Maven Commands

### Create the JAR

Run this command from the directory where `pom.xml` is present:

```bash
mvn clean install
```

The JAR for the application is created in the `target` folder.

### Run the Spring Boot Application

```bash
mvn spring-boot:run
```

Runs the Spring Boot application using Maven.

### Run with a Specific Spring Profile

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=local
```

Runs the application using the `local` Spring profile.

### Run the Generated JAR

After running `mvn clean install`, go to the `target` directory:

```bash
java -jar accounts-0.0.1-SNAPSHOT.jar
```

Example:

```text
easybytes-microservices\accounts\target>java -jar accounts-0.0.1-SNAPSHOT.jar
```

---

# Docker Commands

## Check Docker Version

```bash
docker version
```

## Build a Docker Image

### Syntax

```bash
docker build . -t <dockerUsername>/<imageName>:<version>
```

### Example

```bash
docker build . -t kumarsujay1994/accounts:easybytes1
```

`-t` is used to assign a tag/name to the Docker image.

## List Docker Images

```bash
docker images
```

## Delete a Docker Image

```bash
docker rmi <imageId>
```

Example:

```bash
docker rmi 0a63aa899386
```

## Inspect a Docker Image

### Syntax

```bash
docker inspect <imageID>
```

### Example

```bash
docker inspect 0a63aa899386
```

## Run a Docker Container

### Syntax

```bash
docker run -p <Host Port>:<Container Port> <imageName>:<tag>
```

### Example

```bash
docker run -p 8080:8080 kumarsujay1994/accounts:easybytes1
```

The `-p` option maps the host port to the container port.

```text
Host Port  --->  Container Port
   8080    --->       8080
```

## Run a Docker Container with a Specific Spring Profile

### Syntax

```bash
docker run -e SPRING_PROFILES_ACTIVE=<profileName> -p <hostPort>:<containerPort> <imageName>:<tag>
```

### Example

```bash
docker run -e SPRING_PROFILES_ACTIVE=docker -p 8080:8080 kumarsujay1994/accounts:easybytes1
```

`-e` is used to pass an environment variable to the container.

> **Important:** Do not put spaces around `=` in `SPRING_PROFILES_ACTIVE=docker`.

This activates the `docker` Spring profile inside the container.

## Display Currently Running Containers

```bash
docker ps
```

## Display All Containers

```bash
docker ps -a
```

`-a` means **all**, including stopped containers.

## Start an Existing Container

```bash
docker start <containerId>
```

## Stop a Running Container

```bash
docker stop <containerId>
```

---

# Quick Reference

| Purpose | Command |
|---|---|
| Build Maven project | `mvn clean install` |
| Run Spring Boot app | `mvn spring-boot:run` |
| Run with profile | `mvn spring-boot:run -Dspring-boot.run.profiles=local` |
| Run JAR | `java -jar accounts-0.0.1-SNAPSHOT.jar` |
| Check Docker version | `docker version` |
| Build Docker image | `docker build . -t <username>/<image>:<tag>` |
| List images | `docker images` |
| Delete image | `docker rmi <imageId>` |
| Inspect image | `docker inspect <imageId>` |
| Run container | `docker run -p 8080:8080 <image>:<tag>` |
| Run with profile | `docker run -e SPRING_PROFILES_ACTIVE=docker -p 8080:8080 <image>:<tag>` |
| Running containers | `docker ps` |
| All containers | `docker ps -a` |
| Start container | `docker start <containerId>` |
| Stop container | `docker stop <containerId>` |
