 class addtwonumber{
    void addition(int a, int b){
        System.out.println(a+b);
    }
    int subtact(int x, int y){
        return x - y;
    }
}

public class hello {

    public static void main(String args[]){
        addtwonumber myobject = new addtwonumber();
        myobject.addition(10, 11);

        int g = myobject.subtact(50, 30);
        System.out.println(g);
    }
}

