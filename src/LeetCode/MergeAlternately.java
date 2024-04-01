class MergeAlternately {
    public String mergeTwoString(String word1, String word2) {
       return  mergre(word1,word2, "");
    }

    public String mergre(String w1, String w2, String responce){
        if(w1.length() == 0 || w2.length() == 0){
            
             responce += w1 + w2;
             return responce;
        }
        
        return mergre(w1.substring(1),w2.substring(1),responce += Character.toString(w1.charAt(0)) +  Character.toString(w2.charAt(0)) );
    }
}