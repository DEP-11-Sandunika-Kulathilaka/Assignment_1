public class Demo6_task_b {
    public static void main(String[] args) {
        String name1 = "Alice";
        int age1 = 24;

        String name2 = "Bob";
        int age2 = 30;

        final String Color = "\033[34;1m";
        final String Reset = "\033[33;0m";

        System.out.println("\033[33m+..............+.....+");
        System.out.printf("| %sNAME%-15s \033[33m| %sAGE%-5s \033[33m|\n", Color, Reset, Color, Reset);
        System.out.println("\033[33m+..............+.....+");
        System.out.printf("|\033[39m %1$-12s \033[33m|\033[35m %2$-3s \033[33m| \n", name1, age1);
        System.out.printf("|\033[39m %1$-12s \033[33m|\033[35m %2$-3s \033[33m| \n", name2, age2);
        System.out.println("\033[33m+..............+.....+");
        System.out.println();


        
    }
}