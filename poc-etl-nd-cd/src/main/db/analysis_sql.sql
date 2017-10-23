
Simple SQL :


-- deal_template
select * from clandescuento.deals AS deal
LEFT OUTER JOIN clandescuento.deals_extra_data dealExtraData on dealExtraData.deal_id = deal.id
LEFT OUTER JOIN clandescuento.deals template on dealExtraData.template_deal_id = template.id
where deal.type = 'TEMPLATE'
limit 100



-- deal_run
select * FROM clandescuento.deals deal
INNER JOIN clandescuento.deals_extra_data dealExtraData ON deal.id = dealExtraData.deal_id
where deal.type <> 'TEMPLATE'
limit 100



-- deal_run x options
select * FROM clandescuento.deals deal
INNER JOIN clandescuento.deals_extra_data dealExtraData ON deal.id = dealExtraData.deal_id
WHERE deal.parent_deal_id <>0
limit 100

LIKE prefix%  -- es optimo si es indexado
LIKE id_salesforce a0Y  -- a0Y son Options.



-- deal_template x options
select * FROM clandescuento.deals deal
LEFT OUTER JOIN clandescuento.deals_extra_data dealExtraData on dealExtraData.deal_id = deal.id
LEFT OUTER JOIN clandescuento.deals template on dealExtraData.template_deal_id = template.id
WHERE deal.parent_deal_id <> 0
limit 100


LIKE prefix%  -- es optimo si es indexado
LIKE id_salesforce a0Y  -- a0Y son Options.


--------------------------------------------------------------------------------------------------

                   <!-- Options -->
		           <![CDATA[
								SELECT
									deal.id as 'deal.id',
									deal.title as 'deal.title',
									deal.salesforce_id as 'deal.salesforce_id',
									deal.short_title as 'deal.short_title',
									deal.coupon_title as 'deal.coupon_title',
									deal.picture as 'deal.picture',
									deal.slug as 'deal.slug',
									deal.tipping_point as 'deal.tipping_point',
									deal.country_id as 'deal.country_id',
									deal.company_id as 'deal.company_id',
									deal.city_id as 'deal.city_id',
									deal.category_id as 'deal.category_id',
									deal.date as 'deal.date',
									deal.due_date as 'deal.due_date',
									deal.expiration_date as 'deal.expiration_date',
									deal.discount as 'deal.discount',
									deal.partner_original_price as 'deal.partner_original_price',
									deal.partner_special_price as 'deal.partner_special_price',
									deal.parent_deal_id as 'deal.parent_deal_id',
									deal.max_coupons as 'deal.max_coupons',
									deal.max_coupons_per_buy as 'deal.max_coupons_per_buy',
									deal.sold_qty as 'deal.sold_qty',
									deal.init_coupons as 'deal.init_coupons',
									deal.stock_management as 'deal.stock_management',
									deal.deal_type_id as 'deal.deal_type_id',
									deal.status as 'deal.status',
									deal.deal_type_id as 'deal.deal_type_id',
									deal.details as 'deal.details',
									deal.type as 'deal.type',
									deal.type2 as 'deal.type2',
									deal.shipping_courier as 'deal.shipping_courier',
									deal.shipping as 'deal.shipping',
									deal.highlights as 'deal.highlights',
									deal.final_price as 'deal.final_price',
									deal.value as 'deal.value',
									deal.description as 'deal.description',
									deal.additional_info as 'deal.additional_info',
									deal.commission as 'deal.commission',
									deal.nl_title as 'deal.nl_title',
									deal.mulligan as 'deal.mulligan',
									deal.mulligan_days as 'deal.mulligan_days',
									dealAddress.id as 'dealaddress.id',
									dealAddress.country_id as 'dealaddress.country_id',
									dealAddress.city_id as 'dealaddress.city_id',
									dealAddress.location_id as 'dealaddress.location_id',
									dealAddress.address as 'dealaddress.address',
									dealAddress.lat as 'dealaddress.lat',
									dealAddress.lng as 'dealaddress.lng',
									dealDescription.id as 'dealdescription.id',
									dealDescription.title as 'dealdescription.title',
									dealDescription.text as 'dealdescription.text',
									dealExtraData.id as 'dealextradata.id',
									dealExtraData.init_coupon_date as 'dealextradata.init_coupon_date',
									dealExtraData.gender_code as 'dealextradata.gender_code',
									dealExtraData.template_deal_id as 'dealextradata.template_deal_id',
									dealExtraData.sharing_stock as 'dealextradata.sharing_stock',
									dealExtraData.dealbank_status as 'dealextradata.dealbank_status',
									dealExtraData.business_unit as 'dealextradata.business_unit',
									dealExtraData.coupon_duration as 'dealextradata.coupon_duration',
									dealExtraData.payment_offline as 'dealextradata.payment_offline',
									company.name as 'company.name',
									company.description as 'company.description',
									company.website as 'company.website',
									company.logo_url as 'company.logo_url',
									image.id as 'image.id',
									image.image_key as 'image.image_key'

								 FROM clandescuento.deals AS deal
									 LEFT OUTER JOIN clandescuento.deal_descriptions dealDescription ON deal.id = dealDescription.deal_id
									 LEFT OUTER JOIN clandescuento.deals_address dealAddress ON deal.id = dealAddress.deal_id
									 LEFT OUTER JOIN clandescuento.deals_extra_data dealExtraData ON deal.id = dealExtraData.deal_id
									 LEFT OUTER JOIN clandescuento.companies company ON deal.company_id = company.id
									 LEFT OUTER JOIN clandescuento.num_migrated_images image ON dealExtraData.num_migrated_image_id = image.id

 								WHERE deal.parent_deal_id = deal.id -- parent children
 								      AND deal.type = 'TEMPLATE'

								-- ORDER BY Payment.created DESC
								-- we can see if it exists PK (payment)


								-- amount of deals !
								LIMIT 100
		           ]]>

--------------------------------------------------------------------------------------------------



-- City Deals core tables for "Deals" :

CREATE TABLE deal_run (
    dr_id integer NOT NULL,
    dr_created timestamp with time zone DEFAULT now() NOT NULL,
    dr_last_modified timestamp with time zone DEFAULT now() NOT NULL,
    dr_dtp_id integer NOT NULL,   -- deal_template
    dr_cd_id integer,    -- CityDeals
    dr_start_time timestamp with time zone NOT NULL,
    dr_end_time timestamp with time zone NOT NULL,
    dr_participant_minimum integer,
    dr_participant_maximum integer,
    dr_buy_limit_per_user integer,
    dr_feature_id text,   -- ?????
    dr_status_id smallint,   -- deal_run_status
    dr_type_id smallint DEFAULT 1 NOT NULL,  -- deal_run_type
    dr_mulligan_parent_cd_id integer,
    dr_ptc_id integer,  -- participant_cities
    dr_dm_id integer,   -- deal_merchant
    dr_deal_type_id smallint, -- deal_type
    dr_deal_priority integer DEFAULT 0 NOT NULL,
    dr_app_id smallint,    -- appdomains
    dr_salesforce_scheduling_detail_id text,  --- ?  in city_deals & deal_run_option:  -- most empty at uat
    dr_guid uuid
);


CREATE TABLE deal_run_option (
    dro_id integer DEFAULT nextval('deal_run_option_dro_id_seq'::regclass) NOT NULL,
    dro_created timestamp with time zone DEFAULT now() NOT NULL,
    dro_last_modified timestamp with time zone DEFAULT now() NOT NULL,
    dro_dr_id integer NOT NULL,   -- deal_run
    dro_dto_id integer NOT NULL,  -- deal_template_option
    dro_cd_id integer,            -- CityDeals
    dro_coupon_valid_from timestamp with time zone,
    dro_coupon_valid_until timestamp with time zone,
    dro_participant_minimum integer,
    dro_participant_maximum integer,
    dro_buy_limit_per_user integer,
    dro_dm_id integer,        -- deal_merchant
    dro_app_id smallint,      -- appdomains
    dro_salesforce_scheduling_detail_id text,    --- ?  in city_deals & deal_run_option:  -- most empty at uat
    dro_salesforce_scheduling_detail_name text,
    dro_guid uuid,
    dro_expiration_period interval
);


CREATE TABLE deal_template_option (
    dto_id integer DEFAULT nextval('deal_template_option_dto_id_seq'::regclass) NOT NULL,
    dto_created timestamp with time zone DEFAULT now() NOT NULL,
    dto_last_modified timestamp with time zone DEFAULT now() NOT NULL,
    dto_dtp_id integer,     -- deal_template
    dto_dtpc_id integer NOT NULL,   -- deal_template_purchase_control
    dto_salesforce_id text,   -- cd_deal_uuid
    dto_dm_id integer,    -- deal_merchant
    dto_vde_id smallint NOT NULL,   -- voucher_delivery_event
    dto_voucher_pool_id text NOT NULL,  -- ??   -- merchant_voucher_codes
    dto_coupon_valid_from timestamp with time zone,
    dto_coupon_valid_until timestamp with time zone,
    dto_price_original_gross bigint,
    dto_price_special_gross bigint,
    dto_price_special_tax bigint,
    dto_participant_minimum integer DEFAULT 1 NOT NULL,
    dto_participant_maximum integer,
    dto_buy_limit_per_user integer,
    dto_coupon_how_it_works smallint DEFAULT 1 NOT NULL,
    dto_voucher_send_by_sms boolean NOT NULL,
    dto_app_id smallint,  -- appdomains
    dto_voucher_expiration_reminder_blacklisted boolean,
    dto_guid uuid,
    dto_expiration_period interval
);


CREATE TABLE deal_template (
    dtp_id integer NOT NULL,
    dtp_created timestamp with time zone DEFAULT now() NOT NULL,
    dtp_last_modified timestamp with time zone DEFAULT now() NOT NULL,
    dtp_status_id smallint DEFAULT 0 NOT NULL,  -- deal_template_status
    dtp_app_id smallint NOT NULL,     -- appdomains
    dtp_dtpc_id integer,     -- deal_template_purchase_control
    dtp_salesforce_id text,  -- cd_deal_uuid
    dtp_dm_id integer,       -- deal_merchant
    dtp_voucher_pool_id text,  -- ??   -- merchant_voucher_codes
    dtp_deal_class text,
    dtp_participant_minimum integer DEFAULT 1,
    dtp_participant_maximum integer,
    dtp_buy_limit_per_user integer,
    dtp_image_large text,
    dtp_image_medium text,
    dtp_image_small text,
    dtp_image_extra_small text,
    dtp_dealbank_runtime_days smallint,
    dtp_guid uuid,
    dtp_mulligan_enabled boolean,
    dtp_is_dsc boolean DEFAULT false   -- Deal Supply Chain ?
);



CREATE TABLE city_deals (
    cd_id integer NOT NULL,
    cd_ptc_city_id integer NOT NULL,  -- participant_cities
    cd_meta_title text,
    cd_meta_description text,
    cd_meta_keywords text,
    cd_title text,
    cd_short_description text,
    cd_short_highlights text,
    cd_long_description text,
    cd_image_big text,
    cd_image_small text,
    cd_merchant_id integer NOT NULL,           -- merchant?
    cd_original_price_gross double precision,
    cd_special_price_gross double precision NOT NULL,
    cd_special_price_tax double precision NOT NULL,
    cd_participant_minimum integer NOT NULL,
    cd_participant_maximum integer,
    cd_deal_start_time timestamp without time zone,
    cd_deal_end_time timestamp without time zone,
    cd_deal_status smallint,                        -- deal_state
    cd_newsletter_subject character varying(255),
    cd_newsletter_textblock text,
    cd_participant_current integer NOT NULL,
    cd_image_newsletter text,
    cd_title_for_url_permalink character varying(128),
    cd_deal_email_type smallint DEFAULT 1 NOT NULL,      -- deal_email_type
    cd_coupon_valid_from timestamp without time zone,
    cd_coupon_valid_until timestamp without time zone,
    cd_dlg_id integer,                                 -- deal_limit_group
    cd_last_modified timestamp without time zone DEFAULT clock_timestamp() NOT NULL,
    cd_scheduled_for_newsletter boolean DEFAULT true,
    cd_customer_index_max integer DEFAULT 0 NOT NULL,
    cd_deal_type_id smallint NOT NULL,             -- deal_type
    cd_salesforce_id text,                         -- cd_deal_uuid
    cd_deal_title_coupon character varying(512),
    cd_coupon_how_it_works smallint DEFAULT 1,
    cd_appdomain_id smallint,                      -- appdomain
    cd_sidedeal_image text,
    cd_deal_priority integer DEFAULT 0 NOT NULL,
    cd_newsletter_title text,
    cd_newsletter_side_deal_title text,
    cd_multideal_type text DEFAULT 'SINGLE'::text NOT NULL,
    cd_multideal_parent integer,
    cd_voucher_send_by_sms boolean DEFAULT false NOT NULL,
    cd_voucher_delivery_event text DEFAULT 'DEAL_CLOSED'::text NOT NULL,   --  ['DEAL_CLOSED'::text, 'PAYMENT_SUCCESS'::text]
    cd_sms_prefix text,
    cd_mobile_description text,
    cd_mvc_pool_id text,                 -- merchant_voucher_codes  -- not necessary?
    cd_mulligan_enabled boolean,
    cd_mulligan_parent integer,
    cd_canonical_tag text,           -- TODO: debemos migrar los deal tags ???
    cd_salesforce_scheduling_detail_id text,  -- in city_deals & deal_run_option:  -- most empty at uat
    cd_dpc_id integer,                        -- deal_purchase_control
    cd_buy_limit_per_user integer,
    cd_salesforce_feature_id text,           -- ?
    cd_created timestamp without time zone,
    cd_blacklisted boolean,
    cd_drdrt_id smallint DEFAULT 0,       -- deal_redirect_type
    cd_redirect_url text,
    cd_expiration_period interval,
    CONSTRAINT cd_voucher_delivery_event_check CHECK ((cd_voucher_delivery_event = ANY (ARRAY['DEAL_CLOSED'::text, 'PAYMENT_SUCCESS'::text])))
);




deals.sql
DROP TABLE IF EXISTS `deals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deals` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `brand_id` int(11) DEFAULT '1',
  `status` varchar(32) NOT NULL DEFAULT 'NEW' COMMENT 'NEW, ACTIVE, SENT, CANCELLED, INVALID',
  `date` datetime NOT NULL,
  `deal_type_id` int(11) DEFAULT NULL,
  `parent_deal_id` int(11) DEFAULT '0',
  `country_id` int(11) DEFAULT '1',
  `city_id` int(11) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `type2` varchar(3) NOT NULL DEFAULT 'D1',
  `local` int(11) NOT NULL DEFAULT '0',
  `value` double(20,2) DEFAULT NULL,
  `discount` int(11) DEFAULT NULL,
  `final_price` double DEFAULT NULL,
  `reward` tinyint(4) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `short_title` varchar(255) DEFAULT NULL,
  `coupon_title` varchar(255) DEFAULT NULL,
  `nl_title` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `slug` varchar(255) DEFAULT NULL,
  `remark` text,
  `description` text,
  `due_date` datetime NOT NULL,
  `details` text,
  `company_id` int(11) DEFAULT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `contract` varchar(255) NOT NULL,
  `tipping_point` int(11) DEFAULT NULL,
  `created` datetime NOT NULL,
  `modified` datetime NOT NULL,
  `sold_qty` int(11) DEFAULT '0',
  `expiration_date` datetime NOT NULL,
  `redeem_at` text,
  `max_coupons` int(11) NOT NULL DEFAULT '0',
  `shipping` int(11) DEFAULT '0',
  `expiration_alert` tinyint(1) NOT NULL DEFAULT '1',
  `shipping_data` text,
  `shipping_weight` int(11) DEFAULT NULL,
  `shipping_long` int(11) DEFAULT NULL,
  `shipping_height` int(11) DEFAULT NULL,
  `shipping_width` int(11) DEFAULT NULL,
  `shipping_content` varchar(45) DEFAULT NULL,
  `shipping_delivery` varchar(45) DEFAULT NULL,
  `shipping_contact` varchar(45) DEFAULT NULL,
  `shipping_contact_address` varchar(45) DEFAULT NULL,
  `shipping_contact_position` varchar(45) DEFAULT NULL,
  `shipping_contact_phone` varchar(45) DEFAULT NULL,
  `shipping_contact_email` varchar(45) DEFAULT NULL,
  `shipping_courier` int(5) DEFAULT NULL,
  `shipping_partner_price` decimal(20,2) DEFAULT NULL,
  `shipping_total_price` decimal(20,2) DEFAULT NULL,
  `shipping_client_price` decimal(20,2) DEFAULT NULL,
  `commission` float NOT NULL DEFAULT '0',
  `commission_tax` float DEFAULT NULL,
  `applicable_tax` tinyint(1) DEFAULT '1',
  `seller_id` int(11) NOT NULL,
  `init_coupons` int(11) DEFAULT '0',
  `highlights` text,
  `redeem_type` varchar(10) DEFAULT 'ONLINE',
  `importance` int(11) DEFAULT '1',
  `salesforce_id` varchar(20) DEFAULT NULL,      -- contrato
  `so_salesforce_id` varchar(20) DEFAULT NULL,   -- planning record (deal mismo)
  `additional_info` tinyint(4) DEFAULT '0',
  `max_coupons_per_buy` int(11) NOT NULL DEFAULT '25',
  `settlements_fromMG` tinyint(1) DEFAULT '0',
  `partner_country` varchar(3) DEFAULT NULL,
  `partner_original_price` decimal(20,2) DEFAULT NULL,
  `partner_special_price` decimal(20,2) DEFAULT NULL,
  `flash_time` datetime NOT NULL,
  `deal_addon` tinyint(1) NOT NULL DEFAULT '0',
  `category_id` int(11) DEFAULT NULL,
  `restricted` tinyint(1) DEFAULT NULL,
  `mulligan` tinyint(1) DEFAULT '0',
  `mulligan_days` int(11) DEFAULT '4',
  `mulligan_time` int(11) NOT NULL DEFAULT '345600',
  `extend_from_id` int(11) DEFAULT NULL,
  `shipping_ended_date` datetime NOT NULL,
  `shipping_ended_address` varchar(100) NOT NULL,
  `shipping_ended_name` varchar(100) NOT NULL,
  `shipping_ended_hours` varchar(100) NOT NULL,
  `shipping_delivery_date` date NOT NULL,
  `shipping_real_delivery_date` date DEFAULT NULL,
  `shipping_product_delivery_date` date NOT NULL,
  `shipping_real_product_delivery_date` date DEFAULT NULL,
  `shipping_delivery_zone_id` int(11) DEFAULT NULL,
  `instant_sending` tinyint(1) NOT NULL DEFAULT '0',
  `sending_coupons` tinyint(1) DEFAULT '1',
  `sync_additional_info` tinyint(1) DEFAULT '1',
  `stock_management` tinyint(1) DEFAULT '0',
  `mg_partner_id` int(11) DEFAULT '0',
  `permalink` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),


CREATE TABLE deal_purchase_control (
    dpc_id integer NOT NULL,
    dpc_created timestamp without time zone DEFAULT now() NOT NULL,
    dpc_last_modified timestamp without time zone DEFAULT now() NOT NULL,
    dpc_dtpc_id integer NOT NULL,   dtpc_id integer,     -- deal_template_purchase_control
    dpc_participant_maximum integer,
    dpc_buy_limit_per_user integer,
    dpc_participant_current integer,
    dpc_app_id smallint,   -- appdomain
    dpc_voucher_codes_per_unit smallint
);



CREATE TABLE `deal_tags` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `deal_id` int(11) NOT NULL,
  `tag_id` int(11) NOT NULL,  -- table "tag" --> enum
  `active` int(11) NOT NULL,
  `created` datetime NOT NULL,
  `modified` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `deal_tag` (`tag_id`,`deal_id`),
  KEY `deal_id` (`deal_id`)
)




CREATE TABLE participant_cities (
    ptc_id integer NOT NULL,
    ptc_city_name text NOT NULL,
    ptc_appdomain smallint,
    ptc_status smallint NOT NULL,  -- 0..99
    ptc_city_url_name text,
    ptc_latitude double precision,
    ptc_longitude double precision,
    ptc_menu_sort_order integer,
    ptc_twitter_account text,
    ptc_facebook_group character varying(50),
    ptc_last_modified timestamp without time zone DEFAULT clock_timestamp() NOT NULL,
    ptc_parent_city integer,
    ptc_top_city boolean DEFAULT false,
    ptc_locale character varying(16) NOT NULL,
    ptc_city_group_id integer NOT NULL,
    ptc_timezone text,
    ptc_is_nationwide_mapped boolean DEFAULT false NOT NULL,
    ptc_meta_title text,
    ptc_meta_description text,
    ptc_meta_keywords text,
    ptc_seo_footer text,
    ptc_miss_meta_title text,
    ptc_miss_meta_description text,
    ptc_miss_meta_keywords text,
    ptc_miss_seo_footer text,
    ptc_devweb_now_enabled boolean DEFAULT false NOT NULL,
    ptc_created timestamp without time zone,
    ptc_is_deal_bank boolean,
    ptc_is_smartdeals_enabled boolean DEFAULT false NOT NULL,
    ptc_external_city_deal_url text,
    ptc_external_city_deal_url_enabled boolean DEFAULT false NOT NULL,
    ptc_control_group_filter_id integer,
    ptc_guid uuid
);
COMMENT ON COLUMN participant_cities.ptc_status IS '0 = active
1 = disabled
2 = only historical data';
ptc_status = 99			-- DELETED



