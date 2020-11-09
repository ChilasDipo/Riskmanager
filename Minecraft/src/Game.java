public class Game {

       static void start(){
            System.out.println("Spillet er startet");

            Sheep sheep = new Sheep();

           Wood wood1 = new Wood();
                 Wood  wood2 = new Wood();
           for (int i = 0; i <5; i++) {
               Dirt dirt = new Dirt();
           }

          wood2.setWoodType("Brownwood");wood1.setWoodType("white");

    }
     static void nameobejct (String name){
         System.out.println(name + " now exist");

    }
    }

