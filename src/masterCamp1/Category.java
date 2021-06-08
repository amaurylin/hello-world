package masterCamp1;

public class Category {

	int idCategory;
	String nameCategory;
	
	public Category(int idCategory, String nom) {
		idCategory = idCategory;
		nameCategory = nom;
	}

	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}
	
	
}
