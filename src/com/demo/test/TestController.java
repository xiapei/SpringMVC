package com.demo.test;

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
     * @param num       原数据
     * @param fromRadix 原进制
     * @param toRadix   转换的进制
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
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String num = scanner.next();
            int fromRadix = scanner.nextInt();
            int toRadix = scanner.nextInt();
            System.out.println(transRadix(num,fromRadix,toRadix));
        }
    }
}
