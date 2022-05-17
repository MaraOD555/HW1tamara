public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte mouse = 1;
        short flowers = 15;
        int pictures = 150;
        long drops = 1100L;
        float elbowLength = 3.8f;
        double numberPi = 3.1415926535;
        char a = 97;
        boolean dropsNotBecameRain = drops < 1200;
        System.out.println(dropsNotBecameRain);

        // Задание 2

        float boxer1Weight = 78.2f;
        float boxer2Weight = 82.7f;
        float theWholeWeight = boxer1Weight + boxer2Weight;
        float weightBetweenBoxers = boxer2Weight - boxer1Weight;
        System.out.print("Общий вес боксеров " + theWholeWeight);
        System.out.print("Разница в весе боксеров " + weightBetweenBoxers);

        //Задание 3

        byte quantityBananas = 5;
        byte weight1Bananas = 80;
        int weightAllBananas = quantityBananas * weight1Bananas;
        System.out.print("Общий вес бананов " + weightAllBananas);

        byte milk = 2;
        short weight100Milk = 105;
        int weightNeedMilk = milk * weight100Milk;
        System.out.print("Необходимое молоко " + weightNeedMilk);

        byte quantityIceCream = 2;
        short weightIceCream = 100;
        int weightAllIceCream = quantityIceCream * weightIceCream;
        System.out.print("Необходимое мороженое " + weightAllIceCream);

        byte eggs = 4;
        byte weightEggs = 70;
        int weightAllEggs = eggs * weightEggs;
        System.out.print("Необходимое количество яиц " + weightAllEggs);

        int weightCocktailGr = weightAllBananas + weightNeedMilk + weightAllIceCream + weightAllEggs;
        float weightCocktailKg = weightCocktailGr / 1000;

        System.out.print("Вес завтрака спортсмена " + weightCocktailKg);


        //Задание 4

        short lostWeightGr = 250;
        short lostWeight1Gr = 500;
        int targetLostKg = 7;
        int targetLostGr = targetLostKg * 1000;
        int aimLost1 = targetLostGr / lostWeightGr;
        System.out.print("Добиться цели при потере 250 гр за " + aimLost1 + "дней");
        int aimLost2 = targetLostGr / lostWeight1Gr;
        System.out.print("Добиться цели при потере 500 гр за " + aimLost2 + "дней");

        // Задание 5












    }
}