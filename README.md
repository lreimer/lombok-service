[![pipeline status](https://gitlab.qaware.de/qaware/qacampus/lombok-service/badges/master/pipeline.svg)](https://gitlab.qaware.de/qaware/qacampus/lombok-service/commits/master)

# Reducing Boilerplate Code with Project Lombok

This repository demonstrates the usage of Project Lombok to reduce common boilerplate code
of an ordinary Java EE 8 microservice application.

## Building and Running

```bash
$ ./mvnw clean package

$ docker build -t lombok-service:1.0 .
$ docker run -it -p 8080:8080 lombok-service:1.0 
```

## Maintainer

Mario-Leander Reimer (@reimer), <mario-leander.reimer@qaware.de>

## License

This software is provided under the MIT open source license, read the `LICENSE.txt` 
file for details.