package Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Undo {

	private static Undo instance;

	private List<String> lista = new ArrayList<>();
	

	private Undo() {

	}
	

	public static synchronized Undo getInstance() {

		if (instance == null) {

			instance = new Undo();
		}

		return instance;
	}

	public void execute(String s) {

		lista.add(s);

	}

	public void delete() {
		
		lista.remove((lista.size()-1));
	}

	public void getList() {
		System.out.println(lista);
	}
}
