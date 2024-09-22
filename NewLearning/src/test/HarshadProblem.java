package test;

public class HarshadProblem {

	
	public static void main(String[] args) {
	int x=23;
	
	int s=0;
	int y=x;
	while(y>0) {
		s+=y%10;
		y/=10;
	}
	 System.out.println( s>0?s:-1);
}
	
}
