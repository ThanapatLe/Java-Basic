public class Switch {
    private boolean On;

    public Switch(Boolean State){
        On=State;
    }

    public boolean isOn(){
        return (On ? true : false);
    }

    public void turnOn(){
        On = true;
    }

    public void turnOff(){
        On = false;
    }

    public void toggle(){
        if(On){
            On=false;
        }
        else On=true;
    }

    @Override
    public String toString() {
        return "Switch: " +(On ? "On" : "Off") ;
    }


}
