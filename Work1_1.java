package homework1.bpy;
import java.util.*;
/**
 * 求2+4+6+...+2n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 * 输入n
 */
public class Work1_1 {
    public static void main(String[] args) {
        System.out.println("Enter n：");
        Scanner num=new Scanner(System.in);
        int n = num.nextInt();
        System.out.println("Result:"+Sum_Solution(n)*2);
    }

    public static int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }
}

