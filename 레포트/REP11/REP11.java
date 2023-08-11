public class REP11 {

public static void main(String[] args) {
	
	String[][] data1 = {{"A","B"},{"1","2"},{"XX","YY","ZZ"}};
	String[][] data2 = {{"A"},{"1"},{"2"},{"XX","YY"}};
	String[][] data3 = {{"A","B"},{"1","3"},{"2"},{"XX","YY"}};
	
	String[] s1 = new String[data1.length];
	System.out.println("<data1 output>");
	recursive(data1, s1, 0);
	String[] s2 = new String[data2.length];
	System.out.println("\n<data2 output>");
	recursive(data2, s2, 0);
	String[] s3 = new String[data3.length];
	System.out.println("\n<data3 output>");
	recursive(data3, s3, 0);
}

public static void recursive(String[][] data, String[] arr, int a) {
	
	if (a >= data.length)
		return;
	for (int i = 0; i < data[a].length; i++) {
		arr[a] = data[a][i];
		recursive(data, arr, a+1);
		if (a == data.length -1 ) {
			write(arr);
		}
	}
}

public static void write(String[] arry){
	for (int i = 0; i < arry.length; i++)
		System.out.print(arry[i] + " ");
	
	System.out.println();
	}
}








