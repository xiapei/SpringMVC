package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/8/6 10:36
 */
public class TestController {

    /**
     * 设置字符数组
     * 可以添加任意不重复字符，提高能转换的进制的上限
     *
     * 抽象方法是为了将所有取值，都列出来，最多是10个数字+26个字母
     * 如果不存，大于10的时候就会变成'10','11'这种2位数，应该为'A','B'
     */
    static char[] chs = new char[36];

    static {
        for (int i = 0; i < 10; i++) {
            chs[i] = (char) ('0' + i);
        }
        for (int i = 10; i < chs.length; i++) {
            chs[i] = (char) ('A' + (i - 10));
        }
    }

    /**
     * 进制转换方法
     * 算法思想：Integer.valueOf(字符串, 进制);转化为10进制数，然后用10进制的数除以需要转化的进制，
     * 取余数对应chs的值，reverse之后就是所得结果
     * @param num 原数据
     * @param fromRadix 原进制
     * @param toRadix 转换的进制
     * @return 转换后数据
     */
    static String transRadix(String num, int fromRadix, int toRadix) {
        int number = Integer.valueOf(num, fromRadix);
        StringBuilder sb = new StringBuilder();
        while (number != 0) {
            sb.append(chs[number % toRadix]);
            number = number / toRadix;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse(2147483647));
//        int[] nums = {2,2,3,5};
//        int target = 15;
//        int[] array = twoSum(nums,target);
//        System.out.println(Arrays.toString(array));

//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String num = scanner.next();
//            int fromRadix = scanner.nextInt();
//            int toRadix = scanner.nextInt();
//            System.out.println(transRadix(num,fromRadix,toRadix));
//        }
    }

    /**
     * int类型数值反转
     * @param x 输入值
     * @return 返回反转的值
     */
    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            //ans*10如果大于Integer.MAX_VALUE，那么(ans*10)/10肯定为负数，不等于原ans
            if ((ans * 10) / 10 != ans) {
                ans = 0;
                break;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;
    }

    public static int reverse1(int x) {
        int newInt = 0;
        while (x != 0){
            int ex = x % 10;
            if (newInt > Integer.MAX_VALUE / 10 || (newInt == Integer.MAX_VALUE / 10 && ex > 7)) {
                return 0;
            }
            if (newInt < Integer.MIN_VALUE / 10 || (newInt == Integer.MIN_VALUE / 10 && ex < -8)) {
                return 0;
            }
            x = x / 10;
            newInt = ex + newInt * 10;
        }
        return newInt;
    }

    /**
     * 输入一个值和数组，找出数组中相加等于该值的下标并返回
     * @param nums 给出的数组
     * @param target 目标值
     * @return 返回0（未找到）或者下标数组
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }
        throw  new IllegalArgumentException("没有合适的值");
    }
}
