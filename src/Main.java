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

        //triple nummber comming like sorting order thate's called triplet
        Triplet triplet = new Triplet();
        int arr[] = {6, 7, 0, 1, 2, 3};
        boolean tripleResult = triplet.increasingTriplet(arr);
        System.out.println("3. tripleResult - " + tripleResult); //output - true


    }
}
