
public class Main {

	public static void main(String[] args) {
		System.out.println("demo");
		int[] score = {1, 2, 3, 4, 5};
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i]);
			System.out.println("");
		}
		Hero hero1 = new  Hero();
		System.out.println(hero1.getName());
		hero1.setName("Kara");
		System.out.println(hero1.getName());
		String comment = "NAME:" + hero1.getName() + " HP:" + hero1.getHp() + " MP:" + hero1.getMp();
		System.out.println(comment);
	}

}
