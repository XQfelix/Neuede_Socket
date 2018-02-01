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
		/*创建输入流,目标为控制台输入*/
		InputStreamReader isr= new InputStreamReader(System.in);
		/*套用bufferedReader 实现按行读取*/
		BufferedReader br = new BufferedReader(isr);
		/*获取socket输出流*/
		OutputStream os = socket.getOutputStream();
		/*套用printStream可以实现按行输出*/
		PrintStream ps = new PrintStream(os);
		/*接收控制台输入的内容*/
		String str = br.readLine();
		while(str!=null){
			/*将内容写到socket的输出流中*/
			ps.println(str);
			str=br.readLine();
		}
		
		
		
		
		isr.close();
		br.close();
		os.close();
	}
}
