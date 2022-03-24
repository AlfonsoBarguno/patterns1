package Singleton;



public class singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Undo undo = Undo.getInstance();
		
		
		
		undo.execute("Primero");
		undo.execute("Segundo");
		undo.execute("Tercero");
		
		undo.getList();
		
		undo.delete();
		undo.delete();
		
		undo.getList();
	}

}
