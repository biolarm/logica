
public class Exemplo {

	public static void dobra(int num) {
		num = 2 * num;		
	}
	
	public static void dobra(int[] num ) {
		num[0] = 2*num[0];
	}
	
	public static void main(String[] args) {
		int a = 10;
		dobra (a);
		System.out.println(a);
		
		int[] b = new int[1];
		b[0] = 10;
		dobra(b);
		System.out.println(b[0]);
	}
	
	
	
}
