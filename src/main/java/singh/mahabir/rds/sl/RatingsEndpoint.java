package singh.mahabir.rds.sl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import singh.mahabir.rds.bl.IRatingService;
import singh.mahabir.rds.sl.model.UserRatings;
import singh.mahabir.rds.sl.model.UserRequst;

/**
 * Implementation of rating data service
 *
 * @author MahabirSingh
 *
 */
@RestController
@Slf4j
public class RatingsEndpoint implements IRatingsEndpoint {

    @Autowired
    private IRatingService ratingService;

    @Override
    public ResponseEntity<UserRatings> getUsersRatingByUserId(@PathVariable String userId) {
	log.info("request coming for userId {}", userId);
	return new ResponseEntity<>(ratingService.getUsersByUserid(userId), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserRequst> saveUserDetail(UserRequst userRequst) {
	log.info("request coming for user creation {}", userRequst);
	return ResponseEntity.ok(ratingService.saveUser(userRequst));
    }
}
