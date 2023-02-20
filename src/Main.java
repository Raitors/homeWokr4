import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
         byte age=13;
        byte adult=18;
         if (age >= adult){
             System.out.printf("Если возраст человека равен %d, то он совершеннолетний %n",age);
         } else {
             System.out.printf("Если возраст человека равен %d, он не достиг совершеннолетия, нужно немного подождать%n",age);
         }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        byte temp=5;
        byte dynamicTemp=-3;
        if (dynamicTemp < temp){
            System.out.printf("На улице %d градусов, нужно надеть шапку %n",dynamicTemp);
        } else {
            System.out.printf("На улице %d градусов, можно идти без шапки %n",dynamicTemp);
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte speedLimit=60;
        byte transportSpeed=80;
        if (speedLimit >= transportSpeed){
            System.out.printf("Если скорость %d, то можно ездить спокойно %n",transportSpeed);
        } else {
            System.out.printf("Если скорость %d, то придется заплатить штраф  %n",transportSpeed);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte age = 18;
        if (age >= 2 && age <=6) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в сад %n",age);
        }
        else if (age >= 7 && 18 > age) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу %n",age);
        }
        else if (age >= 18 && 24 >= age) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в университет %n",age);
        } else  {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить на работу %n",age);
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte age = 14;
        boolean adult = false;
        if (age < 5) {
            System.out.printf("Если возраст ребенка равен %d, то ему нельзя кататься на аттракционе%n",age);
        }
        else if (age >= 5 && age< 14 || adult) {
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься на аттракционе в сопровождении%n",age);
        }
        else if (age > 14){
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься на аттракционе без сопровождения взрослого%n",age);
        } else {
            System.out.printf("Если возраст ребенка равен %d, но нет взрослого, кататься нельзя%n",age);
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte railwayСarriage = 102;
        byte seating = 60;
        byte booking = 88;
        if (booking < seating) {
            System.out.println("В вагоне есть сидячие места");
        }
        else if (booking >= seating && booking  < railwayСarriage ) {
            System.out.println("В вагоне есть стоячие места");;
        } else {
            System.out.println("Вагон заполнен");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 80;
        int two = 1020;
        int three = 1800;
        if (one > two && one > three) {
            System.out.println("one "+one);
        } else if (one > two && one < three) {
            System.out.println("three "+three);
        } else if (two > one && two < three) {
            System.out.println("three "+three);
        } else {
            System.out.println("two "+two);
        }
    }

}                                                                 