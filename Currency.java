package chapter2;

/**
 * Created by Elev1 on 2016-05-30.
 */
public enum Currency {
    DOLLAR("$","USA"),
    POUND("£","UK"),
    EURO("€","France,Germany"),
    KRONA("SEK","Sweden");

    private String symbol;
    private String country;
    private Currency(String symbol,String country) {
        this.symbol = symbol;
        this.country = country;
    }


    public static String getCountryFromSymbol(String symbols){
        String country = "";
        for (Currency s : values() ) {
            if (s.symbol.equals(symbols))
                country = s.country;
        }
        return country;
    }
    public static void main(String[] args) {

        System.out.println(Currency.DOLLAR.country);
        System.out.println(Currency.DOLLAR.symbol);

        System.out.println(Currency.getCountryFromSymbol("SEK"));
       // Currency.
    }

}
