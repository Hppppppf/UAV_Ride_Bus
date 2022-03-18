package Resource.Buses;

import Resource.Position;
import Resource.TimeSlot;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: Hppppppf
 * @Date: 2022/3/18 14:27
 * @Description: set of buses routes defined by the stops and arrival/departure times.
 */
public class BusRoutes {
    List<Bus> buses;
    HashMap<TimeSlot, Position> busRouteTable;
}
