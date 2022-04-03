package 学习计划.编程能力.编程能力入门.Day12_类_对象;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/3 15:43
 * @Description:
 */

public class R1603_设计停车系统 {

    class ParkingSystem {
        int big, medium, small;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            if (carType == 1) {
                if (big > 0) {
                    big--;
                    return true;
                }
            } else if (carType == 2) {
                if (medium > 0) {
                    medium--;
                    return true;
                }
            } else if (carType == 3) {
                if (small > 0) {
                    small--;
                    return true;
                }
            }
            return false;
        }
    }

}
