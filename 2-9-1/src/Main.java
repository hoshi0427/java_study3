import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\git\\java_study3\\2-9-1\\rpgsave.dat", true);

		fw.write("Test");
		fw.flush();
		fw.close();
	}

}
