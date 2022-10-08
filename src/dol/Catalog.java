package dol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalog {
	Scanner sc = new Scanner(System.in);
	private List<Autor> autors;
	private List<Book> books;
	
	
	public Catalog() {
		autors = new ArrayList<Autor>();
	}
	
	
	public List<Autor> getAutors() {
		return autors;
	}
	public void setAutors(List<Autor> autors) {
		this.autors = autors;
	}
	public List<Book> getBooks() {
		return books;
	}
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}


	public void addAutor(Autor o) {
		autors.add(o);
	}
	
	public void addBookToAutor(int index, Book b) {
		autors.get(index).addBook(b);
	}
	

	
	public int seletAutorFromCatalog(){
		showAutorsAsAList();
		
		int index = 0;
		
		do {
			System.out.println("Seleccione un índice: ");
			index = sc.nextInt();
			
			if(index < 0 || index > autors.size()) {
				System.out.println("Opción inválida.");
				
			}
			
		}while(index < 0 || index > autors.size());
		
		return index;
	}
	
	
	public void showAutorsAsAList() {
		
		System.out.println("==========Lista de autores=========");
		for(int i = 0; i < autors.size(); i++) {
			System.out.print((i+1) + ".");
			autors.get(i).showAsARow();
			
		}
	}
	
 

}
