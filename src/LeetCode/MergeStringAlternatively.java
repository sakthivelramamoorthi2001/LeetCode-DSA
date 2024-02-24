class MergeStringAlternatively {

    public static String s = "";

    public String MergreTwoString(String one, String two){
        int i = 0;
        String tempStr = "";

        while(i != (one.length()  + two.length())) {
            if(i <= one.length() - 1){
                tempStr += one.charAt(i);
            }
            if(i <= two.length() - 1) {
                  tempStr += two.charAt(i);
            }
            i++;
        }

        return tempStr;
    }


    public String mergeAlternately(String word1, String word2) {
        return MergreTwoString(word1, word2);
    }
}