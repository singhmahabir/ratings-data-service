package singh.mahabir.rds.sl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import singh.mahabir.rds.sl.model.UserRating;
import singh.mahabir.rds.sl.model.UserRatings;

/**
 * RatingDataService class implements the IRatingDataService and perform the end
 * point work
 * 
 * @author MahabirSingh
 *
 */
@RestController
@Slf4j
public class RatingDataService implements IRatingDataService {
	
	@Override
	public ResponseEntity<UserRatings> getUserRating(@PathVariable String userId){
		log.info("request coming for userId {}", userId);
		UserRatings ratings = new UserRatings();
		ratings.getRating().add(new UserRating("1234", 4, "good book"));
		ratings.getRating().add(new UserRating("2345", 2, "average book"));
		return new ResponseEntity<>(ratings , HttpStatus.OK);
	}
}
