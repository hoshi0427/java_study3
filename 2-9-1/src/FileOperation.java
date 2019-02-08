import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {
	public static void fileWrite(int comment) throws IOException {
		FileOutputStream fos = new FileOutputStream("rpgsave.dat", true);
		fos.write(comment);
		fos.flush();
		fos.close();
		System.out.println("追記しました");
	}
}
