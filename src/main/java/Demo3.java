public class Demo3 {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 2, 3, 4, 5, 6));

        Man man = new Man();
        Man man2 = new Man("Cherisia", 30);
        System.out.println("man : " + man);
        System.out.println("man2 : " + man2);

        Hero hero = new Hero("슈퍼맨");
        Hero hero2 = new Hero("배트맨");
        hero.attack(hero2);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static int add(int ... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}


