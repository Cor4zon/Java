public class Soldier {
    String name;
    String country;
    Integer WarCount;

    Soldier(String name, String country, Integer WarCount) {
        this.name = name;
        this.country = country;
        this.WarCount = WarCount;
    }

    public void kill(Soldier other) {
        System.out.println(this.name + " kill " + other.name);
    }
}
