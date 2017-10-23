package cl.devweb.processor.user;

import com.google.common.base.Preconditions;

import cl.devweb.model.citydeal.UserCD;
import cl.devweb.model.decorator.UserDecorator;
import cl.devweb.model.devwebish.Account;
import cl.devweb.model.devwebish.UserPivot;
import cl.devweb.model.devwebish.util.NameUtil;

import org.springframework.batch.item.ItemProcessor;


public class AccountToUserDecoratorProcessor implements ItemProcessor<Account, UserDecorator> {


	@Override
	public UserDecorator process(Account account) throws Exception {
		Preconditions.checkNotNull(account);
		Preconditions.checkNotNull(account.getUser());
		Preconditions.checkNotNull(account.getUser().getCity());

		UserDecorator userDecorator = new UserDecorator(this.getUserPivot(account), this.getUserCD(account));

		return userDecorator;
	}

	private UserPivot getUserPivot(Account account) {
		UserPivot userPivot = new UserPivot();
		userPivot.setCityPivot(account.getUser().getCity());

		userPivot.setNUserId(account.getUser().getId());
		userPivot.setEmail(account.getUsername());
		userPivot.setNCompanyId(account.getUser().getCompany_id());
		userPivot.setUuid(account.getUser().getUuid().toString());
		if (account.getUser().getUserPivot() != null) {
			userPivot.setCdUserId(account.getUser().getUserPivot().getCdUserId());
		}
		
		return userPivot;
	}

	private UserCD getUserCD(Account account) {
		UserCD userCD = new UserCD(
				account.getUser().getCity()
		);

		userCD.setU_email(account.getUsername());
		userCD.setU_first_name(NameUtil.getFirstName(account.getUser().getName()));
		userCD.setU_last_name(NameUtil.getLastName(account.getUser().getName()));
		userCD.setU_password(account.getPassword());
		userCD.setU_personal_identifier(account.getShipping_rut());
		userCD.setU_uuid(account.getUser().getUuid());
		userCD.setCreated(account.getUser().getCreated());


		return userCD;
	}
}

