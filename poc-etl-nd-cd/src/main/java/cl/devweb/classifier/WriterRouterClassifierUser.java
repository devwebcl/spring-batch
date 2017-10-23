package cl.devweb.classifier;

import org.springframework.batch.support.annotation.Classifier;

import cl.devweb.model.decorator.UserDecorator;


public class WriterRouterClassifierUser {


    public static String INSERT_NEWSLETTER_CITY_DEAL_USER = "insertNewsletterCityDealUser";
    public static String INSERT_USERS_PIVOT_CITY_DEAL_USER = "insertUsersPivotCityDealUser";
    public static String UPDATE_USERS_PIVOT_CITY_DEAL_USER = "updateUsersPivotCityDealUser";


   @Classifier
   public String classify(UserDecorator classifiable) {
       return classifiable.getOperation();
   }


}

