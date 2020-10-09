package TheRoad.Characters;

public class Thief implements CharacterStrategy {
    @Override
    public String name() {
        return "Thief";
    }

    @Override
    public String discretion() {
        return "The Thief has high speed to any attacks and any prying eyes that are trying to see what he's doing.";
    }

    @Override
    public int health() {
        return 20;
    }

    @Override
    public int damage() {
        return 10;
    }

    @Override
    public int speed() {
        return 70;
    }
}