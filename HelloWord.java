 class addsum{
    int add2num(int i, int j){
        return i+j;
    }
}








public class HelloWord {
    public static void main(String args[]){
       
        addsum obj1 = new addsum();
       int s=  obj1.add2num(10, 20);
       System.out.println("your Anseris :"+ s);

    }

    
}
