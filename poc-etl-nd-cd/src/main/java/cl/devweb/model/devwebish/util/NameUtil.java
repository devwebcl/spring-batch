package cl.devweb.model.devwebish.util;


import org.apache.commons.lang3.StringUtils;

public class NameUtil {

    public static String getFirstName(String name) {
        String firstName = null;
        if (name != null) {
            String[] pieces = name.split(StringUtils.SPACE);
            switch (pieces.length) {
                case 2:
                    firstName = pieces[0];
                    break;
                case 3:
                    firstName = pieces[0].concat(StringUtils.SPACE).concat(pieces[1]);
                    break;
                case 4:
                    firstName = pieces[0].concat(StringUtils.SPACE).concat(pieces[1]);
                    break;
                case 5:
                    firstName = pieces[0].concat(StringUtils.SPACE).concat(pieces[1]).concat(StringUtils.SPACE).concat(pieces[2]);
                    break;
                default:
                    firstName = name;
                    break;
            }
        }
        return firstName;
    }

    public static String getLastName(String name) {
        String lastName = null;
        if (name != null) {
            String[] pieces = name.split(StringUtils.SPACE);
            switch (pieces.length) {
                case 2:
                    lastName = pieces[1];
                    break;
                case 3:
                    lastName = pieces[2];
                    break;
                case 4:
                    lastName = pieces[2].concat(StringUtils.SPACE).concat(pieces[3]);
                    break;
                case 5:
                    lastName = pieces[3].concat(StringUtils.SPACE).concat(pieces[4]);
                    break;
                default:
                    lastName = StringUtils.EMPTY;
                    break;
            }
        }


        return lastName;
    }

}
