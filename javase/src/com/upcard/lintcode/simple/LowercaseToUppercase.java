package com.upcard.lintcode.simple;

public class LowercaseToUppercase {
	public static void main(String[] args) {
		System.out.println(lowercaseToUppercase1('a'));
		System.out.println('A' + 32);
	}
	
    public char lowercaseToUppercase(char character) {
        char c;
         c = (char)(character-'a'+'A');
         return c;
     }
    //65～90为26个大写英文字母，97～122号为26个小写英文字母
    
    public static char lowercaseToUppercase1(char character) {
    	return (char) (character -97 + 65);
     }
    
    public static char uppercaseTolowercase(char character) {
    	return (char) (character + 32);
     }
}
