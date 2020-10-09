package TheRoad.Locations.BossEnd;

import TheRoad.Locations.LocationStrategy;

public class RoadBoss implements LocationStrategy {
    @Override
    public String getLocation() {
        return "As you continue your journey on the road you come up to a man that stops you. \n" +
                "He says to you: \n" +
                "Look this is a programming class and not a writing class so I don't have anything interesting to say.\n" +
                "We don't have to fight if you don't want to, but you'll have to pay me 100 gold \n" +
                "Or we can just fight and I'll just take your gold... really your choice after all isn't it? \n" +
                "1) Pay the 100 gold \n" +
                "2) Fight for your live (and more importantly your gold)";
    }

    @Override
    public int getLocationId() {
        return 5;
    }





}
