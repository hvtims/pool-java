import java.util.Objects;
public class CelestialObject {
    public double x ;
    public double y;
    public double z;
    public String name;
    public static final double KM_IN_ONE_AU = 150000000;
    public void setX(double xx){
        this.x = xx ;
    }
    public void setY(double yy){
        this.y = yy;
    }
    public void setZ(double zz){
        this.z = zz;
    }
    public void setName(String namee){
        this.name = namee;
    }
    public String getName(){
        return this.name;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getZ(){
        return this.z;
    }
    public CelestialObject(){
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
    }
    public  CelestialObject(String namee ,double xx, double yy, double zz){
        this.name = namee ;
        this.x = xx ;
        this.y = yy;
        this.z = zz; 
    }

    public static double getDistanceBetween(CelestialObject xx , CelestialObject yy){
            return Math.sqrt(((xx.x - yy.x)* (xx.x - yy.x) + (xx.y - yy.y)* (xx.y - yy.y) + (xx.z - yy.z)* (xx.z - yy.z)))  ; 
    }
    public static   double getDistanceBetweenInKm(CelestialObject xx , CelestialObject yy){
        return Math.sqrt(((xx.x - yy.x)* (xx.x - yy.x) + (xx.y - yy.y)* (xx.y - yy.y) + (xx.z - yy.z)* (xx.z - yy.z))) * KM_IN_ONE_AU; 
    }
    public  String toString(){
        return String.format("%s is positioned at (%.3f , %.3f , %.3f)" , this.name , this.x , this.y, this.z);
    }
    public boolean equals(CelestialObject ob){
        boolean xxx = false;
        boolean zzz = false;
        boolean yyy = false ;
        boolean namee = false;
        if (ob.x == this.x){
            xxx = true;
        }
         if (ob.z == this.z){
            zzz = true;
        }
        if (ob.y == this.y){
            yyy = true;
        }
        if (ob.name.equals(this.name)){
            namee = true;
        }
        if (xxx && yyy && zzz && namee){
            return true;
        }
            return false;
    }
    public int hashCode() {
        return Objects.hash(x, y, z, name);
    }
}