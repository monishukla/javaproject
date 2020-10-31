package programming;

public class StringSpace2 {
	public static void main(String[] args) {
		String str = "Hell o Mani sha    shuk   la";
		char[] chars = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<chars.length;i++) {
			if((chars[i]!=' ')&&(chars[i]!='\t')) {
				sb.append(chars[i]);
			}
		}
		
		System.out.println(sb);
	}

}
