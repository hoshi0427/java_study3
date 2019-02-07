
public class Game {
	private int rolls[] = new int[21];
	private int currentRoll = 0;

	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}

	public int score() {
		int score = 0;
		int flameIndex = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (isSpare(flameIndex)) {
				score += 10 + rolls[flameIndex + 2];
				flameIndex += 2;
			} else {
				score += rolls[flameIndex] + rolls[flameIndex + 1];
				flameIndex += 2;
			}

		}
		return score;
	}

	private boolean isSpare(int flameIndex) {
		return rolls[flameIndex] + rolls[flameIndex + 1] == 10;
	}

}
