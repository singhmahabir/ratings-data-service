/**
 * Copyright 2019. All rights reserved.
 */

package singh.mahabir.rds.bl;

import singh.mahabir.rds.sl.model.UserRatings;
import singh.mahabir.rds.sl.model.UserRequst;

/**
 * It is service layer of 'rating data service'
 * 
 * @author Mahabir Singh
 *
 */
public interface IRatingService {

	UserRatings getUsersByUserid(String userId);

	UserRequst saveUser(UserRequst userRequst);

}
