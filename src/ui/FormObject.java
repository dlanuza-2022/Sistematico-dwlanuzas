package ui;

import java.util.Scanner;

import dol.Autor;
import dol.Book;

public class FormObject {
	Scanner sc = new Scanner(System.in);
	
	public Autor catchAutor() {
		Autor o = new Autor();
		System.out.println("Primer nombre: ");
		o.setFirstName(sc.next());
		System.out.println("Segundo nombre: ");
		o.setMiddleName(sc.next());
		System.out.println("Primer apellido: ");
		o.setSurName(sc.next());
		System.out.println("Segundo apellido: ");
		o.setSecondSurName(sc.next());

		System.out.println("Pseudonimo: ");
	    o.setNickName(sc.nextLine());
	    sc.nextLine();
	    
	    System.out.println("Nacionalidad: ");
	    o.setNationality(sc.next());
	    
		
		return o;
		
	}

	
	public Book cathBook() {
		Book o = new Book();
		
		System.out.println("Título: ");
		o.setTitle(sc.nextLine());
		sc.nextLine();
		
		System.out.println("Editorial: ");
		o.setEditorial(sc.nextLine());
		sc.nextLine();
		
		System.out.println("Edición: ");
        o.setEdition(sc.next());
		
		System.out.println("Año de publicación: ");
		o.setPublicationYear(sc.nextInt());
		
		return o;
		
	}
}
