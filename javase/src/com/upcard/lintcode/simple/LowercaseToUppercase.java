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
    //65��90Ϊ26����дӢ����ĸ��97��122��Ϊ26��СдӢ����ĸ
    
    public static char lowercaseToUppercase1(char character) {
    	return (char) (character -97 + 65);
     }
    
    public static char uppercaseTolowercase(char character) {
    	return (char) (character + 32);
     }
}
