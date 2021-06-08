package masterCamp1;

import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException {
		
		try {
			
		
			File file = new File("Category.txt");
			FileReader fr = new FileReader(file);
				
			BufferedReader br = new BufferedReader(fr);
			StringBuffer sb = new StringBuffer();    
			String line;
			    
			while((line = br.readLine()) != null) {
			    sb.append(line);      
			    sb.append("\n");     
			}
			      
			fr.close();    
			System.out.println("Contenu du fichier: ");
			System.out.println(sb.toString()); 
		      
		}
		
		
		catch(IOException e) {
			
			e.printStackTrace();
		}
		

		
		try{
			  FileWriter myWriter = new FileWriter("Category.txt",true);
			  BufferedWriter out = new BufferedWriter(myWriter);
			  out.write("\n"+"4;resume");
			  out.close();
		  }
		
		catch (Exception e){
			 System.err.println("Error while writing to file: " +
		          e.getMessage());
		  }
	}

}