package dol;

public class Book implements IShow {
	
	private String title;
	private String editorial;
	private String edition;
	private int publicationYear;

	public Book() {
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	
	
	
	
	
	@Override
	public void showAsARow() {
		System.out.printf("Título: %s Editorial: %s Edición: %s Año de publicación: %s", 
				getTitle(),
				getEditorial(),
				getEdition(),
				getPublicationYear());
		
	}
	
	
	

}
