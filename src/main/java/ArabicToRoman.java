/**
 * Created by Mladjan on 26.3.2014.
 */
public class ArabicToRoman {

    public String convert(int arabic) {
        String roman = "";
        Integer[] aarabicNumber = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumber = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i = 0; i < aarabicNumber.length ; i++) {
            while(arabic >= aarabicNumber[i]) {
                roman += romanNumber[i];
                arabic -= aarabicNumber[i];
            }
        }
        return roman;
    }
}
