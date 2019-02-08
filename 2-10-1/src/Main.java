
public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero("YAMADA", 100, 20);
		DataSave.saveHeroToFile(hero);
	}

}
