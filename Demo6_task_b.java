public class Demo6_task_b {
    public static void main(String[] args) {
        String name1 = "Alice";
        int age1 = 24;

        String name2 = "Bob";
        int age2 = 30;

        final String Color = "\033[32;1m";
        final String Reset = "\033[30;0m";
        final String Color1 = "\033[39m";
        final String Reset1 = "\033[37m";

        System.out.println("\033[40m+...................+...........+");
        System.out.printf("| %sNAME%-10s           | %sAGE%-5s       |\n", Color, Reset, Color, Reset);
        System.out.println("\033[40m+...................+...........+");
        System.out.printf("\033[40m| %1$-10s        \033[39m| %2$-5s     | \n", name1, age1, Color1, Reset1,Color1, Reset1);
        System.out.printf("\033[40m| %1$-10s        \033[39m| %2$-5s     | \n", name2, age2);
        System.out.println("+...................+...........+");
        System.out.println();

        
    }
}