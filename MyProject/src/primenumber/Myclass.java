package primenumber;

import java.util.Arrays;

public class Myclass{

public static void main(String[] args){

String str = "My name is tom. My best Friend's name is Jerry";
String[] strArray = str.split(" "); //[My, name, is, tom..]
String arr = Arrays.toString(strArray);
String from = strArray[strArray.length-9];
String to = strArray[strArray.length-7];
System.out.println(strArray.length);

System.out.println(fx(from, to, str));
}
public static String fx(String from, String to, String str){

int x = str.indexOf(from);
int y = str.indexOf(to);

String str2 = str.substring(x,y);
return str2;


}






}


