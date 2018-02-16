package pattern;

public class Diamond {

    public static void main(String[] arg) {
	int n = 6;
	n = 2 * n - 1;
	int prev = n - (n / 2);
	for (int k = prev; k <= n; k++) {
	    for (int j = 1; j < prev; j++)
		System.out.print(" ");
	    callAlt(prev, k);
	    prev = prev - 1;
	    System.out.println();
	}
    }

    public static void callAlt(int prev, int k) {
	int dist = k - prev;
	for (int i = 0; i <= dist; i++) {
	    if (i % 2 == 0)
		System.out.print("*");
	    else
		System.out.print(" ");
	}
    }
}
