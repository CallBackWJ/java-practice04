package prob01;

public class Printer {

	public <T> void println(T i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
	
	public <T > void println(T ... i) {
		// TODO Auto-generated method stub
		for(T t:i)
		{
			System.out.print(t+" ");	
		}
		System.out.println();
	}

	public Integer sum(Integer... integers) {
		Integer sum=0;
		for(Integer i:integers)
			sum+=i;
		return sum;

	}
}
