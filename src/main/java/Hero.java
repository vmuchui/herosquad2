import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private int id;
    private static List<Hero> instances = new ArrayList<Hero>();

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    public String getWeakness() {
        return weakness;
    }
    public Hero(String name, int age, String power, String weakness) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
    }

    public int getId() {
        return id;
    }

    public static List<Hero> getHeroes() {
        return instances;
    }
    public static void clearAll() {
        instances.clear();
    }
    public static Hero findHero(int n) {
        return instances.get(n-1);
    }
}