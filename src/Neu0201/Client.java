package Neu0201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.print.attribute.standard.PrinterState;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException{
		Socket socket = new Socket("10.25.130.159",9999);
		/*����������,Ŀ��Ϊ����̨����*/
		InputStreamReader isr= new InputStreamReader(System.in);
		/*����bufferedReader ʵ�ְ��ж�ȡ*/
		BufferedReader br = new BufferedReader(isr);
		/*��ȡsocket�����*/
		OutputStream os = socket.getOutputStream();
		/*����printStream����ʵ�ְ������*/
		PrintStream ps = new PrintStream(os);
		/*���տ���̨���������*/
		String str = br.readLine();
		while(str!=null){
			/*������д��socket���������*/
			ps.println(str);
			str=br.readLine();
		}
		
		
		
		
		isr.close();
		br.close();
		os.close();
	}
}
