package Resource.Maps;

import Resource.Position;

import java.util.List;

/**
 * @author Hppppppf
 * @date 2022/3/18 13:47
 * @description
 */
public class BusStop {
    Position BusStopPosition;
    boolean isCoverPOI;//若无人机悬停在公交车站上能覆盖到POI，则会有额外耗能
    List<POI> coveredPOI;// set of POIs reachable in a time-slot
}
