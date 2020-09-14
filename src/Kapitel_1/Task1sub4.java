package Kapitel_1;

public class Task1sub4 {
        public static void main(String[] args) {
            final Object[][] table = new String[5][];
            //opsætter et array med en længde på 5 0 til 4

            table[0] = new String[]{"a", "a^2", "a^3", "a^4" ,};
            table[1] = new String[]{"1", "1", "1", "1"};
            table[2] = new String[]{"2", "4", "8" , "16"};
            table[3] = new String[]{"3", "9", "27" , "81"};
            table[4] = new String[]{"4", "16", "64" , "256"};
            //indsætter indholdet i arrayet så det passer til opgaven

            for (final Object[] row : table) {
                //printer alt indholdet fra arrayet ud
                System.out.format("%15s%15s%15s%15s\n", row);
                /*printer indholdet af arraret ud med formatting som hedder 15
                 charecters afstand % betyderat det er et formatting argument*/
            }
        }
    }


