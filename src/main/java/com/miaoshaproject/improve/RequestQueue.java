package com.miaoshaproject.improve;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.http.HttpRequest;
public class RequestQueue {
  public static ConcurrentLinkedQueue<HttpRequest> queue = new ConcurrentLinkedQueue<HttpRequest>();
}
