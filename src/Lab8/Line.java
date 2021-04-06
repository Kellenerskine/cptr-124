package Lab8;

/**
 * Represents a geometric line object. All non-vertical lines have a slope and
 * <em>y</em>-axis intercept. All vertical lines have an infinite slope and
 * <em>x</em>-axis intercept. {@code Line} objects are immutable.
 */
public class Line {

    /*
     * ####################################################### 
     * IMPORTANT NOTE!
     * Add your instance variables here to maintain the the 
     * state of a line object. 
     * Line objects are immutable, so your instance variables 
     * should be declared private to render them inaccessible 
     * to clients.
     * #######################################################
     */

    private double m;
    private double b = Double.POSITIVE_INFINITY;

    //private Point p1;     //do i need these?
    //private Point p2;

    /**
     * Test to see if two double-precision floating-point values are "equal." The
     * values are considered equal when their difference is small.
     * 
     * @param a         one of the values
     * @param b         the other value
     * @param tolerance the small difference
     * @return True, if the two values are close enough to be considered equal;
     *         otherwise, false
     */
    private static boolean equals(double a, double b, double tolerance) {
        return a == b || Math.abs(a - b) < tolerance;
    }

    /**
     * Makes a line object with a given slope and intercept
     * 
     * @param m the slope of the new line {@code Double.POSITIVE_INFINITY} for a
     *          vertical line
     * @param b the y-axis intercept for a non-vertical line; the
     *          x-axis intercept for a vertical line
     */
    public Line(double m, double b) {
        this.m = m;
        this.b = b;
    }

    /**
     * Makes a line object that passes throught the given point objects.
     * 
     * @param p1 one of the points on the line
     * @param p2 the other point on the line
     * @throws IllegalArgumentException if the two points are the same
     * @see Point
     */
    public Line(Point p1, Point p2) throws IllegalArgumentException {
        //what kind of line is this?
        if ((p1.x == p2.x) && (p1.y == p2.y)){
            throw new IllegalArgumentException();
        }else if(p1.x == p2.x){
            this.m = Double.POSITIVE_INFINITY;
            this.b = (double)p1.x;
        }else{
            this.m = ((p2.y - p1.y) / (p2.x - p1.x));
            double b1 =  p1.y - (this.m * p1.x);
            double b2 =  p2.y - (this.m * p2.x);
        
            if (equals(b1,b2,0.0001)){
                this.b = b1;
            }
        }
    }


    /**
     * Returns the slope of the line
     * 
     * @return the slope of the line, {@code Double.POSITIVE_INFINITY} if the line
     *         is vertical
     */
    public double slope() {
        return this.m;
    }

    /**
     * Returns the line's intercept:
     * <ul>
     * <li><em>y</em>-axis intercept if the line is non-vertical
     * <li><em>x</em>-axis intercept if the line is vertical
     * </ul>
     * 
     * @return the intercept of the line, <em>x</em>-axis intercept if the line is
     *         vertical
     */
    public double intercept() {
        return this.b;
    }

    /**
     * Computes the point of intersection between this line and another line object.
     * 
     * @param other the other line object
     * @return the point of intersectionm between this line ans the other line.
     *         Returns {@code null} if the lines do not intersect
     * @see Point
     */
    public Point intersection(Line other) {
        if(equals(this.m,other.m,0.0001)){ //to be sure they are not the same line
            return null;
        }
        //if neither is vert
        double x = 0;
        double y = 0;
        if ((this.m != Double.POSITIVE_INFINITY)  && (other.m != Double.POSITIVE_INFINITY)) {
            x = ((other.b - this.b) / (this.m - other.m));
            y = ((this.m * x) + (this.b));
        }
//if one line is vert
        if (this.m == Double.POSITIVE_INFINITY) {
            x = this.b;
            y = ((other.m * x) + (other.b));
        } else if (other.m == Double.POSITIVE_INFINITY) {
            x = other.b;
            y = this.m * x + this.b;
        }
        return new Point(x, y);
    }

    /**
     * Provides a human-readable string representation of the line; for example, y =
     * mx + b form for non-vertical line and x = b for a vertical line.
     */
    @Override
    public String toString() {

        String yeq = "y = ";
		String slope = "";
		String inter = "";
		slope = String.format("%.2f", m) + String.format("x ");
		inter = String.format("%.2f", b);
		if (m == Double.POSITIVE_INFINITY){return ("x = " + String.format("%.2f", b));}
		if (equals(m, 0.0, 0.0001)){return ("y = " + String.format("%.2f", b));}
		if (equals(m, 1.00, 0.0001)){
			slope = String.format("x ");
		}else if(equals(m, -1.00, 0.0001)){
			slope = String.format("-x ");
		}
		if (b > 0){
			inter = String.format("+ " + "%.2f", Math.abs(b));
		}else if (b < 0){
			inter = String.format("- " + "%.2f", Math.abs(b));
		}else {
			inter = String.format(" ");
		}
		String finProd = (yeq + slope + inter);
		return finProd;

       /* String posNeg = "";

        if(this.b >= 0){
            posNeg = "+";
        }else{
            posNeg = "-";
        }*/

        /*Double slopef = this.m;
        Double intercept = this.b;
        return "y = " + slope + "x +" + " " + intercept;*/
    }
}