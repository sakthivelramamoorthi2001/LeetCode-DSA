public class Main {
    public static void main(String[] args) throws Exception {

        //megre String Alternativly
        MergeStringAlternatively mergeStringAlternatively = new MergeStringAlternatively();
        String mergeStringAlternativelyResult =  mergeStringAlternatively.MergreTwoString("abcd", "efgh");
        System.out.println(mergeStringAlternativelyResult);  //output   aebfcgdh
    }
}
