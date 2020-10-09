package TheRoad.Characters;

public class Archer implements CharacterStrategy {
    @Override
    public  String name() {
        return "Archer";
    }

    @Override
    public String discretion() {
        return "The Archer has high damage and speed but low health";
    }

    @Override
    public int health() {
        return 30;
    }

    @Override
    public int damage() {
        return 50;
    }

    @Override
    public int speed() {
        return 20;
    }
}
