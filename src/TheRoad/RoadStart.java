package TheRoad;

public class RoadStart implements LocationStrategy {


    @Override
    public String getLocation() {
        return "you are a traveler beginning your journey and you have two options";
    }

    @Override
    public int getLocationId() {
        return 1;
    }
}
