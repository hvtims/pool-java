
public class CelestialObject {

    public double x, y, z;
    public String name;
    public static double KM_IN_ONE_AU = 150000000;

    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public void setX(double a) {
        this.x = a;
    }

    public void setY(double a) {
        this.y = a;
    }

    public void setZ(double a) {
        this.z = a;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String a) {
        this.name = a;
    }

    public static double getDistanceBetween(CelestialObject a, CelestialObject b) {
        double xx, yy, zz;
        xx = b.x - a.x;
        yy = b.y - a.y;
        zz = b.z - a.z;
        xx *= xx;
        yy *= yy;
        zz *= zz;
        double res = xx + yy + zz;
        return Math.sqrt(res);
    }

    public static double getDistanceBetweenInKm(CelestialObject a, CelestialObject b) {
        return getDistanceBetween(a, b) * CelestialObject.KM_IN_ONE_AU;
    }

    public String toString() {
        return this.name + " is positioned at (" + String.format("%.3f, %.3f, %.3f)", this.x, this.y, this.z);
    }

    public Boolean equals(CelestialObject object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        return (this.x == object.x && this.y == object.y && this.z == object.z && this.name.equals(object.name));
    }

    public int hashCode() {
        return java.util.Objects.hash(x, y, z, name);
    }
}