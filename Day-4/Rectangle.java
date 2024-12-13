public class Rectangle{
    int length,breadth;
    int area(int l,int b){
        length=l;
        breadth=b;
        return length*breadth;

    }
    int perimeter(int l, int b){
        length=l;
        breadth=b;
        int p=2*(length+breadth);
        return p;

    }
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        int area=r.area(20,30);
        System.out.println("Area="+area);
        System.out.println("Perimeter="+r.perimeter(20,30));
    }
        
}

