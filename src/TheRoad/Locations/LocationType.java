package TheRoad.Locations;

public final class LocationType {

    private static final int[] eventLocation = {3, 6, 11 };
    private static final int[] endingLocation = {4, 9, 12, 13, };
    
    private static final LocationType type = new LocationType();

    private LocationType(){}

    public static int[] getTypeEvent(){
        return eventLocation;
    }
    
    public static int[] getTypeEnding(){
        return endingLocation;
    }

    

}
