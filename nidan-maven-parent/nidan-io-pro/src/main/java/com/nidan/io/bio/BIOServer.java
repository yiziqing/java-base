package com.nidan.io.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by nzqbe on 2018/4/5.
 */
public class BIOServer {


    public static void main(String[] args) {

        int port=8080;

        if(args!=null&&args.length>0){
            try {
                port=Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        ServerSocket serverSocket=null;

        try {
            serverSocket=new ServerSocket(port);
            System.out.println("This server is start in port : "+port);
            Socket socket=null;
            while (true){
                socket=serverSocket.accept();
                new Thread(new BIOServerHandle(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(serverSocket!=null){
                    System.out.println("This server is close!");
                    serverSocket.close();
                    serverSocket=null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
