import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class DataSave {
	public static	void saveHeroToFile(Hero h){
		Writer w = null;
		try {
			w = new BufferedWriter(new FileWriter("rpgsave.dat"));
			w.write(h.getName() + "\n");
			w.write(h.getHp() + "\n");
			w.write(h.getMp() + "\n");
			w.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(w != null) {
				try {
					w.close();
					System.out.println("セーブされました");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
