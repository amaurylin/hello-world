package masterCamp1;

public class Topic {

	int idTopic;
	String nomTopic;
	
	public Topic(int id, String nom) {
		
		idTopic = id;
		nomTopic = nom;
	}

	public int getIdTopic() {
		return idTopic;
	}

	public void setIdTopic(int idTopic) {
		this.idTopic = idTopic;
	}

	public String getNomTopic() {
		return nomTopic;
	}

	public void setNomTopic(String nomTopic) {
		this.nomTopic = nomTopic;
	}
	
}
