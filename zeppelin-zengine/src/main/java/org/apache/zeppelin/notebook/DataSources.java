package org.apache.zeppelin.notebook;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by vipulmodi on 8/12/17.
 */
public class DataSources {
  public String name;
  public Map<String, String> attributes = new HashMap();

  public DataSources(String name, Map<String, String> map) {
    this.name = name;
    this.attributes = map;
  }
}
