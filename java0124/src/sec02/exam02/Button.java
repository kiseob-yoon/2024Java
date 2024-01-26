package sec02.exam02;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick(); //구현객체에 따라 listener가 달라짐
	}

	static interface OnClickListener{
		void onClick();
	}
}
