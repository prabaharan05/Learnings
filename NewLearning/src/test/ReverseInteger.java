package test;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Integer.MAX_VALUE);
		int x=123;
		int rev=0;
		while(x!=0) {
			int pop=x%10;
			System.out.println(pop);
			x/=10;
			System.out.println("dive="+x);
			if(rev>Integer.MAX_VALUE/10||(rev==Integer.MAX_VALUE/10&&pop>7))
				System.out.println(0);
			if(rev<Integer.MIN_VALUE/10||(rev==Integer.MIN_VALUE/10 && pop<-8))
				System.out.println(0);
			
			rev=rev*10+pop;
			System.out.println("rev="+rev);	
			
		}

	}

}
