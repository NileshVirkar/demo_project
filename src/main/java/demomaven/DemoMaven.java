package demomaven;

public class DemoMaven {

	public static void main(String[] args) {
		int k;
	}
	
	public boolean unusedMethod(boolean k) {
		k = true;
		
        
		return k;
	}
	
	public boolean unusedMethod2(boolean k) {
		boolean p=true;
		return p;
	}

	
	//comment
	//comment
	public boolean unusedMethod_k(boolean k) {
		unusedMethod2(true); unusedMethod2(true); unusedMethod2(true); unusedMethod2(true); unusedMethod2(true); unusedMethod2(true); unusedMethod2(true);
		//comment
		//comment
		//comment
		//comment
		//comment
		//comment
		//comment
		boolean p=true;
		return p;
	}
}
