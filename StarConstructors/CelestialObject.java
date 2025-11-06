public class CelestialObject {
    public double x ;
    public double y;
    public double z;
    public String name;

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
}