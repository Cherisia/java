class Player {
    String name;
    int xp;
    int age;
    String team;

    Player(String name, int xp, int age, String team) {
        this.name = name;
        this.xp = xp;
        this.age = age;
        this.team = team;
    }

    void printName() {
        System.out.printf("안녕하세요. %s님. 경험치는 %d 입니다. 나이는 %d살, 팀은 %s 이네요.\n", name, xp, age, team);
    }
}

public class Class1 {
    public static void main(String[] args) {
        Player p1 = new Player("lea", 1500, 15, "red");
        p1.printName();
    }
}
