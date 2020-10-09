package TheRoad.Locations.BossEnd;

import TheRoad.Locations.LocationStrategy;

public class RoadBossWin implements LocationStrategy {
    @Override
    public String getLocation() {
        return "It feels like it has been a lot of minutes since you started your journey to the city of whatever it was...\n" +
                "you ending up getting there though and not you can start your next text Adventure game there (hopefully the story is better there)";
    }

    @Override
    public int getLocationId() {
        return 13;
    }
}
