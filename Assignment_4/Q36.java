class MathOpe{
    static void multiply(int a, int b){
		int mul = a + b;
        System.out.println("multiplication = "+ mul);
    }

    static void multiply(float a, float b, float c){
        float mul = a * b * c;
        System.out.println("multiplication = "+ mul);
    }
    static void multiply(int arr[]){
        int mul = 1;
   		for( int e : arr)
		{
         mul = mul * e;
        }
            System.out.println("multiplication = "+ mul);
    }
    static void multiply(double a, int b){
		double mul = a * b;
        System.out.println("multiplication = "+ mul);
    }
}
class Q36{

    public static void main(String args[]){
        MathOpe.multiply(2, 3);
        MathOpe.multiply(3.6f, 6.4f, 0.3f);
        int array[] = {4, 2, 5, 6, 7};
        MathOpe.multiply(array);
        MathOpe.multiply(13.4, 6);
    }
}