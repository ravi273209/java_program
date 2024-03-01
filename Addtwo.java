

/**
 * InnerAddtwo
 
 int addtwonumber()*/
 class InnerAddtwo {
    /**
     * @return
     */
    int addtwonumber(int a, int b ){
       return a +b; 

    }
    

    
}


public class Addtwo {
    /**
     * @param args
     */
    public static void main(String[] args) {

        InnerAddtwo obj2= new InnerAddtwo();
        int p= obj2.addtwonumber(10, 20);
        System.out.println(p);

        
    }
}
