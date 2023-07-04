import java.util.Scanner;

public class HowLongCanYouSurvive
{
    public static void main(String[] args)
    {
        final int healthDecay = 7;
        final int hungerHydrationDecay = 20;
        final int funDecay = 15;
        int health = (int) (Math.random() * 51) + 50;  //50 to 100
        int hunger = (int) (Math.random() * 51) + 50;  //50 to 100
        int hydration = (int) (Math.random() * 51) + 50;  //50 to 100
        int fun = (int) (Math.random() * 51) + 20;  //20 to 70
        int maxIntDigits = 3;
        boolean gameOver = false;

        System.out.println("You will need to survive as long as you can by using items in order to keep your health above 0%");
        System.out.println("In order to maintain your health bar, you will need to keep your hunger and hydration bars above 0%");
        System.out.println("If they reach 0%, you will start losing significantly more health than normal");
        System.out.println("Similar to how your health is affected by your hunger and hydration, your hunger and hydration is affected by your fun bar");
        System.out.println("If your fun bar reaches 0%, you will start losing more hunger and hydration than normal");
        System.out.println("In between each day, you will be able to answer a question to obtain an item");
        System.out.println("\nPick a total of 10 items to bring with you from the following: ");
        System.out.println("Water bottles(+30 hydration), Cans of food(+30 hunger), First aid kits(+15 health, max 3), Games(+25 fun, max 4)");

        Scanner answer = new Scanner(System.in);
        int bottles = 0;
        int cans = 0;
        int firstAidKits = 0;
        int games = 0;
        while (bottles + cans + firstAidKits + games < 10) {  //item selection
            String item = answer.nextLine();
            item = item.toLowerCase();
            if (Methods.waterReq(item)) {
                if (Methods.cansReq(item) || Methods.aidReq(item) || item.indexOf("game") != -1) {
                    System.out.println("\nThat's not an available item.");
                }
                else {
                    System.out.println("How many water bottles?");
                    bottles = answer.nextInt();
                    while (bottles + cans + firstAidKits + games > 10) {
                        System.out.println("You can't carry that many water bottles. Try choosing less water bottles.");
                        bottles = answer.nextInt();
                    }
                    System.out.println("\nChosen Items: " + bottles + " water bottles, " + cans + " cans of food, " + firstAidKits + " first aid kits, " + games + " games");
                    answer.nextLine();
                }
            }
            else if (Methods.cansReq(item)) {
                if (Methods.waterReq(item) || Methods.aidReq(item) || item.indexOf("game") != -1) {
                    System.out.println("\nThat's not an available item.");
                }
                else {
                    System.out.println("How many cans of food?");
                    cans = answer.nextInt();
                    while (bottles + cans + firstAidKits + games > 10) {
                        System.out.println("You can't carry that many cans of food. Try choosing less cans of food.");
                        cans = answer.nextInt();
                    }
                    System.out.println("\nChosen Items: " + bottles + " water bottles, " + cans + " cans of food, " + firstAidKits + " first aid kits, " + games + " games");
                    answer.nextLine();
                }
            }
            else if (Methods.aidReq(item)) {
                if (Methods.waterReq(item) || Methods.cansReq(item) || Methods.gamesReq(item)) {
                    System.out.println("\nThat's not an available item.");
                }
                else {
                    System.out.println("How many first aid kits?");
                    firstAidKits = answer.nextInt();
                    while (bottles + cans + firstAidKits + games > 10 || firstAidKits > 3) {
                        System.out.println("You can't carry that many first aid kits. Try choosing less first aid kits.");
                        firstAidKits = answer.nextInt();
                    }
                    System.out.println("\nChosen Items: " + bottles + " water bottles, " + cans + " cans of food, " + firstAidKits + " first aid kits, " + games + " games");
                    answer.nextLine();
                }
            }
            else if (Methods.gamesReq(item)) {
                if (Methods.waterReq(item) || Methods.cansReq(item) || Methods.aidReq(item)) {
                    System.out.println("\nThat's not an available item.");
                }
                else {
                    System.out.println("How many games?");
                    games = answer.nextInt();
                    while (bottles + cans + firstAidKits + games > 10 || games > 4) {
                        System.out.println("You can't carry that many games. Try choosing less games.");
                        games = answer.nextInt();
                    }
                    System.out.println("\nChosen Items: " + bottles + " water bottles, " + cans + " cans of food, " + firstAidKits + " first aid kits, " + games + " games");
                    answer.nextLine();
                }
            }
            else {
                System.out.println("\nThat's not an available item.");
            }
            if (bottles + cans + firstAidKits + games < 10) {
                System.out.println("Water bottles(+30 hydration), Cans of food(+30 hunger), First aid kits(+15 health, max 3), Games(+25 fun, max 4)");
            }
        }
        Game storage = new Game(bottles, cans, firstAidKits, games);

        int day = 0;
        while (!gameOver) {
            day++;
            System.out.println("\nDay " + day + ":");  //Prints out your health, hunger, and hydration at the start of each day.
            for (int i = 0; i < 4; i++) {
                int progressOrigin;
                if (i == 0) {
                    System.out.print("Health ╠═");
                    progressOrigin = health;
                }
                else if (i == 1) {
                    System.out.print("Hunger ╠═");
                    progressOrigin = hunger;
                }
                else if (i == 2) { 
                    System.out.print("Hydration ╠═");
                    progressOrigin = hydration;
                }
                else {
                    System.out.print("Fun ╠═");
                    progressOrigin = fun;
                }
                Methods.printStats(progressOrigin);
            }

            int prompt = (int) (Math.random() * 4) + 1;  //1 to 4; answer questions to obtain items
            if (prompt == 1) {
                String str = "supercalifragilisticexpialidocious";
                int int1 = (int) (Math.random() * 27); //0 to 26
                int int2 = int1 + (int) (Math.random() * 6) + 3; //3 to 8 more than int1
                System.out.println(Game.prompt1(int1, int2));
                String substring = answer.nextLine();
                if (substring.equals(str.substring(int1, int2))) {
                    System.out.println("Correct! You get a first aid kit!");
                    storage.addFirstAidKits(1);
                }
                else {
                    System.out.println("Incorrect.");
                }
            }
            if (prompt == 2) {
                int base = (int) (Math.random() * 8) + 2;  //2 to 9
                int exponent = (int) (Math.random() * 3) + 2;  //2 to 4
                System.out.println(Game.prompt2(base, exponent));
                String number = answer.nextLine();
                if (number.equals(Integer.toString((int) Math.pow(base, exponent)))) {
                    System.out.println("Correct! You get a can of food!");
                    storage.addCans(1);
                }
                else {
                    System.out.println("Incorrect.");
                }
            }
            if (prompt == 3) {
                System.out.println(Game.prompt3(maxIntDigits));
                String digits = answer.nextLine();
                if (maxIntDigits < 11) {
                    if (digits.equals(Integer.toString((int) (Integer.MAX_VALUE / Math.pow(10, (10 - maxIntDigits)))))) {
                        System.out.println("Correct! You get a water bottle!");
                        storage.addBottles(1);
                        maxIntDigits += 2;
                    }
                    else {
                        System.out.println("Incorrect.");
                    }
                }
                else {
                    System.out.println("You already answered all of the possible retrievable digits. You get a water bottle!");
                    storage.addBottles(1);
                }
            }
            if (prompt == 4) {
                int a = (int) (Math.random() * 4) + 1;  //1 to 4
                int max = a * ((int) (Math.random() * 3) + 4);  //(4 to 6) times a
                int interval = (int) (Math.random() * 3) + 2;  //2 to 4
                String string = "";
                for (int i = a; i <= max; i += interval) {
                    string += i + " ";
                }
                System.out.println(Game.prompt4(a, max, interval));
                String stringAns = answer.nextLine();
                if (stringAns.equals(string)) {
                    System.out.println("Correct! You get a game!");
                    storage.addGames(1);
                }
                else {
                    System.out.println("Incorrect.");
                }
            }

            String yesOrNo = "yes";
            while (yesOrNo.equals("yes") && storage.getBottles() + storage.getCans() + storage.getKits() + storage.getGames() > 0) {  //if you want to use an item
                System.out.println("\n" + storage.toString());
                System.out.println("Would you like to use one of these items? (yes/no)");
                yesOrNo = answer.nextLine();
                yesOrNo.toLowerCase();
                while (!(yesOrNo.equals("yes") || yesOrNo.equals("no"))) {
                    System.out.println("That's not a possible answer.");
                    yesOrNo = answer.nextLine();
                    yesOrNo.toLowerCase();
                }
                if (yesOrNo.equals("yes")) {
                    System.out.println("Which item would you like to use?");
                    String useItem = answer.nextLine();
                    useItem.toLowerCase();
                    if (Methods.waterReq(useItem)) {
                        if (Methods.cansReq(useItem) || Methods.aidReq(useItem) || Methods.gamesReq(useItem)) {
                            System.out.println("That's not an available item.");
                        }
                        else {
                            System.out.println("How many water bottles?");
                            int amount = answer.nextInt();
                            while (amount > storage.getBottles()) {
                                System.out.println("You can't use that many water bottles. Try choosing less water bottles.");
                                amount = answer.nextInt();
                            }
                            storage.addBottles(amount * -1);
                            hydration += (30 * amount);
                            if (hydration > 100) {
                                hydration = 100;
                            }
                            int progressOrigin = hydration;
                            System.out.print("Hydration ╠═");
                            Methods.printStats(progressOrigin);
                            answer.nextLine();
                        }
                    }
                    else if (Methods.cansReq(useItem)) {
                        if (Methods.waterReq(useItem) || Methods.aidReq(useItem) || Methods.gamesReq(useItem)) {
                            System.out.println("That's not an available item.");
                        }
                        else {
                            System.out.println("How many cans of food?");
                            int amount = answer.nextInt();
                            while (amount > storage.getCans()) {
                                System.out.println("You can't use that many cans of food. Try choosing less cans of food.");
                                amount = answer.nextInt();
                            }
                            storage.addCans(amount * -1);
                            hunger += (30 * amount);
                            if (hunger > 100) {
                                hunger = 100;
                            }
                            int progressOrigin = hunger;
                            System.out.print("Hunger ╠═");
                            Methods.printStats(progressOrigin);
                            answer.nextLine();
                        }
                    }
                    else if (Methods.aidReq(useItem)) {
                        if (Methods.waterReq(useItem) || Methods.cansReq(useItem) || Methods.gamesReq(useItem)) {
                            System.out.println("That's not an available item.");
                        }
                        else {
                            System.out.println("How many first aid kits?");
                            int amount = answer.nextInt();
                            while (amount > storage.getKits()) {
                                System.out.println("You can't use that many first aid kits. Try choosing less first aid kits.");
                                amount = answer.nextInt();
                            }
                            storage.addFirstAidKits(amount * -1);
                            health += (15 * amount);
                            if (health > 100) {
                                health = 100;
                            }
                            int progressOrigin = health;
                            System.out.print("Health ╠═");
                            Methods.printStats(progressOrigin);
                            answer.nextLine();
                        }
                    }
                    else if (Methods.gamesReq(useItem)) {
                        if (Methods.waterReq(useItem) || Methods.cansReq(useItem) || Methods.aidReq(useItem)) {
                            System.out.println("That's not an available item.");
                        }
                        else {
                            System.out.println("How many games?");
                            int amount = answer.nextInt();
                            while (amount > storage.getGames()) {
                                System.out.println("You can't use that many games. Try choosing less games.");
                                amount = answer.nextInt();
                            }
                            storage.addGames(amount * -1);
                            fun += (25 * amount);
                            if (fun > 100) {
                                fun = 100;
                            }
                            int progressOrigin = fun;
                            System.out.print("Fun ╠═");
                            Methods.printStats(progressOrigin);
                            answer.nextLine();
                        }
                    }
                    else {
                        System.out.println("That's not an available item");
                    }
                    System.out.println("");
                }
            }

            fun -= funDecay;  //decay
            if (fun <= 0) {
                hunger -= hungerHydrationDecay * 1.5;
                hydration -= hungerHydrationDecay * 1.5;
                fun = 0;
            }
            else {
                hunger -= hungerHydrationDecay;
                hydration -= hungerHydrationDecay;
            }
            if (hunger <= 0 && hydration <= 0) {
                health -= healthDecay * 3;
                hunger = 0;
                hydration = 0;
            }
            else if (hunger <= 0 || hydration <= 0) {
                health -= healthDecay * 2;
                if (hunger <= 0) {
                    hunger = 0;
                }
                if (hydration <= 0) {
                    hydration = 0;
                }
            }
            else {
                health -= healthDecay;
            }
            if (health <= 0) {
                gameOver = true;
            }
        }
        System.out.println("You survived a total of " + day + " days!");
        answer.close();
    }
}