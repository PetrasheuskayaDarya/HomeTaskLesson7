package by.htp.runner;

import by.htp.bean.B;
import by.htp.bean.C;

public class MainApp {

	static {
		new C();
	}

	public static void main(String[] arg){
		new C(new B());
	}
}


//������� ����������� ���� AS1, ����� ���������� ���� AL1