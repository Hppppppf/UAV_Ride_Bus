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
    /*
    flying,//staying over a bus stop and draining a constant per-slot amount of energy
    riding; //recharging on top of a bus, and gaining a constant per-slot amount of energy equal
    */
    //论文模型部分介绍了上面2种状态，但实验中使用了下面4种状态
    charing,
    discharing,
    waiting,
    riding;

}
