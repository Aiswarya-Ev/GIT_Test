import java.util.*;
class Area
{
    int s;
    void area(int c)
    {
        s=c*c;
         System.out.println("Area of square:"+s);    }
    void area(int b,int h)
    {
        s=b*h;
        System.out.println("Area of rectangle:"+s);
    }
    void area(int b,int h,int j)
    {
        s=b*h*j;
        System.out.println("Area of cuboid:"+s);
    }
}
class shape
{
    public static void main(String args[])
    {
       int b;
       int h;
       int j;
       Scanner s=new Scanner(System.in);
       Area a=new Area();
       System.out.println("enter first size");
        b=s.nextInt();
        System.out.println("enter second size");
        h=s.nextInt();
        System.out.println("enter thrid size");
        j=s.nextInt();
        a.area(b);
        a.area(b,h);
        a.area(b,h,j);
    }
}
