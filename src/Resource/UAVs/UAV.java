package Resource.UAVs;

import Resource.Position;
import Resource.TimeSlot;

import java.util.HashMap;

/**
 * @Author: Hppppppf
 * @Date: 2022/3/18 13:47
 * @Description:
 */
public class UAV {
    String ID;
    UAV_Status stats;
    HashMap<TimeSlot, Position> UAVPosition;
    Integer energy;
}
