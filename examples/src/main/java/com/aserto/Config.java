package com.aserto;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvException;

public class Config {
    private String host;
    private int port;
    private String apiKey;
    private String tenantID;

    public Config() throws DotenvException, NumberFormatException {
        Dotenv dotenv = Dotenv.load();

        this.host = dotenv.get("ASERTO_DIRECTORY_HOST", "localhost");
        this.port = Integer.parseInt(dotenv.get("ASERTO_DIRECTORY_PORT", "9292"));
        this.apiKey = dotenv.get("ASERTO_DIRECTORY_KEY", "");
        this.tenantID = dotenv.get("ASERTO_TENANT_ID", "");
    }

    public String Host() {return this.host;}
    public int Port() {return this.port;}
    public String ApiKey() {return this.apiKey;}
    public String TenantID() {return this.tenantID;}
}
