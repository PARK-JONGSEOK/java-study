class InnerEx1 {
	public static void main(String args[]) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

	void myMethod() {
		class LocalInner {
			//                static int cv = 300;          // 에러! static변수를 선언할 수 없다.
			final static int CONST = 300; // final static은 상수이므로 허용
			int iv = 300;
		}
	}

	static class StaticInner {
		static int cv = 200;       // static클래스만 static멤버를 정의할 수 있다.
		int iv = 200;
	}

	class InstanceInner {
		//          static int cv = 100;            // 에러! static변수를 선언할 수 없다.
		final static int CONST = 100;   // final static은 상수이므로 허용한다.
		int iv = 100;
	}
} 
