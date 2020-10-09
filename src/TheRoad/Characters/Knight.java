package TheRoad.Characters;

public class Knight implements CharacterStrategy {
    @Override
    public String name() {
        return "Knight";
    }

    @Override
    public String discretion() {
        return "The Knight is your generic tank that has a lot of health and can do ok damage.";
    }

    @Override
    public int health() {
        return 60;
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
