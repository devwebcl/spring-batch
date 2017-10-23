package cl.devweb.processor.user;

import com.fasterxml.uuid.Generators;
import com.google.common.base.Preconditions;

import cl.devweb.model.citydeal.UserAddressCD;
import cl.devweb.model.devwebish.UserAddress;
import cl.devweb.model.devwebish.util.NameUtil;

import org.apache.commons.lang3.StringUtils;
import org.springframework.batch.item.ItemProcessor;


public class UserAddressToUserAddressCDProcessor implements ItemProcessor<UserAddress, UserAddressCD> {


	@Override
	public UserAddressCD process(UserAddress userAddress) throws Exception {
		Preconditions.checkNotNull(userAddress);
		Preconditions.checkNotNull(userAddress.getUserPivot());
		Preconditions.checkNotNull(userAddress.getUserPivot().getCityPivot());

		UserAddressCD userAddressCD = new UserAddressCD();
		userAddressCD.setUa_u_id(userAddress.getUserPivot().getCdUserId());
		userAddressCD.setUa_first_name(NameUtil.getFirstName(userAddress.getRecipientName()));
		userAddressCD.setUa_last_name(NameUtil.getLastName(userAddress.getRecipientName()));
		userAddressCD.setUa_street(userAddress.getStreetName());
		userAddressCD.setUa_street_number(userAddress.getStreetNumber());
		userAddressCD.setUa_city(userAddress.getUserPivot().getCityPivot().getN_name());
		userAddressCD.setUa_postal_code(userAddress.getZipCode());
		userAddressCD.setUa_country(userAddress.getUserPivot().getCityPivot().getCountryEnum().name());
		userAddressCD.setUa_phone_number(userAddress.getPhoneNumber());
		userAddressCD.setUa_personal_identification_number(userAddress.getRecipientId());

		userAddressCD.setUa_additional_information(this.getAdditionalInformation(userAddress));

		userAddressCD.setUa_uuid(Generators.randomBasedGenerator().generate());

		return userAddressCD;
	}

	private String getAdditionalInformation(UserAddress userAddress) {
		StringBuilder additionalInformation = new StringBuilder();

		if (StringUtils.isNotEmpty(userAddress.getResidenceNumber())) {
			additionalInformation.append(userAddress.getResidenceNumber().trim());
		}

		if (StringUtils.isNotEmpty(userAddress.getReference())) {
			if (additionalInformation.length() > 0) {
				additionalInformation.append(String.format(" (%s)",userAddress.getReference().trim()));
			} else {
				additionalInformation.append(userAddress.getReference().trim());
			}
		}
		return additionalInformation.toString();
	}
}

