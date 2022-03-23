package Resource.UAVs;

import Resource.Buses.Bus;
import Resource.Maps.BusStop;
import Resource.TimeSlot;

/**
 * @author Hppppppf
 * @date 2022/3/18 13:57
 * @description
 */
public enum UAV_Status {
    flying,//staying over a bus stop and draining a constant per-slot amount of energy
    riding, //recharging on top of a bus, and gaining a constant per-slot amount of energy equal
    waiting//TODO P1049 状态还需要再分？
}
