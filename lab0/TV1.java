package lab0;

public class TV1 {
    public static void main(String[] args) {
        TV t1 = new TV(1,50,2.0f,"default");
        System.out.println("Channel : " + t1.channel + " | " + "brightness : " + t1.brightness + " | " + "gamma : " + t1.gamma + " | " + "Name : " + t1.name + " | ");
        TV t2 = new TV(1,50,2.0f,"default");
        System.out.println("Channel : " + t2.channel + " | " + "brightness : " + t2.brightness + " | " + "gamma : " + t2.gamma + " | " + "Name : " + t2.name + " | ");
        TV t3 = new TV("Default");
        System.out.println("Channel : " + t3.channel + " | " + "brightness : " + t3.brightness + " | " + "gamma : " + t3.gamma + " | " + "Name : " + t3.name + " | ");
    }
}
