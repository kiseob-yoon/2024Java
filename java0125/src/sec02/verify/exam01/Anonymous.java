package sec02.verify.exam01;

public class Anonymous {
	Worker filed = new Worker() {
		@Override
		public void start() {
			System.out.println("디자인을 합니다.");
		}
	};

	void method1() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("개발을 합니다.");
			}
		};

		localVar.start();

	}

	void method2(Worker worker) { //익명 객체를 매개변수로 받는다.
		worker.start(); //익명 객체의 메서드를 호출한다.
	}
}
