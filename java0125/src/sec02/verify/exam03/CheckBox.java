package sec02.verify.exam03;

public class CheckBox {
	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) { //필드값을 바꿔줌(setter)
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}

	static interface OnSelectListener{
		void onSelect();
	}
}
