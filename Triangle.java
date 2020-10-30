public class Triangle {

  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    x1 = Point.getX(a);
    x2 = Point.getX(b);
    x3 = Point.getX(c);
    y1 = Point.getY(a);
    y2 = Point.getY(b);
    y3 = Point.getY(c);
  }

  public Triangle(double x1, double y1,double x2,
                  double y2,double x3, double y3) {
    v1 = Point.Point(x1, y1);
    v2 = Point.Point(x2, y2);
    v3 = Point.Point(x3, y3);
  }

  public double getPerimeter() {
    double perimeter = Point.distanceTo(v1)
                     + Point.distanceTo(v2)
                     + Point.distanceTo(v3);
    return perimeter;
  }

  public double getArea() {
    double p = getPerimeter();
    double A = Math.sqrt(p*(p-Point.distanceTo(v1))
                          *(p-Point.distanceTo(v2))
                          *(p-Point.distanceTo(v3)));
    return A;
  }

  public String classify() {
    //Return the "equilateral" "isosceles" or "scalene" Round distances to the nearest tenthousandths for your classifications.
  }

  public String toString() {
    //The format should be "v1(23.0, 4.0) v2(-2.3, 5.001) v3(5.0, 0.52)"
  }


}
