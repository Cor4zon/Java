public class Program {
    public static void main(String[] args) {
        System.out.println("War begin:");
        Soldier Hamp = new Soldier("Hamp", "USA", 1);
        Soldier Guk = new Soldier("JinLunPuk", "Vietnam", 1000);
        Hamp.kill(Guk);
    }
}
