package Resource;

/**
 * @author Hppppppf
 * @date 2022/3/23 20:24
 * @description
 */
public class CommonInfo {
    public static Double E_INIT = 130000.0;//无人机初始能量
    public static Double R = 400.0;//无人机覆盖半径
    public static Double ALPHA[] = {-120.0,-150.0,-170.0};//无人机以不同方式覆盖POI时能耗
    public static Double BETA = -100.0;//无人机悬停在公交车站能耗
    public static Double GAMMA = 25.0;//无人机在公交车上充电速率
}
