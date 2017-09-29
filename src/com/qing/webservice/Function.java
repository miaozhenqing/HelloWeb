package com.qing.webservice;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * WebService服务端案例
 * @author AlanLee
 * @version 2017/06/02
 * 使用@WebService注解标注实现类
 */
@WebService
public class Function {
    public String transWords(String words){
        String res = "";
        for(char ch : words.toCharArray()){
            res += ch+",";
        }
        return res;
    }
    
    public static void main(String[] args) {
        // 使用Endpoint(终端)类发布webservice
        Endpoint.publish("http://localhost:8089/service/function", new Function());
        System.out.println("Publish Success");
    }
}