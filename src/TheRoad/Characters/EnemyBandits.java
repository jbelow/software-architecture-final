package TheRoad.Characters;

public class EnemyBandits implements CharacterStrategy {
    @Override
    public String name() {
        return "Bandits";
    }

    @Override
    public String discretion() {
        return "group of mischievous individuals on the road.";
    }

    @Override
    public int health() {
        return 100;
    }

    @Override
    public int damage() {
        return 20;
    }

    @Override
    public int speed() {
        return 30;
    }
}
