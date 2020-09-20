class ExpressionB{
	public static void main(String args[]){
		int x = 3;
		int y = x++ + ++x;
		System.out.println("Value of x="+x);
		System.out.println("Value of y="+y);
	}
}