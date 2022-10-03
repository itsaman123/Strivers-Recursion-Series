public class Rec2
{
	public int fact(int i){
		if(i==0)
			return 1;
		return i*fact(i-1);
	}
    public static void main(String[] args){
		int i=5;
		Rec2 ob=new Rec2();
		System.out.println(ob.fact(i));
	}
}