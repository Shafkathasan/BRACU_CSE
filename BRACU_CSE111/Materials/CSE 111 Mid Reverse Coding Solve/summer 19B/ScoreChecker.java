public class ScoreChecker {
    public static void main(String[] args) { 
        Batsman b1 = new Batsman(6101, 7380);
        b1.printCareerStatistics();
        System.out.println("============================");
        Batsman b2 = new Batsman("Liton Das", 678, 773);
        b2.printCareerStatistics();
        System.out.println("----------------------------");
        System.out.println(b2.battingStrikeRate());
        System.out.println("============================");
        b1.setName("Shakib Al Hasan");
        b1.printCareerStatistics();
        System.out.println("----------------------------");
        System.out.println(b1.battingStrikeRate());
    }
}
