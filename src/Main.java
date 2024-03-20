public class Main {
    public static void main(String[] args) {
        System.out.println("home 3");

        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст равен " + age + ", то Вы совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст равен " + age + ", Вы не достигли совершеннолетия, нужно немного подождать");
        }
        //задача 1 окончена

        int temperature = 4;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градуса" + ", нужно надеть шапку");
        }
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса" + ", можно надеть шапку");
        }
        //задача 2 окончена

        int speed = 40;
        if (speed > 60) {
            System.out.println("Если скорость выше " + speed + ", то придётся заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость ниже " + speed + ", то можно ездить спокойно");
        }
        //задача 3 окончена

        int age2 = 21;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в садик");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в школу");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в университет");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить на работу");
        } else {
            System.out.println("Вы ввели некорректные данные");
        }
        //задача 4 окончена


        int age3 = 10;
        if (age3 < 5) {
            System.out.println("Если ваш возраст " + age3 + ", то вам нельзя кататься на аттракционе");
        } else if (age3 >= 5 && age3 <= 14) {
            System.out.println("Если ваш возраст " + age3 + ", то вам можно кататься на аттракционе в сопровождении взрослого");
        } else if (age3 > 14) {
            System.out.println("Если возраст ребенка " + age3 + ", то вам можно кататься на аттракционе без сопровождения взрослого");
        }
        //5 задача окончена

        int place = 27;
        if (place <= 60) {
            System.out.println("в вагоне есть сидячее место");
        } else if (place > 60 && place <= 102) {
            System.out.println("в вагоне есть стоячие места");
        } else if (place > 102) {
            System.out.println("вагон полностью забит");
        }
        //задача 6 окончена

        int one = 20;
        int two = 15;
        int three = 10;
        int max;
        if (one >= two && one >= three) {
            max = one;
        } else if (two >= three && two >= one) {
            max = two;
        } else {
            max = three;
        }
        System.out.println("максимальное из 3 чисел это " + max);
    }
}
// задача 7 окончена