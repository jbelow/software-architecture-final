package TheRoad.Characters;

public class Thief implements CharacterStrategy {

    private int health = 20;

    @Override
    public String getName() {
        return "Thief";
    }

    @Override
    public String getDiscretion() {
        return "The Thief has high speed to any attacks and any prying eyes that are trying to see what he's doing.";
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getDamage() {
        return 10;
    }

    @Override
    public int getSpeed() {
        return 70;
    }
}