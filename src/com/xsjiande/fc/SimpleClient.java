package com.xsjiande.fc;
import java.io.IOException;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;
public class SimpleClient {
     public static void main(String[] args) throws IOException
     {
         HttpClient client = new HttpClient();   
         //设置代理服务器地址和端口     
      //client.getHostConfiguration().setProxy("proxy_host_addr",proxy_port);
         //使用GET方法，如果服务器需要通过HTTPS连接，那只需要将下面URL中的http换成https
         HttpMethod method = new GetMethod("http://www.mnsfz.com/h/meihuo/PiPadebCdiPaHmeie.html"); 
         //使用POST方法
      //HttpMethod method = new PostMethod("http://java.sun.com";); 
         client.executeMethod(method);
         //打印服务器返回的状态
      System.out.println(method.getStatusLine());
        //打印返回的信息
      System.out.println(method.getResponseBodyAsString());
        //释放连接
      method.releaseConnection();
     }
 } 