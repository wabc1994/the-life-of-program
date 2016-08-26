package function;

import java.net.Socket;

/**
 * Created by lenovo on 2016/8/13.
 */
//客户端的信息，包括一个名字和套接字
public class ClientBean {
    private  String name;
    private Socket socket;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}
