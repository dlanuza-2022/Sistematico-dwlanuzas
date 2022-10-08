package bll;

import dol.Autor;
import dol.Book;
import dol.Catalog;

public class Application {

	static Catalog ctl = new Catalog();
	
	
	public static void addAutor(Autor o) {
		ctl.addAutor(o);
	}
	
	public static void addBookToAutor(int index, Book o) {
		ctl.addBookToAutor(index, o);
	}
	
	
	public static int selectAutor() {
		return ctl.seletAutorFromCatalog();
	}
	
	
	public static void showAutors() {
		ctl.showAutorsAsAList();
	}
}




