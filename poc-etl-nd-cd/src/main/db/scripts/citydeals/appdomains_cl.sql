-- This must be executed in CityDeals schema :

INSERT INTO std_data.appdomains (app_id, app_info, app_url_domain, app_currency, app_payment_provider, app_reward_units, app_reward_delay_interval,
app_reward_expire_interval, app_reward_pending_interval, app_last_modified, app_bonus_payment_name, app_incentive_reward_amount, app_double_optin, app_default_locale,
app_created, app_ihq_optin_date, app_locales, app_order_value_currency_symbol, app_order_street_street_number, app_order_zip_city, app_landing_page_enabled,
app_number_of_top_cities, app_media_plex_id, app_zone, app_tax_rate, app_delay_capturing, app_nsoq_create_enabled)
 VALUES
 (	46,								-- app_id                      -- last ID from UAT
    'CL',							-- app_info
    'http://www.devweb.cl',		-- app_url_domain
    'CLP',							-- app_currency
    '{141}',						-- app_payment_provider
    600,							-- app_reward_units            -- these values do not exist in devwebish
    '7 days',						-- app_reward_delay_interval   -- these values do not exist in devwebish
    '1 year',						-- app_reward_expire_interval  -- these values do not exist in devwebish
    '72:00:00',						-- app_reward_pending_interval -- these values do not exist in devwebish
    '2016-08-01 21:33:21.26769',	-- app_last_modified
    'crédito devweb',				-- app_bonus_payment_name
    1000,							-- app_incentive_reward_amount
    true,							-- app_double_optin
    'es_CL',						-- app_default_locale
    '2012-09-26 17:46:26.930279',	-- app_created
    NULL,							-- app_ihq_optin_date
    '{es_CL}',						-- app_locales
    FALSE,							-- app_order_value_currency_symbol
    true,							-- app_order_street_street_number
    true,							-- app_order_zip_city
    true,							-- app_landing_page_enabled
    40,								-- app_number_of_top_cities  -- ?
    NULL,							-- app_media_plex_id
    'EUROPE',						-- app_zone                  -- like ARG
    '{19}',							-- app_tax_rate
    false,							-- app_delay_capturing       -- ?
    true							-- app_nsoq_create_enabled   -- ?
);



-- Rollback:

DELETE FROM std_data.appdomains  WHERE app_id = 46;



