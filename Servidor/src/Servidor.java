import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Servidor
{
	public static void main(String[] args) throws IOException
	{
		ServerSocket listener = new ServerSocket(65535);  
		System.out.println("Servidor em execu��o na porta 65237...");
		try
		{
			while (true)
			{
				// aceita conex�es no socket	                
				Socket socket = listener.accept();
				System.out.println(socket.getRemoteSocketAddress().toString());
				try
				{
					PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
					out.println(new Date().toString());
					out.close();
				}
				finally
				{
					socket.close();
				}
			}
		}
		finally
		{
			listener.close();
		}
	}
}
