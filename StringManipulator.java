public class StringManipulator {
    /*given two strings. 
    if strings have white space, eliminate them.
    once white space characters have been eliminated, concat the strings
    with no spaces
    for char i = 0, i < 
    */
    public String trimAndConcat(String string1, String string2) {
        String newString = string1.trim() + string2.trim();
        return newString;
    }
    public Integer getIndexOrNull(String string, char character) {
        int character_position = string.indexOf(character);
        if(character_position == -1) {
            return null;
        }else{
            return character_position;
        }
    }   
    public Integer getIndexOrNull2(String stringOne, String stringTwo) {
        int character_position = stringOne.indexOf(stringTwo);
        if(character_position == -1) {
            return null;
        }else{
            return character_position;
        }
    }
    public String concatSubstring(String string1, int int1, int int2, String string2) {
        String newString = string1.substring(int1,int2) + string2;
        return newString;
    }
}