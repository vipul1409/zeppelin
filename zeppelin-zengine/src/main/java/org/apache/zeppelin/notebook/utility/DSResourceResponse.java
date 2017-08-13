package org.apache.zeppelin.notebook.utility;

import java.util.Map;

/**
 * Created by vipulmodi on 8/13/17.
 */
public class DSResourceResponse {

  private String ds_type;
  private Data data;

  public String getDs_type() {
    return ds_type;
  }

  public void setDs_type(String ds_type) {
    this.ds_type = ds_type;
  }

  public void setData(Data data) {
    this.data = data;
  }

  public Data getData() {
    return data;
  }

  class Data {
    private String owner;
    private String user;
    private String password;
    private String port;
    private String id;
    private String aliasName;
    private String host;
    private String name;

    public String getOwner() {
      return owner;
    }

    public String getUser() {
      return user;
    }

    public String getPassword() {
      return password;
    }

    public String getPort() {
      return port;
    }

    public String getId() {
      return id;
    }

    public String getAliasName() {
      return aliasName;
    }

    public String getHost() {
      return host;
    }

    public String getName() {
      return name;
    }

    public void setOwner(String owner) {
      this.owner = owner;
    }

    public void setUser(String user) {
      this.user = user;
    }

    public void setPassword(String password) {
      this.password = password;
    }

    public void setPort(String port) {
      this.port = port;
    }

    public void setId(String id) {
      this.id = id;
    }

    public void setAliasName(String aliasName) {
      this.aliasName = aliasName;
    }

    public void setHost(String host) {
      this.host = host;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}
