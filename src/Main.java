public class Main {
    public static void main(String[] args) throws Exception {

        //megre String Alternativly
        MergeStringAlternatively mergeStringAlternatively = new MergeStringAlternatively();
        String mergeStringAlternativelyResult =  mergeStringAlternatively.MergreTwoString("abcd", "efgh");
        System.out.println("1. mergeStringAlternativelyResult - "+ mergeStringAlternativelyResult);  //output -  aebfcgdh


        //reverse word without taking space
        ReverseWordString reverseWordString = new ReverseWordString();
        String reverseWordStringResult = reverseWordString.reverseWords("Hai Hellow Good Moring"); 
        System.out.println("2. reverseWordStringResult - " + reverseWordStringResult); //output - Moring Good Hellow Hai
    }
}
