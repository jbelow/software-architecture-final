package TheRoad.Characters;

public class EnemyBandits implements CharacterStrategy {
    private int health = 40;

    @Override
    public String getName() {
        return "Bandits";
    }

    @Override
    public String getDiscretion() {
        return "group of mischievous individuals on the road.";
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
        return 15;
    }

    @Override
    public int getSpeed() {
        return 30;
    }
}
