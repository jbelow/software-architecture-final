package TheRoad.Characters;

public class Archer implements CharacterStrategy {
    private int health = 30;

    @Override
    public String getName() {
        return "Archer";
    }

    @Override
    public String getDiscretion() {
        return "The Archer has high damage and speed but low health";
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getDamage() {
        return 50;
    }

    @Override
    public int getSpeed() {
        return 20;
    }


}
