package lab0;
public class TV {
    public int channel;
    public int brightness;
    public float gamma;
    public String name;

    public TV(){
    channel = 1;
    brightness = 50;
    gamma = 2.0f;
    name = "defaut";   
    }
    public TV( int c, int b, float g , String n){
        channel = c;
        brightness = b;
        gamma = g;
        name = n;
    }
    public TV(String n){
        name = n;
        channel = 1;
        brightness = 50;
        gamma = 2.0f;
    }
}
