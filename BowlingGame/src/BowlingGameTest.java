import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {
	private Game g;
	protected void setUp() throws Exception {
		g = new Game();
	}

	public void testGutterGame() {
		int n = 20;
		int pins = 0;
		rollMany(n, pins);
		assertEquals(0, g.score());
	}

	private void rollMany(int n, int pins) {
		for (int i = 0; i < n; i++) {
			g.roll(pins);
		}
	}

	public void testAllOnes() throws Exception {
		Game g = new Game();
		for (int i = 0; i < 20; i++) {
			g.roll(1);
		}
		assertEquals( 20, g.score());
	}
}
