package singh.mahabir.rds.sl;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import singh.mahabir.rds.sl.model.UserRatings;
import singh.mahabir.rds.sl.model.UserRequst;

/**
 * Contains the rest endpoint of ratings data service
 * 
 * @author MahabirSingh
 *
 */
@RequestMapping(path = "/ratings")
public interface IRatingsEndpoint {


	@GetMapping(path = "/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<UserRatings> getUsersRatingByUserId(@PathVariable String userId);

	@PostMapping(path = "/user", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<UserRequst> saveUserDetail(@RequestBody UserRequst userRequst);

}
