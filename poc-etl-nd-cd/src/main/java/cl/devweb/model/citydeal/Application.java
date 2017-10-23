package cl.devweb.model.citydeal;


public enum Application {

	de_citydeal_web_frontend (1),
	de_citydeal_api_citydeal_api_webapp (2),
	de_citydeal_web_admin (3),
	hash_0fae02b08aa232941fb2e7f62fa5499acceed0ee (4),
	GROUPON_DESKTOP_WEB (5);

	/* Prod:

	VALUES (1, 'de.citydeal.web:frontend', '2011-12-13 18:16:06.923227+01', '2012-08-08 18:18:52.218107+02', 'V8MJ8{YuXZ/ujq:');
	VALUES (2, 'de.citydeal.api:citydeal-api-webapp', '2011-12-13 18:16:06.923227+01', '2012-08-08 18:18:52.218107+02', ']#T$Ej;V533rX7');
	VALUES (3, 'de.citydeal.web:admin', '2011-12-13 18:22:29.518099+01', '2012-08-08 18:18:52.218107+02', 'z7dh[][w[jXYQ)6');
	VALUES (4, '0fae02b08aa232941fb2e7f62fa5499acceed0ee', '2014-02-19 11:29:16.472621+01', '2014-04-22 16:03:18.531689+02', '77w%PP7#*,~nr1>');
	VALUES (5, 'GROUPON_DESKTOP_WEB', '2014-08-29 18:52:33.060862+02', '2014-08-29 18:52:33.060862+02', '[:M#:<!||ho]ePnk');
	 */


    private final int value;

    private Application(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}
