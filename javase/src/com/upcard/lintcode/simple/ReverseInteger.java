package com.upcard.lintcode.simple;

/**
 * 反转一个只有3位数的整数。

样例
样例 1:

输入: number = 123
输出: 321
样例 2:

输入: number = 900
输出: 9
注意事项
你可以假设输入一定是一个只有三位数的整数，这个整数大于等于100，小于1000。
 * @author chenliang
 *
 */
public class ReverseInteger {

    public static int reverseIntegerInArray(int number) {
      int hundred = number % 10;
      int ten = number / 10 % 10;
      int ge = number / 100;
   	// 158ms 通过所有测试数据
      return number % 10 * 100 + number / 10 % 10 * 10 + number / 100;
   }
	
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public static int reverseInteger(int number) {
//       int hundred = number % 10;
//       int ten = number / 10 % 10;
//       int ge = number / 100;
    	// 158ms 通过所有测试数据
       return number % 10 * 100 + number / 10 % 10 * 10 + number / 100;
    }

}
