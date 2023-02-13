package data;

public class Coordinates {
    private final double x; //Значение поля должно быть больше -892
    private final Float y; //Поле не может быть null

    public Coordinates(double x, Float y){
        if (x > -892 && y != null) {
            this.x = x;
            this.y = y;
        } else
            throw new IllegalArgumentException("Wrong coordinates: x > -892 && y != null");
    }

    public Coordinates(String x, String y) throws IllegalArgumentException  {
        this(Double.parseDouble(x),Float.parseFloat(y));
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public Float getY() {
        return y;
    }
}
