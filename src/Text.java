public class Text {
    public static void zacatek(){
        System.out.println("Zadej písmeno A nebo B podle toho, kdo vyhrál. Hráč 1 - A, Hráč 2 - B");
    }
    public static void spatnyIndex(){
        System.out.println("Zadal jsi špatný index.");
    }
    public static void vyhoda(){
        System.out.println("Game - " + "AD" + " : " + Logika.points[1]);
    }
    public static void vyhoda1(){
        System.out.println("Game - " + Logika.points[0] + " : " + "AD");
    }
    public static void tabulka(){
        System.out.println("Game - " + Logika.points[0] + " : " + Logika.points[1]);
    }
    public static void tabulka1(){
        System.out.println("Set - " + Logika.games[0] + " : " + Logika.games[1]);
        System.out.println("Match - " + Logika.sets[0] + " : " + Logika.sets[1]);
    }
    public static void hrac1(){
        System.out.println("");
        System.out.println("Vyhrál Hráč 1!");
    }
    public static void hrac2(){
        System.out.println("");
        System.out.println("Vyhrál Hráč 2!");
    }

}
