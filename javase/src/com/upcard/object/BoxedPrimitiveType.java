package com.upcard.object;

public class BoxedPrimitiveType {

	/**
	 * 优先使用基本类型而不是装箱基本类型
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long begin = System.currentTimeMillis();
		
		Long sum = 0L;
		for(long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		Long end = System.currentTimeMillis();
		System.out.println(sum);//2305843005992468481
		System.out.println(end - begin);//7492 ms
		
		Long begin1 = System.currentTimeMillis();
		
		long sum1 = 0;
		for(long i = 0; i < Integer.MAX_VALUE; i++) {
			sum1 += i;
		}
		Long end1 = System.currentTimeMillis();
		System.out.println(sum1);//2305843005992468481
		System.out.println(end1 - begin1);//769 ms
	}

}
