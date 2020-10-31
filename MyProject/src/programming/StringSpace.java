package programming;

public class StringSpace {
	public static void main(String[] args) {
		String str = "Hell o Mani sha    shuk   la";
		String str1 = str.replaceAll("\\s", ""); // inbuilt function
		System.out.println(str1);
	}

}
