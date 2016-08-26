package server;

import function.ClientBean;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 * Created by lenovo on 2016/8/13.
 */
public class Catserver {
    public static ServerSocket ss;
    public static HashMap<String, ClientBean>onlines;
    static {
        try{
            ss=new ServerSocket(8520);
            onlines =new HashMap<String,ClientBean>();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    class CatClientThread extends Thread{
        private Socket client;
        private CatBean bean;
        private ObjectInputStream ois;
        private ObjectOutputStream oos;
           public CatClientThread(Socket client){
               this.client=client;
           }

        @Override//重写thread中的
        public void run() {
            try{
                //不停从客户端接收信息
                while(true)
                {
                    ois=new ObjectInputStream(client.getInputStream());
                    bean =(CatBean) ois.readObject();
                    //分析catbean中，type是那种类型
                    switch(bean.getType()){
                    case 0:
                    {
                        ClientBean cbean=new ClientBean();
                        cbean.setName(bean.getName());
                    }
                }
            }catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
