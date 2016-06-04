package helloworld;

public class Array {
public static void main(String[]args){
	//System.out.println("This is added in gits branch");
	String name="pinki";
	String password="wwww";
	String city="bbsr";
	String zip="1244";
	String email="qwe@gmail.com";
			
	String str[]=new String[5];
	int i[]=new int[3];
	 i[0]=100;
	 i[1]=222;
	i[2]=200;
	str[0]="pinki";
	str[1]="wwww";
	str[2]="bbsr";
	str[3]="1244";
	str[4]="qwe@gmail.com";
	System.out.println(str.length);
	System.out.println(i.length);

	//int i[]=new int[3];
	for(int x=0;x<str.length;x++){
		System.out.println(str[x]);
	}
	for(int y=0;y<i.length;y++){
		System.out.println(i[y]);
	}
	for(int y=i.length-1;y>=0;y--){
		System.out.println(i[y]);
	}
	
}
}
