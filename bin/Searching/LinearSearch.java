package DSA.bin.Searching;

public class LinearSearch<T> {

    public LinearSearch(){
        System.out.println("ddd");
    }

    public void s(int s, String ss){

    }

    protected T checkTheNumber(T[] s, T target){

        T responceData = null;

        for (int i = 0; i < s.length ; i++) {
            if(s[i] == target){
                responceData = target;
                break;
            }
        }

        return responceData;
    }

}
