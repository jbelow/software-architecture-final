package TheRoad.Characters;

public class Knight implements CharacterStrategy {


    private int health = 60;

    @Override
    public String getName() {
        return "Knight";
    }

    @Override
    public String getDiscretion() {
        return "The Knight is your generic tank that has a lot of health and can do ok damage.";
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
        return 30;
    }

    @Override
    public int getSpeed() {
        return 10;
    }


}
