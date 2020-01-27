package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program {

	public static void main(String[] args) {
		
		//Caminho do arquivo
		String path = "C:\\Users\\Beco\\eclipse-workspace\\filereader-project1\\in.txt";
		
		//BufferedReader l� o arquivo vindo do FileReader com o parametro do caminho
		//try with resources
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			//Enquanto a line for diferente de null fa�a
			while(line != null) {
				//Imprimindo na tela cada linha do arquivo
				System.out.println(line);
				line = br.readLine();
			}
		}
			catch(IOException e) {
				//mensagem de exce��o
				System.out.println("Error : " + e.getMessage());
			}
			
		}
	}


