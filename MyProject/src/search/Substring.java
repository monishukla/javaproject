package search;
import java.util.Arrays;
public class Substring {
	public static void main(String[] args){
		String from = "";
		String to = "";
		String str = "My name is";
		String[] strArray = str.split(" "); //[My, name, is, tom..]
		//String arr = Arrays.toString(strArray);
		from = strArray[1];
		try{
		    to = strArray[3];
		}catch(ArrayIndexOutOfBoundsException e){
		    //System.out.print("String lout of bound exception");
		    to = strArray[strArray.length-1];
		    System.out.print(fx(from, to, str));
		}
		
		}
		public static String fx(String from, String to, String str){

		int x = str.indexOf(from);
		int y = str.indexOf(to);

		String str2 = str.substring(x,y);
		return str2;


		}


}
