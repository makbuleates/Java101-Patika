public class Main {
    public static void main(String[] args) {
    Fighter f1 = new Fighter("A", 100, 5, 95, 25);
    Fighter f2 = new Fighter("B", 90, 10, 70, 30);

    Match match = new Match(f1, f2, 70, 100);
    match.start();
    }
}