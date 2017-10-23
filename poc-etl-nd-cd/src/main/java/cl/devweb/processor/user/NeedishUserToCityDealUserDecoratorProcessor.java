package cl.devweb.processor.user;

import cl.devweb.classifier.WriterRouterClassifierUser;
import cl.devweb.model.decorator.UserDecorator;
import cl.devweb.model.devwebish.Account;


public class NeedishUserToCityDealUserDecoratorProcessor extends AccountToUserDecoratorProcessor {


	@Override
	public UserDecorator process(Account account) throws Exception {
		UserDecorator userDecorator = super.process(account);

		if (account.getUser().getUserPivot() != null) {
			userDecorator.setOperation(WriterRouterClassifierUser.UPDATE_USERS_PIVOT_CITY_DEAL_USER);
		} else {
			userDecorator.setOperation(WriterRouterClassifierUser.INSERT_USERS_PIVOT_CITY_DEAL_USER);
		}

		return userDecorator;
	}
}

