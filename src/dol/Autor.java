package dol;

import java.util.ArrayList;
import java.util.List;

public class Autor extends Person implements IShow {
	
	private List<Book> books;
	private String nickName;
	
	public Autor() {
		super();
		books = new ArrayList<Book>();
		
	}


	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return super.getFirstName();
	}


	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		super.setFirstName(firstName);
	}


	@Override
	public String getMiddleName() {
		// TODO Auto-generated method stub
		return super.getMiddleName();
	}


	@Override
	public void setMiddleName(String middleName) {
		// TODO Auto-generated method stub
		super.setMiddleName(middleName);
	}


	@Override
	public String getSurName() {
		// TODO Auto-generated method stub
		return super.getSurName();
	}


	@Override
	public void setSurName(String surName) {
		// TODO Auto-generated method stub
		super.setSurName(surName);
	}


	@Override
	public String getSecondSurName() {
		// TODO Auto-generated method stub
		return super.getSecondSurName();
	}


	@Override
	public void setSecondSurName(String secondSurName) {
		// TODO Auto-generated method stub
		super.setSecondSurName(secondSurName);
	}


	@Override
	public String getNationality() {
		// TODO Auto-generated method stub
		return super.getNationality();
	}


	@Override
	public void setNationality(String nationality) {
		// TODO Auto-generated method stub
		super.setNationality(nationality);
	}


	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	@Override
	public void showAsARow() {
		System.out.printf("\nPrimer nombre: %s Segundo nombre: %s Primer apellido: %s Segundo apellido: %s Pseudonimo: %s Nacionalidad: %s", 
				getFirstName(),
				getMiddleName(),
				getSurName(),
				getSecondSurName(),
				getNickName(),
				getNationality());
		
		System.out.println("======================Libros=======================");
		for(int i = 0; i<books.size(); i++) {
			books.get(i).showAsARow();	
		}
		
	}

    public void addBook(Book o) {
    	books.add(o);
		
	}
	
	
}
