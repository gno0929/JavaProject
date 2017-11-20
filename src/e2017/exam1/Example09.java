package e2017.exam1;

class Data {
	Object obj;

	public Data(Object obj) {
		this.obj = obj;
	}
}
public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data[] a = new Data[3];
		a[0] = new Data(new int[] {1, 2, 3});
		a[1] = new Data(new Integer[] {1, 2, 3});
		a[2] = new Data("hello");
	}

}
