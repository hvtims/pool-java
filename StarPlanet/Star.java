
public class Star extends CelestialObject {

    private double magnitude;

    public double getMagnitude() {
        return this.magnitude;
    }

    public void setMagnitude(double test) {
        this.magnitude = test;
    }

    public Star() {
        this.magnitude = 0.0;
    }

    public Star(String a, double b, double c, double d, double e) {
        super(a, b, c, d);
        this.magnitude = e;
    }

    public String toString() {
        return this.name + " shines at the " + String.format("%.3f magnitude", this.magnitude);
    }

    public Boolean equals(Star object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        return (this.x == object.x && this.y == object.y && this.z == object.z && this.name.equals(object.name) && this.magnitude == object.magnitude);
    }

    public int hashCode() {
        return java.util.Objects.hash(name, x, y, z, magnitude);
    }
}