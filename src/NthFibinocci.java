import java.util.*;

public class NthFibinocci {
	public static int get(int n) {
		if (n == 1)
			return 0;
		 else if (n == 2)	
			return 1;
		else {
			return get(n - 1) + get(n - 2);
		}
			
	}
	public static void main(String args[]) {
		System.out.println(get(3));
	}
}
