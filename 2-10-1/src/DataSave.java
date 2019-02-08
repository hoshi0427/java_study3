import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class DataSave {
	public static	void saveHeroToFile(Hero h){
		Writer w = null;
		try {
			w = new BufferedWriter(new FileWriter("rpgsave.csv"));
			w.write(h.getName());
			w.write(",");
			w.write(String.valueOf(h.getHp()));
			w.write(",");
			w.write(String.valueOf(h.getMp()));
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
