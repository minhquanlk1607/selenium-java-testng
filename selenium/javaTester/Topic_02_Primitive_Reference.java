package javaTester;

public class Topic_02_Primitive_Reference {

    int x;

    public static void main(String[] args) {
        int x = 10;
        int y = x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = 20;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("*****************************************************************");

        //class
        //Instance 1
        Topic_02_Primitive_Reference c = new Topic_02_Primitive_Reference();
        c.x = 30;
        System.out.println("c = "+c.x);
        //Instance 2
        Topic_02_Primitive_Reference d = c;
        System.out.println("d = "+d.x);
        System.out.println("*****************************************************************");
        //Change value of x
        System.out.println("Change value of x from " + c.x + " " + "to 40");
        c.x = 40;
        System.out.println("c = "+c.x);
        System.out.println("d = "+d.x);
        System.out.println("*****************************************************************");
    }
}
