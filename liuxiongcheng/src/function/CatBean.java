package function;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by lenovo on 2016/8/13.
 */

//设置基本的参数，连接起来
public class CatBean implements Serializable {
    private int type;//1私聊 0上下线跟新 -1下线请求2请求发送文3.确定接收文件
    private HashSet<String> clients;//存放选中的看客户
    private HashSet<String> to;
    public HashMap<String, ClientBean> onlines;
    private String info;
    private String timer;
    private String name;
    private String filename;
    private int size;
    private int port;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, ClientBean> getOnlines() {
        return onlines;
    }

    public void setOnlines(HashMap<String, ClientBean> onlines) {
        this.onlines = onlines;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public String getTimer(){return timer;}
    public String getInfo(){return info;}
    public int getPort(){return port;}
    public void setPort(){ this.port=port;}
     public void setport()
     {
         this.port=setport().
     }

}
