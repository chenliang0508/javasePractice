package com.upcard.object;

/**
 *  ʹ�þ�̬�����������湹�췽��
 *<p>�����������ƣ�����ȷ�������صĶ���
 *<p>����ǲ��ɱ��࣬��ô����ʹ��Ԥ�ȹ����õĶ���ʵ�������ҿ��Ի���
 *<p>��̬������ӿڣ��ӿ�ʵ������EnumSet��û�й��й�������ֻ�о�̬����������ö�����ʹ�С���ز�ͬ��ʵ��
 *�磺jdbc��ܡ�collection ���
 * @author chenliang
 *
 */
public class StaticFactory {
	public static void main(String[] args) {
		Cat cat = Cat.getMaleCat("Tom", 12);
		System.out.println(cat.getGender());
	}

}

enum Gender{
	/**
	 * ����
	 */
	MALE,
	/**
	 * ����
	 */
	FEMINA
}

class Cat {
	private String name = null;
	private int age;
	private Gender gender;
	
	public Cat() {
		super();
	}
	
	public Cat(String name, int age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//ʹ�þ�̬����������󣬷��������Զ��׼�
	public static Cat getMaleCat(String name, int age) {
		return new Cat(name, age, Gender.MALE);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
}