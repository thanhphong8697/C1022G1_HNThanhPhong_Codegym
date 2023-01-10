package CaseStudy.utils;

public class RegexCode {
    public final String ROOM_CODE_REGEX = "^SVRO-\\d{4}$";
    public final String VILLA_CODE_REGEX = "^SVVL-\\d{4}$";
    public final String SERVICE_NAME_REGEX = "^[A-Z][a-z]*+(\\s[a-z]+)*$";
    public final String USABLE_AREA_REGEX = "^0*([1-9]\\d{2,}|[3-9]\\d|[1-9]\\d{2,}[.]\\d+|[3-9]\\d[.]\\d+)$";
    public final String POOL_AREA_REGEX = "^0*([1-9]\\d{2,}|[3-9]\\d|[1-9]\\d{2,}[.]\\d+|[3-9]\\d[.]\\d+)$";
    public final String RENTAL_COSTS_REGEX = "^0*\\d+.*\\d+$";
    public final String MAXIMUM_NUMBER_OF_PEOPLE = "^0*([1-9]|1[0-9])$";
    public final String FLOOR_NUMBER_REGEX = "^0*[1-9]\\d*$";
    public final String RENTAL_TYPE_REGEX = "^[A-Z][a-z]*+(\\s[a-z]+)*$";
    public final String ROOM_STANDARD_REGEX = "^[A-Z][a-z]*+(\\s[a-z]+)*$";

    public RegexCode() {
    }

    public String getROOM_CODE_REGEX() {
        return ROOM_CODE_REGEX;
    }

    public String getVILLA_CODE_REGEX() {
        return VILLA_CODE_REGEX;
    }

    public String getSERVICE_NAME_REGEX() {
        return SERVICE_NAME_REGEX;
    }

    public String getUSABLE_AREA_REGEX() {
        return USABLE_AREA_REGEX;
    }

    public String getPOOL_AREA_REGEX() {
        return POOL_AREA_REGEX;
    }

    public String getRENTAL_COSTS_REGEX() {
        return RENTAL_COSTS_REGEX;
    }

    public String getMAXIMUM_NUMBER_OF_PEOPLE() {
        return MAXIMUM_NUMBER_OF_PEOPLE;
    }

    public String getFLOOR_NUMBER_REGEX() {
        return FLOOR_NUMBER_REGEX;
    }

    public String getRENTAL_TYPE_REGEX() {
        return RENTAL_TYPE_REGEX;
    }

    public String getROOM_STANDARD_REGEX() {
        return ROOM_STANDARD_REGEX;
    }
}
