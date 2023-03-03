# java-directory examples
[![slack](https://img.shields.io/badge/slack-Aserto%20Community-brightgreen)](https://asertocommunity.slack.com)


## 1. building the examples

Ensure you are in the `example` directory, and execute:

```
mvn clean && mvn package
```

## 2. setup environment

### Using [topaz](https://topaz.sh)

There is **no** configuration is required when connecting to a **local** topaz directory instance. 

By default the examples use `localhost:9292` as the host and port to connect to.

When connecting to a remote topaz directory instance, you need to provide the host address and port, by setting the respective environment variables.

```
export ASERTO_DIRECTORY_HOST=<host name>
export ASERTO_DIRECTORY_PORT=<port number>

```

### Using the hosted aserto directory 

To connect to the hosted aserto directory, please provide the following four configuration values using the respective environment variables.


```
export ASERTO_DIRECTORY_HOST=directory.prod.aserto.com
export ASERTO_DIRECTORY_PORT=8443
export ASERTO_TENANT_ID=<your tenant ID>
export ASERTO_DIRECTORY_KEY=<your read-only or read-write API key>

```

You can find: 

* the tenant ID in the [Manage Organization](https://console.aserto.com/ui/manage-tenant?selected=SETTINGS) section of the aserto console.
* the directory API key in the [Connections](https://console.aserto.com/ui/connections) section by expanding the `Aserto Directory` panel.

![](./directory-connection.png)

This provides access to a read-only and read-write API key.


### 3. Running the example

To run the examples:

```bash
java -jar target/examples-1.0.0-SNAPSHOT-shaded.jar
```

The output contains the instance information are connecting to.

```
❯ java -jar examples/target/examples-1.0.0-SNAPSHOT-shaded.jar
Connecting to directory: localhost:9292...
...
```
