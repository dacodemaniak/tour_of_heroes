package tour_of_heroes.database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

public class DatabaseCredentials {
	private String propertyFile = "./database.properties";
	
	public Optional<Properties> readCredentials() {
		Properties properties = new Properties();
		
		try {
			FileInputStream propertiesStream = new FileInputStream(this.propertyFile);
			try {
				properties.load(propertiesStream);
				return Optional.of(properties);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				return Optional.empty();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return Optional.empty();
		}
		
		
	}
}
