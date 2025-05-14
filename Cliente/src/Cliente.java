import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Cliente
{
	public static void main(String[] args) throws IOException
	{
		String ipServidor;
		ipServidor = (String) JOptionPane.showInputDialog(null, "Qual � o endere�o IP do servidor?", "Cliente socket",
														  JOptionPane.QUESTION_MESSAGE, null, null, "127.0.0.1");
		Socket socket = new Socket(ipServidor, 65535);

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String resposta = input.readLine();

        JOptionPane.showMessageDialog(null, resposta);
        socket.close();
        System.exit(0);
	}
}

