package com.github.frunoman.softasserts;



import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Maps {

  public static <K, V> Map<K,V> newHashMap() {
    return new HashMap<>();
  }

  public static <K, V> Map<K,V> newHashtable() {
    return new Hashtable<>();
  }

  public static <K, V> Map<K,V> newConcurrentMap() {
    return new ConcurrentHashMap<>();
  }

  public static <K, V> Map<K, V> newLinkedHashMap() {
    return new LinkedHashMap<>();
  }

  public static <K, V> Map<K, V> newHashMap(Map<K, V> parameters) {
    return new HashMap<>(parameters);
  }
}
