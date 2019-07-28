package singh.mahabir.rds.sl;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import singh.mahabir.rds.sl.model.UserRatings;

/**
 * IRatingDataService contains endpoint to expose user ratings details
 * 
 * @author MahabirSingh
 *
 */
@RequestMapping(path = "/ratings")
public interface IRatingDataService {

	/**
	 * getUserRating takes userId and returns {@link UserRatings} UserRatings class which contains 
	 * User rating details 
	 * 
	 * @param userId userId
	 * @return UserRatings
	 */
	@GetMapping(path = "/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<UserRatings> getUserRating(@PathVariable String userId);
}
