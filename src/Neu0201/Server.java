package Neu0201;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����һ������
		ServerSocket server = new ServerSocket(9999);
		while(true){
			try {
				/*�ȴ��ͻ�������(����,���û�пͻ�����������ڴ�)*/
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
