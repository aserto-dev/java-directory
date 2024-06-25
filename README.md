# java-directory

[![slack](https://img.shields.io/badge/slack-Aserto%20Community-brightgreen)](https://asertocommunity.slack.com)

Java GRPC bindings for aserto directory. Those are raw bindings, for a better developer experience we recommend you use [aserto-java](https://github.com/aserto-dev/aserto-java) or [aserto-spring](https://github.com/aserto-dev/aserto-spring) if your project already uses Spring.


## Requirements
- [buf cli](https://docs.buf.build/installation)
- [maven](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html)
- java 1.8 or newer

### Building the project
```bash
mvn clean package
```
 If you want to install the package to your local maven repository in order to include it in other projects
```bash
mvn clean install
```
