package com.upcard.object;

/**
 *  使用静态工厂方法代替构造方法
 *<p>方法存在名称，能正确描述返回的对象
 *<p>如果是不可变类，那么可以使用预先构建好的对象实例，并且可以缓存
 *<p>多态，面向接口，接口实例，如EnumSet，没有共有构造器，只有静态方法，根据枚举类型大小返回不同的实例
 *如：jdbc框架、collection 框架
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
	 * 雄性
	 */
	MALE,
	/**
	 * 雌性
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
	
	//使用静态方法构造对象，方法名字显而易见
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