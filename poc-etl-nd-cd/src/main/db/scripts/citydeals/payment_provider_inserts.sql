-- We will use these Dummy payment providers for the Needish migration.
-- Ids 250, 251, 252 and 253 are available in CityDeals' UAT environment.
-- If these ids aren't available in prod, these inserts will have to change
-- along with the values in the PaymentProvider.java enum file.

INSERT INTO std_data.payment_provider(
            pp_id, pp_info, pp_config_detail, pp_local_display_text, pp_currency, 
            pp_last_modified, pp_auto_capture, pp_fast_authorize, pp_country_iso_code, 
            pp_service_provider_payment, pp_service_provider_modification, 
            pp_servive_provider_capturing, pp_payment_type, pp_administrable, 
            pp_recurring_type, pp_installment_basket_amount_min, pp_installment_count_max, 
            pp_created, pp_3ds_threshold, pp_app_id, pp_capture_instance)
    VALUES
      (250, 'Dummy pp CL', '', 'Dummy pp CL', 'CLP', 
            NULL, TRUE, FALSE, 'CL', 
            'DUMMY', 'DUMMY', 
            'DUMMY', 'EMPTY', FALSE, 
            NULL, 0, 0, 
            NULL, NULL, 46, NULL),
      (251, 'Dummy pp CO', '', 'Dummy pp CO', 'COP', 
            NULL, TRUE, FALSE, 'CO', 
            'DUMMY', 'DUMMY', 
            'DUMMY', 'EMPTY', FALSE, 
            NULL, 0, 0, 
            NULL, NULL, 21, NULL),
      (252, 'Dummy pp PE', '', 'Dummy pp PE', 'PEN', 
            NULL, TRUE, FALSE, 'PE', 
            'DUMMY', 'DUMMY', 
            'DUMMY', 'EMPTY', FALSE, 
            NULL, 0, 0, 
            NULL, NULL, 22, NULL),
      (253, 'Dummy pp MX', '', 'Dummy pp MX', 'MXN', 
            NULL, TRUE, FALSE, 'MX', 
            'DUMMY', 'DUMMY', 
            'DUMMY', 'EMPTY', FALSE, 
            NULL, 0, 0, 
            NULL, NULL, 20, NULL);