package p06.lecture.p4method;

public class MyClass8 {
	int max(int...a) {
		if(a.length ==0) {
			return 0;
		}
		int bb = a[0];
		for(int i = 0; i < a.length; i++) {
			if(bb < a[i]) {
				bb = a[i];
			}
		}
		return bb;
	}	
}
