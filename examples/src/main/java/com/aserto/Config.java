package com.aserto;

public class Config {
    private String host;
    private int port;
    private String apiKey;
    private String tenantID;

    public Config(String[] args) {
        this.host = setStr("ASERTO_DIRECTORY_HOST", "localhost");
        this.port = setInt("ASERTO_DIRECTORY_PORT", 9292);
        this.apiKey = setStr("ASERTO_DIRECTORY_KEY", "");
        this.tenantID = setStr("ASERTO_TENANT_ID", "");

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            switch (arg) {
                case "-h":
                case "--host":
                    this.host = setStr(arg);
                    break;
                case "-p":
                case "--port":
                    this.port = setInt(arg);
                    break;
                case "-k":
                case "--api-key":
                    this.apiKey = setStr(arg);
                    break;
                case "-t":
                case "--tenant-id":
                    this.tenantID = setStr(arg);
                    break;
                default:
                    System.out.println("Unknown argument: " + arg);
                    break;
            }
        }
    }

    public String Host() {return this.host;}
    public int Port() {return this.port;}
    public String ApiKey() {return this.apiKey;}
    public String TenantID() {return this.tenantID;}

    private String setStr(String envVar, String defaultValue) {
        String var = System.getenv(envVar);
        if ((var == null) || (var.isEmpty())) {
            return defaultValue;
        }
        return var;
    }

    private static int setInt(String envVar, int defaultValue) {
        String var = System.getenv(envVar);
        if ((var == null) || (var.isEmpty())) {
            return defaultValue;
        }
        return Integer.parseInt(var);
    }
}
