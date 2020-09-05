package homework1.bpy;
import java.util.*;
/**
 *在一个二维数组中（每个一维数组的长度相同）
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 */

public class Work1_2 {
    public static void main(String[] args) {
        System.out.println("Target:");
        Scanner num = new Scanner(System.in);
        int target = num.nextInt();
        System.out.println("The order of the array:");
        int x = num.nextInt();
        int y = num.nextInt();
        System.out.println("Input the elements of array:");
        int[][] array = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = num.nextInt();
            }
        }
        Find(target,array);
    }

    public static void Find(int target, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    System.out.println("Find the target:" + target);
                    return;
                }
                else {
                    System.out.println("No target found");
                    continue;
                }
            }
        }
    }
}
