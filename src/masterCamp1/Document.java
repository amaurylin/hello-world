package masterCamp1;

public class Document {
	
	int idDocument;
	String nomDoc;
	Category category;
	Topic topic;
	Tag tag;
	
	public Document(int id, String nom, Category category, Topic topic, Tag tag) {
		idDocument = id;
		nomDoc = nom;
		category = category;
		topic = topic;
		tag = tag;
		
	}

	public int getIdDocument() {
		return idDocument;
	}

	public void setIdDocument(int idDocument) {
		this.idDocument = idDocument;
	}

	public String getNomDoc() {
		return nomDoc;
	}

	public void setNomDoc(String nomDoc) {
		this.nomDoc = nomDoc;
	}
	
	
}
