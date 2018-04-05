package com.nidan.io.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

/**
 * Created by nzqbe on 2018/4/5.
 */
public class BIOServerHandle implements Runnable {

    private Socket socket;

    public BIOServerHandle(Socket socket) {
        this.socket=socket;
    }

    public void run() {
        BufferedReader in =null;
        PrintWriter out =null;

        try {
            in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out=new PrintWriter(socket.getOutputStream(),true);
            String currentTime = null;
            String body = null;
            while (true){
                body=in.readLine();
                if(body==null){
                    break;
                }
                System.out.println("This server receive order : "+ body);
                currentTime="Query order".equalsIgnoreCase(body)?new Date(System.currentTimeMillis()).toString():"Bad order";
                out.println(currentTime);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out!=null){
                try {
                    out.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            socket=null;
        }
    }

}
