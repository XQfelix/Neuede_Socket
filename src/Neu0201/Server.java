package Neu0201;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建一个服务
		ServerSocket server = new ServerSocket(9999);
		while(true){
			try {
				/*等待客户端连接(阻塞,如果没有客户端则会阻塞在此)*/
				Socket socket = server.accept();
				Runnable serverthread = new ServerThread(socket);
				Thread t = new Thread(serverthread);
				t.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}

}
