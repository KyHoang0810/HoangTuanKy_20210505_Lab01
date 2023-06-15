package lesson5;

public class app {
	public static int add( int a, int b) {
		return a+b+10;
		
	}
	public static int add(int ...a) {
		int res=0;
		for(int i:a) {
			res+=1;
		}
		return res;
		
	}
	public static void main(String args[])

}
