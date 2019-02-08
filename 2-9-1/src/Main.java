import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("C:\\git\\java_study3\\2-9-1\\rpgsave.dat", true);

//		fw.write("Test");
//		fw.flush();
//		fw.close();

		FileReader fr = new FileReader("rpgsave.dat");
		System.out.println("全てのデータを読んで表示します。");
		int i = fr.read();
		while(i != -1) {
			char c = (char) i;
			System.out.print(c);
			i = fr.read();
		}
		System.out.println("ファイルの末尾に到着しました");
		fr.close();
	}
}
