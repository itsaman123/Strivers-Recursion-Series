public class Rcsn1
{
	public int RecSum(int i,int Sum){
		if(i<1)
			//System.out.println(Sum);
			return Sum;
		return RecSum(i-1,Sum+i);
	}
    public static void main(String[] args){
		int Sum=12;
		int i=0;
		Rcsn1 ob=new Rcsn1();
		System.out.println(ob.RecSum(i,Sum));
		
		//RecSum(i-1,Sum+i);
		
	}
}