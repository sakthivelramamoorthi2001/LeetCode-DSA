class ReverseWordString {
    public String reverseWords(String s) {
        //trim the word 
        s = s.trim();
        
        //without space single word
        if(!s.contains(" ")){
            return s;
        }

        //with space mult word
        String temp[] = null;
        String tempStr = "";
        temp = s.split(" ");

        //rever the array to convert string
        for(int i = temp.length-1;i>=0; i--){
            if(temp[i].trim() == ""){
                tempStr += "";
            }
            else if(i == 0){
            tempStr +=  temp[i].trim();
            } else {
            tempStr +=  temp[i].trim()  + " ";
            }
            
        }

        return tempStr;
    }
}