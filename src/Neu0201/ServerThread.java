package Neu0201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerThread implements Runnable {
	private Socket socket;
	public ServerThread(Socket socket){
		this.socket=socket;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			/*���Ȼ�ȡ������*/
			InputStream is = socket.getInputStream();
			/*���ֽ���ת�����ַ���*/
			InputStreamReader isr = new InputStreamReader(is);
			/*����BufferedReader �����ǿ��������ж�ȡ*/
			BufferedReader br = new BufferedReader(isr);
			/*ѭ����ȡ����*/
			String str = br.readLine();
			while(str!=null){
				System.out.println("�ͻ��˷�����Ϣ:"+str);
				str = br.readLine();
			}
			br.close();
			is.close();
			isr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
