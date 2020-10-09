package TheRoad.Characters;

public class EnemyOswyn implements CharacterStrategy {

    @Override
    public String name() {
        return "Oswyn";
    }

    @Override
    public String discretion() {
        return "an old man that seems harmless.";
    }

    @Override
    public int health() {
        return 200;
    }

    @Override
    public int damage() {
        return 30;
    }

    @Override
    public int speed() {
        return 10;
    }

}
