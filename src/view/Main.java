package view;

import java.io.IOException;

import controller.TamanhosController;

public class Main {

	public static void main(String[] args) {
		TamanhosController tamCont = new TamanhosController();
		String path = "C:\\TEMP";
		try {
			tamCont.readDir(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
