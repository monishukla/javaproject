package search;

import java.util.Arrays;

/*public class Myclass{

public static void main(String[] args){
String str = "My name is tom. My best Friend's name is Jerry";
System.out.print(fx("name", "tom", str));
}
public static String fx(String from, String to, String str){

int x = str.indexOf(from);
int y = str.indexOf(to);

String str2 = str.substring(x,y);
return str2;

}


}*/


public class Myclass{

public static void main(String[] args){

/*String str = "My name is tom. My best Friend's name is Jerry";
char from = str.toCharArray()[1];  // name
char to = str.toCharArray()[3];   // tom
System.out.print(fx(from, to, str));
}
public static String fx(char from, char to, String str){

int x = str.indexOf(from);
int y = str.indexOf(to);

String str2 = str.substring(x,y);
return str2;

}

}*/

String str = "My name is tom. My best Friend's name is Jerry";
String[] strArray = str.split(" "); //[My, name, is, tom..]
String arr = Arrays.toString(strArray);
System.out.print(arr);

}
}



