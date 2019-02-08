import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
	public static void fileWrite(int comment) throws IOException {
		FileOutputStream fos = new FileOutputStream("rpgsave.dat", true);
		fos.write(comment);
		fos.flush();
		fos.close();
		System.out.println("追記しました");
	}

	public static void fWExceptionHandling() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("rpgsave.dat",true);
			fw.write('A');
			fw.flush();
		} catch (IOException e) {
			System.out.println("ファイルの書き込みエラー");
		} finally {
			if (fw != null) {
				try {
				fw.close();
				} catch (IOException e2) { }
			}
		}
	}
}
