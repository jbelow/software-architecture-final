package TheRoad.Characters;

public class EnemyOswyn implements CharacterStrategy {
    private int health = 150;


    @Override
    public String getName() {
        return "Oswyn";
    }

    @Override
    public String getDiscretion() {
        return "an old man that seems harmless.";
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
        return 10;
    }

    @Override
    public int getSpeed() {
        return 10;
    }

}
