package singh.mahabir.rds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Main class to start the rating data service
 * 
 * @author Mahabir Singh
 *
 */
@SpringBootApplication

/**
 * The below annotation is required to make this application as client of eureka
 * but this annotation is not required when we added the eureka dependency
 */
@EnableDiscoveryClient
public class RatingsDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingsDataServiceApplication.class, args);
	}

}
