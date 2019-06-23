import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class HeroTest {
    @Before
    public void setUp() {

    }
    @After
    public void tearDown() {
        Hero.clearAll();
    }
    @Test
    public void Hero_instatiatesCorrectly_true() {
        Hero testHero = new Hero("name", 12,"speed","sugar");
        assertTrue(testHero instanceof Hero);
    }
    @Test
    public void getName_returnsString_mario() {
        Hero testHero = new Hero("mario", 12, "cooking","eating");
        assertEquals("mario", testHero.getName());
    }
    @Test
    public void getAge_returnsInteger_12() {
        Hero testHero = new Hero("mario", 12, "cooking","eating");
        assertEquals(12,testHero.getAge());
    }
    @Test
    public void getPower_returnsString_cooking() {
        Hero testHero = new Hero("mario", 12, "cooking","eating");
        assertEquals("cooking",testHero.getPower());
    }
    @Test
    public void getWeakness_returnsString_eating() {
        Hero testHero = new Hero("mario", 12, "cooking","eating");
        assertEquals("eating", testHero.getWeakness());
    }
    @Test
    public void getId_assignsUniqueId_int() {
        Hero testHero = new Hero("mario", 12, "cooking","eating");
        assertEquals(1,testHero.getId());
    }
    @Test
    public void instances_containsHeroObjectsCreated_true() {
        Hero testHero = new Hero("mario", 12, "cooking","eating");
        Hero anotherTestHero = new Hero("Beryll",35,"drinking","men");
        assertTrue(Hero.getHeroes().contains(testHero));
        assertTrue(Hero.getHeroes().contains(anotherTestHero));
    }
    @Test
    public void getHeroes_returnsList_List() {
        Hero testHero = new Hero("mario", 12, "cooking","eating");
        List<Hero> expectedOutput = new ArrayList<Hero>();
        expectedOutput.add(testHero);
        assertEquals(expectedOutput.get(0), Hero.getHeroes().get(0));
    }
    @Test
    public void find_ReturnsAnInstanceOfHeroes_Hero() {
        Hero testHero = new Hero("muchui",12,"eating","food");
        assertEquals(testHero,Hero.findHero(1));
    }
    @Test
    public void find_returnsCorrectHeroWhenMoreThanOneExists_Hero() {
        Hero testHero = new Hero("Amos",12,"food","eating");
        Hero another = new Hero("Clit",21,"hoop","cake");
        assertEquals(another,Hero.findHero(2));
    }
}