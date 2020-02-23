package day41;

public class TV {

    String name;
    boolean isOn;
    int currentChannel;
/*
 behaviours :
   	turnOn
   	turnOff
   	getcurrentChannel
   	setcurrentChannel (newChannelNumber)
   	moveForward
	moveBackward
 */

public void turnOn(){


    if(isOn==false) {
        System.out.println("Turning on TV");
        isOn = true;  // than we want to turn it on
    }
}

public void turnOff() {


    if (isOn == true) {
        System.out.println("Turning off TV");
        isOn = false;  // than we want to turning it off
    }


}
public int getCurrentChannel() {

        return currentChannel;


    }

    public void setCurrentChannel(int newChannel){

    // if my chanel is out of range i want to exit from the method
        if(newChannel<0 || newChannel>50){
            System.out.println("Invalid Channel, Getting out");
            return; // can be used to exit from the method
        }
     if(isOn==true) {
         currentChannel = newChannel;

     }else{
         System.out.println("Turn on the TV first");
     }
    }


    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}

