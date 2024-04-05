package T1;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    public void checkHeroStatus(Hero hero) {
        System.out.println("------- " + hero.getName() + " -------");
        System.out.println("Health        : " + hero.getHealth());
        System.out.println("Damage        : " + hero.getDamage());
        if (hero.getItem() == null) {
            System.out.println("No item bought");
        } else {
            System.out.println("Item bought   : " + hero.getItem().getName());
        }
    }

    public void checkItemStatus(Item item) {
        System.out.println("------- " + item.getName() + " -------");
        System.out.println("Health        : " + item.getHealth());
        System.out.println("Damage        : " + item.getDamage());
    }

    public void showHeroList() {
        System.out.println("-------  Pick Your Hero  -------");
        System.out.println("1. Yu Zhong");
        System.out.println("2. Balmond");
        System.out.println("3. Zilong");
        System.out.println("4. Bane");
        System.out.println("5. Jawhead");
    }

    public void showItemList() {
        System.out.println("-------  Buy Item  -------");
        System.out.println("1. Haas Claw");
        System.out.println("2. Berseker Fury");
        System.out.println("3. Guardian Helmet");
    }

    public Hero chooseHero(int choose, Hero hero) {
        switch (choose) {
            case 1:
                hero.setName("Yu Zhong");
                hero.setDamage(500);
                hero.setHealth(2500);
                break;
            case 2:
                hero.setName("Balmond");
                hero.setDamage(700);
                hero.setHealth(2000);
                break;
            case 3:
                hero.setName("Zilong");
                hero.setDamage(600);
                hero.setHealth(2200);
                break;
            case 4:
                hero.setName("Bane");
                hero.setDamage(300);
                hero.setHealth(3000);
                break;
            case 5:
                hero.setName("Jawhead");
                hero.setDamage(550);
                hero.setHealth(2400);
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
            }
        return hero;
    }

    public void instruction(Hero hero) {
        System.out.println("---- Choose your move ----");
        System.out.println("1. Attack");
        if (hero.getItem() == null) {
            System.out.println("2. Buy Item");
        } else {
            System.out.println("2. Sell Item");
        }
        System.out.println("3. Surrender");
    }

    public void buyItem(int choose, Hero hero) {
        switch (choose) {
            case 1:
                hero.setItem(new Item("Haas Claw", 250, 100));
                break;
            case 2:
                hero.setItem(new Item("Berseker Fury", 350, 0));
                break;
            case 3:
                hero.setItem(new Item("Guardian Helmet", 0, 350));
                break;
            default:
                break;
        }
        hero.getItem().active(hero);
    }

    public void move(int choose, Hero hero, Hero enemy) {
        Scanner input = new Scanner(System.in);
        switch (choose) {
            case 1:
                hero.attack(enemy);
                System.out.println(hero.getName() + " attacking " + enemy.getName());
                checkHeroStatus(enemy);
                break;
            case 2:
                if (hero.getItem() == null) {
                    showItemList();
                    System.out.print("Which item you want to buy : ");
                    int item = Integer.parseInt(input.next());
                    buyItem(item, hero);
                } else {
                    System.out.println("You sold " + hero.getItem().getName());
                    hero.setItem(null);
                }
                break;
            case 3:
                System.out.println("You surrendered");
                break;
            default:
                break;
        }
    }

    public void main() {
        System.out.println("Welcome to Mobile Legends");
        System.out.println("-------------------------\n");

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        showHeroList();
        System.out.print("Choose your hero : ");
        int choose = Integer.parseInt(input.next());
        
        Hero hero = new Hero("null", 0, 0);
        chooseHero(choose, hero);
        System.out.println("You picked " + hero.getName());
        
        Hero enemy = new Hero("null", 0, 0, new Item("Malefic Roar", 300, 50));
        chooseHero(random.nextInt(1, 6), enemy);
        System.out.println("Enemy picked " + enemy.getName());

        System.out.println("--------------------------------");
        System.out.println("\n Battle Begins -----------------");

        while (enemy.getHealth() > 0 && hero.getHealth() > 0) {
            instruction(hero);
            System.out.print("Choose your move : ");
            choose = Integer.parseInt(input.next());
            move(choose, hero, enemy);
    
            System.out.println("Enemy Turn");
            move(1, enemy, hero);
        }

        input.close();
    }
}
