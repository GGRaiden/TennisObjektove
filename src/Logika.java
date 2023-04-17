public class Logika {
    public static int[] points = {0, 0};
    public static int[] games = {0, 0};
    public static int[] sets = {0, 0};

    public static void logika(){
        Text.zacatek();
        for (;;){
            String input = Vstupy.vstup();
            if (input.equals("A") || input.equals("a")){
                if (points[0] < 29){
                    points[0] += 15;
                }
                else if (points[0] > 39 && points[1] < 39){
                    games[0] += 1;
                    points[0] = 0;
                    points[1] = 0;
                }
                else if (points[0] > 49){
                    games[0] += 1;
                    points[0] = 0;
                    points[1] = 0;
                }
                else if (points[1] > 49){
                    points[1] = 40;
                    points[0] = 40;
                }
                else{
                    points[0] += 10;
                }
            }
            else if (input.equals("B") || input.equals("b")){
                if (points[1] < 29){
                    points[1] += 15;
                }
                else if (points[1] > 39 && points[0] < 39){
                    games[1] += 1;
                    points[0] = 0;
                    points[1] = 0;
                }
                else if (points[1] > 49){
                    games[1] += 1;
                    points[0] = 0;
                    points[1] = 0;
                }
                else if (points[0] > 49){
                    points[0] = 40;
                    points[1] = 40;
                }
                else{
                    points[1] += 10;
                }
            }

            if ((games[0] > 5) && (games[0] > (games[1] + 1))) {
                sets[0] += 1;
                games[0] = 0;
                games[1] = 0;
            }
            if ((games[1] > 5) && (games[1] > (games[0] + 1))) {
                sets[1] += 1;
                games[0] = 0;
                games[1] = 0;
            }

            if (points[0] == 50) {
                Text.vyhoda();
            }
            else if (points[1] == 50) {
                Text.vyhoda1();
            }
            else {
                Text.tabulka();
            }
            Text.tabulka1();

            if (sets[0] == 2){
                Text.hrac1();
                break;
            }
            if (sets[1] == 2){
                Text.hrac2();
                break;
            }
        }
    }
}

