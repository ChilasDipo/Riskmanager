package Kapitel_1;

public class Task1sub3 {
    public static void main(String[] args) {
        final Object[][] table = new String[4][];
        //opsætter et array med en længde på 4 0 til 3
        table[0] = new String[]{"", "J", "", "" , ""};
        table[1] = new String[]{"J", "aaa", "v", "vaaa"};
        table[2] = new String[]{"J", "aa", "v v" , "a a"};
        table[3] = new String[]{"J", "aaa", "v" , "aaa"};
        //indsætter indholdet i arrayet så det passer til opgaven

        for (final Object[] row : table) {
            System.out.format("%15s%15s%15s%15s\n", row);
            /*printer indholdet af arraret ud med formatting som hedder 15
                 charecters afstand % betyderat det er et formatting argument*/
        }
    }
}
