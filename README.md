# java-directory

[![slack](https://img.shields.io/badge/slack-Aserto%20Community-brightgreen)](https://asertocommunity.slack.com)

Generated Java gRPC bindings for the Topaz and Aserto Directory Service; these are low-level bindings. 
For a more idiomatic Java development experience, we advise using the [aserto-java](https://github.com/aserto-dev/aserto-java) or [aserto-spring](https://github.com/aserto-dev/aserto-spring) when your project is using Spring.


## Requirements
- GNU make
- [maven](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html)
- Java 8 or newer

If you need to regenerate the protobuf binding you will also need the: 
- [buf cli](https://docs.buf.build/installation), which will be installed by using `make deps`

### Building the project
```bash
make build
```

or

```bash
mvn clean package
```

 If you want to install the package to your local maven repository in order to include it in other projects

```bash
make install
```

or

```bash
mvn clean install
```
