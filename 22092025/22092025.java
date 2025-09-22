class Point2 {
    private double xCoordinate;
    private double yCoordinate;

    public Point2(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public double calculateDistance(){
        double distance = Math.sqrt((getxCoordinate() - 0) * (getxCoordinate() - 0) + (getyCoordinate() - 0) * (getyCoordinate() - 0));
        return Math.round(distance * 100)/100.0;
    }

    public double calculateDistance(Point2 point){
        double distance = Math.sqrt((point.xCoordinate - xCoordinate) * (point.xCoordinate - xCoordinate) +
                        (point.yCoordinate - yCoordinate) * (point.yCoordinate - yCoordinate));
        return Math.round(distance * 100)/100.0;

    }
}

public class Main {
    public static void main(String[] args) {
        Point2 point1 = new Point2(3.5,1.5);
        Point2 point2 = new Point2(6,4);

        System.out.println("Distance from point1 from origin is: " + point1.calculateDistance());
        System.out.println("Distance from point2 from origin is: " + point2.calculateDistance());
        System.out.println("Distance from point2 from point1 is:  " + point1.calculateDistance(point2));
    }
}