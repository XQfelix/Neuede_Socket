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
			/*首先获取输入流*/
			InputStream is = socket.getInputStream();
			/*将字节流转换成字符流*/
			InputStreamReader isr = new InputStreamReader(is);
			/*套用BufferedReader 作用是可以来按行读取*/
			BufferedReader br = new BufferedReader(isr);
			/*循环读取内容*/
			String str = br.readLine();
			while(str!=null){
				System.out.println("客户端发来信息:"+str);
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
