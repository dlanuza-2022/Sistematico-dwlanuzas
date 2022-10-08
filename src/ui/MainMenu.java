package ui;

import java.util.Scanner;

import bll.Application;
import dol.Book;

public class MainMenu implements IMenu {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void show() {
		short op = 0;
		
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			
			op = sc.nextShort();
			
			
			switch(op) {
			case 1:
				FormObject fo = new FormObject();
				Application.addAutor(fo.catchAutor());
				break;
			case 2:
				int index = Application.selectAutor();
				Book o = new Book();
				FormObject fo2 = new FormObject();
				o = fo2.cathBook();
				Application.addBookToAutor(index, o);
				break;
				
			case 3:
				Application.showAutors();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}
			
			
		}while(op!=3);
		
	}

	@Override
	public void displayOptions() {
		System.out.println("==Menú principal==");
		System.out.println("1. Agregar un autor");
		System.out.println("2. Agregar libro a autor");
		System.out.println("3. Mostrar autores");
		System.out.println("4. Salir");
		
		
	}

}
