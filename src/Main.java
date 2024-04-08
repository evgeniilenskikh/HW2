public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        double dog = 8;
        {
            System.out.println(dog);
        }
        double cat = 3.6;
        {
            System.out.println(cat);
        }
        var paper = 763789;
        {
            System.out.println(paper);
        }
        {
            System.out.println("Задание 2");
        }
        dog = dog + 4;
        {
            System.out.println(dog);
        }
        cat = cat + 4;
        {
            System.out.println(cat);
        }
        paper = paper + 4;
        {
            System.out.println(paper);
            {
                System.out.println("Задание 3");
            }
        }
        dog = dog - 3.5;
        {
            System.out.println(dog);
        }
        cat = cat - 1.6;
        {
            System.out.println(cat);
        }
        paper = paper - 7639;
        {
            System.out.println(paper);
        }
        System.out.println("Задание 4");
        var friend = 19;
        {
            System.out.println(friend);
        }
        friend = friend + 2;
        {
            System.out.println(friend);
        }
        friend = friend / 7;
        {
            System.out.println(friend);
        }
        {
            System.out.println("Задание 5");
        }
        var frog = 3.5;
        {
            System.out.println(frog);
        }
        frog = frog * 10;
        {
            System.out.println(frog);
        }
        frog = frog / 3.5;
        {
            System.out.println(frog);
        }
        frog = frog + 4;
        {
            System.out.println(frog);
        }
        {
            System.out.println("Задание 6");
            var firstBoxer = 78.2;
            var secondBoxer = 82.7;
            var totalWeight = firstBoxer + secondBoxer;
            var differenceMass = secondBoxer - firstBoxer;
            {
                System.out.println(totalWeight);
                System.out.println(differenceMass);
            }
            {
                System.out.println("Задание 7");
            }
            var remainder = secondBoxer % firstBoxer;
            {
                System.out.println(remainder);
            }
            {
                System.out.println("Задание 9");
            }
            var hours = 640;
            var spendEveryWorkers = 8;
            var allWorkers = hours / spendEveryWorkers;
            {
                System.out.println("Всего работников в компании - " + allWorkers + " человек");
            }
        }
    }
}