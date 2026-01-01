public class Hero extends Man {
    public Hero(String name) {
        super(name, 0);
    }
    private boolean isFlying;

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public void attack(Hero hero) {
        System.out.println(hero.getName() + "와 싸움!");
    }
}
