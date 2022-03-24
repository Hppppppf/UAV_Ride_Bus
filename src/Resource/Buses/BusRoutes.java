package Resource.Buses;

import Resource.Maps.BusStop;
import Resource.Position;
import Resource.TimeSlot;

import java.util.HashMap;
import java.util.List;

/**
 * @author Hppppppf
 * @date 2022/3/18 14:27
 * @description set of buses routes defined by the stops and arrival/departure times.
 */
public class BusRoutes {
    List<Bus> buses;//可能存在一条线路多辆车
    HashMap<TimeSlot, Position> busRouteTable;
    List<BusStop> busStops;//路线上经停的车站
}
