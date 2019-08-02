/**
 * Copyright 2019. All rights reserved.
 */

package singh.mahabir.rds.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import singh.mahabir.rds.dl.User;
import singh.mahabir.rds.dl.UserRepository;
import singh.mahabir.rds.sl.model.UserRating;
import singh.mahabir.rds.sl.model.UserRatings;
import singh.mahabir.rds.sl.model.UserRequst;

/**
 * Service Layer implementation
 * 
 * @author Mahabir Singh
 *
 */

@Service
@Slf4j
public class RatingService implements IRatingService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserRatings getUsersByUserid(String userId) {
		log.info("request for userId {} at service layer", userId);
		UserRatings ratings = new UserRatings();
		List<User> users = userRepository.findByUserId(userId);
		users.forEach(
				user -> ratings.getRating().add(new UserRating(user.getBookId(), user.getRating(), user.getComment())));
		return ratings;
	}

	@Override
	public UserRequst saveUser(UserRequst userRequst) {
		User entity = new User();
		entity.setBookId(userRequst.getBookId());
		entity.setUserId(userRequst.getUserId());
		entity.setRating(userRequst.getRating());
		entity.setComment(userRequst.getComment());

		userRepository.save(entity);
		return userRequst;
	}



}
