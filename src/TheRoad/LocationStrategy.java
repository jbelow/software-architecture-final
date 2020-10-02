package TheRoad;


public interface LocationStrategy {

    //Strategy pattern to layout the different places the player can go
    String getLocation();

    int getLocationId();

}
