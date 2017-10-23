package cl.devweb.processor.user;

import com.google.common.base.Preconditions;

import cl.devweb.model.citydeal.UserCD;
import cl.devweb.model.devwebish.UserPivot;

import org.springframework.batch.item.ItemProcessor;


public class UserCDToUserPivotProcessor implements ItemProcessor<UserCD, UserPivot> {


	@Override
	public UserPivot process(UserCD userCD) throws Exception {
		Preconditions.checkNotNull(userCD);

		UserPivot userPivot = new UserPivot();
		userPivot.setUuid(userCD.getU_uuid().toString());
		userPivot.setCdUserId(userCD.getU_id());

		return userPivot;
	}
}

