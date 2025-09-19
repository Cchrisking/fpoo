public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(5, 7);
        Point p3 = new Point(2, 8, "jps");

        System.out.println("x de p1="+p1.x+" y de p1="+p1.y+" name de p1="+p1.name);
        System.out.println("x de p2="+p1.x+" y de p2="+p1.y+" name de p2="+p1.name);
        System.out.println("x de p3="+p1.x+" y de p3="+p1.y+" name de p3="+p1.name);

        p1.changeName("java");
        System.out.println("x de p1="+p1.x+" y de p1="+p1.y+" name de p1="+p1.name);

        p2 = p3.getReferenceToMe();
        System.out.println("x de p2="+p1.x+" y de p2="+p1.y+" name de p2="+p1.name);
    }
}