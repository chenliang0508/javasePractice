package com.upcard.lintcode.simple;

/**
 * ��תһ��ֻ��3λ����������

����
���� 1:

����: number = 123
���: 321
���� 2:

����: number = 900
���: 9
ע������
����Լ�������һ����һ��ֻ����λ��������������������ڵ���100��С��1000��
 * @author chenliang
 *
 */
public class ReverseInteger {

    public static int reverseIntegerInArray(int number) {
      int hundred = number % 10;
      int ten = number / 10 % 10;
      int ge = number / 100;
   	// 158ms ͨ�����в�������
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
    	// 158ms ͨ�����в�������
       return number % 10 * 100 + number / 10 % 10 * 10 + number / 100;
    }

}
