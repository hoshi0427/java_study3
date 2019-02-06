import junit.framework.TestCase;

public class HeroTest extends TestCase {
	public void testInitialize() throws Exception {
		Hero hero = new Hero();
		hero.setName("test");
		assertEquals("test", hero.getName());
		assertEquals(100, hero.getHp());
		assertEquals(10, hero.getMp());
	}

	public void testAttack() {

	}
}
