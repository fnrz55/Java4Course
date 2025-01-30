package Lab23.Num6;

public class Example3 {
	static String changeStr(Example1 sf, String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		String inStr = "Лямбда-выражения расширяют Java.";
		String outStr;
		System.out.println("Входная строка: " + inStr);
		
		Example1 reverse = (str) -> {
			String result = "";
			for(int i = str.length()-1; i>=0; i--)
				result += str.charAt(i);
			return result;
		};
		
		outStr = changeStr(reverse, inStr);
		System.out.println("Обращенная строка: " + outStr);
		
		outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
		System.out.println("Строка с замененными пробелами: "+ outStr);
		outStr = changeStr((str) -> {
			String result = "";
			char ch;
			for(int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				if (Character.isUpperCase(ch))
					result += Character.toLowerCase(ch);
				else
					result += Character.toUpperCase(ch);
			}
			return result;
		}, inStr);
		System.out.println("Строка с обращенным регистро букв: "+ outStr);
	}
}
