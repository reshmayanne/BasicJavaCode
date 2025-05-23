package JavaPractise;

public class stringoperation {

	public static void main(String[] args) {
		
		String input="I love india";
		String str;
		/*System.out.println(input.length());
		System.out.println(input.toLowerCase());
		System.out.println(input.toUpperCase());
		System.out.println(input.charAt(3));
		System.out.println(input.equals(""));
		System.out.println(input.concat(" 2025"));*/
		//System.out.println(input.trim());
		//System.out.println(input.indexOf("i"));
		//System.out.println(input.substring(5));
		//String str=input.replace('i', 'w');
		
		//str=input.replaceAll(" ", "_");
		//str=input.repeat(6);
		boolean a=input.equalsIgnoreCase("i love india");
		
		System.out.println(a);

	}

}
