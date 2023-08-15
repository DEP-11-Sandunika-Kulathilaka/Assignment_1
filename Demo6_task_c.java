public class Demo6_task_c {
    public static void main(String[] args) {
        String city1 = "Los Angeles";
        String state1 = "California";
        int population1 = 3966936;

        String city2 = "\033[32mNew \033[39mYork    ";
        int population2 = 8336817;

        final String Color = "\033[39;1m";
        final String Reset = "\033[33m";
        //final String Reset = "\033[33m;0m";

        System.out.println("\033[33m+..............+............+............+");
        System.out.printf("| %sCITY%15s | %sSTATE%12s | %sPOPULATION%6s | \n", Color, Reset, Color, Reset, Color, Reset);

        //System.out.printf("| %sCITY%15s \033[33m| %sSTATE%12s \033[33m| %sPOPULATION%-6s \033[33m| \n", Color, Reset, Color, Reset, Color, Reset);
        System.out.println("\033[33m+..............+............+............+");
        System.out.printf("|\033[39m %1$-12s \033[33m|\033[39m %2$-12s \033[33m|\033[35m %3$-,10d \033[33m| \n", city1, state1, population1);
        System.out.printf("|\033[39m %1$-12s \033[33m|\033[36m %2$-12s \033[33m|\033[35m %3$-,10d \033[33m| \n", city2, city2, population2);
        System.out.println("\033[33m+..............+............+............+");
        System.out.println();
        

        
    }
}