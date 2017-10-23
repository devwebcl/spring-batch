package cl.devweb.processor.user;

import cl.devweb.classifier.WriterRouterClassifierUser;
import cl.devweb.model.decorator.UserDecorator;
import cl.devweb.model.devwebish.Account;


public class FollowerToUserDecoratorProcessor extends AccountToUserDecoratorProcessor {


	@Override
	public UserDecorator process(Account account) throws Exception {
		UserDecorator userDecorator = super.process(account);
		userDecorator.setOperation(WriterRouterClassifierUser.INSERT_NEWSLETTER_CITY_DEAL_USER);
		return userDecorator;
	}
}

