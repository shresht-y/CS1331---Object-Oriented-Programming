public class Runner {
    public static void main(String[] args) {
        SummerShowdown s = new SummerShowdown(13,true, "Shresht", 20000,"Ricardo");
        SummerShowdown s2 = new SummerShowdown("Shresht", "OtherShresht");
        s.refereeHire("safjdlk");
        System.out.println(s.equals(s2));

        ConferenceLeague c = new ConferenceLeague("shres", 32, "kjjl");
        System.out.println(c.toString());
        c.nextRound();
        System.out.println(c.toString());
        c.nextRound();
        System.out.println(c.toString());
        c.nextRound();
        System.out.println(c.toString());
        c.nextRound();
        System.out.println(c.toString());
        c.nextRound();
        System.out.println(c.toString());


    }
}
