public class Figure {

    public static double len_circle(double radius){
        double ret = 0;
        if (radius>=0)
            ret = 2*3.1415*radius;
        return ret;
    }
    public static double square_circle(double radius){
        return 3.1415*radius*radius;
    }

    public static double perimeter_rectangle (double len, double wid){
        return (2*len+2*wid);
    }
    public static double volume_parallelepiped(double x, double y, double z){
        return x*y*z;

    }
    public static void main(String[] args) {
        System.out.println(volume_parallelepiped(3, 4, 5));

        System.out.println(len_circle(3));
        System.out.println(square_circle(1));
        System.out.println(perimeter_rectangle(3,5));
    }
}
