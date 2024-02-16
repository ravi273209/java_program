

class oddeven{
    void check(int a){
        if(a % 2 == 0){
           System.out.println("Even");
        }
        else{
           System.out.println("Odd");
        }
    }
}

public class condition {
    public static void main(String args[]){
         oddeven myobject = new oddeven();
         myobject.check(14);


    }
}
