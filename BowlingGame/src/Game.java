
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
			if (isStrike(flameIndex)) {
				score += 10 + strikeBonus(flameIndex);
				flameIndex ++;
			}
			else if (isSpare(flameIndex)) {
				score += 10 + spareBonus(flameIndex);
				flameIndex += 2;
			} else {
				score += sumOfBallsInFrame(flameIndex);
				flameIndex += 2;
			}

		}
		return score;
	}

	private int sumOfBallsInFrame(int flameIndex) {
		return rolls[flameIndex] + rolls[flameIndex + 1];
	}

	private int spareBonus(int flameIndex) {
		return rolls[flameIndex + 2];
	}

	private int strikeBonus(int flameIndex) {
		return rolls[flameIndex + 1] + rolls[flameIndex + 2];
	}

	private boolean isStrike(int flameIndex) {
		return rolls[flameIndex] == 10;
	}

	private boolean isSpare(int flameIndex) {
		return sumOfBallsInFrame(flameIndex) == 10;
	}

}
