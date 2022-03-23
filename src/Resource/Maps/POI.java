package Resource.Maps;

import Resource.Position;
import Resource.UAVs.UAV;

import java.util.List;

/**
 * @author Hppppppf
 * @date 2022/3/18 13:51
 * @description Point of Interests
 */
public class POI {
    String ID;
    Position position;
    POI_Categories cat;
    boolean isCovered;
    UAV coveredBy;
    List<BusStop> feasibleStops;// the feasible stops set of the 公交车站 reachable from POI within a time-slot
    //若无人机到达feasibleStops，则看作可以覆盖当前POI
    //TODO
    //网络链接
}
