
package AirConditioner;

public class AirConditioner {
    private final int MIN_TEMPERATURE = 20;
    private final int MAX_TEMPERATURE = 30;
    private FanSpeed fanSpeed = FanSpeed.LOW;
    private boolean airOn;
    private boolean fanOn;
    private int temp ;
    
    public AirConditioner(){
        
    }
    public AirConditioner(int targetTemp,FanSpeed fanSpeed){
        this.temp = targetTemp;
        this.fanSpeed = fanSpeed;
    }
    public boolean isAirOn(){
       return airOn;
       
    }
    public int getTemp(){
        return temp;
    }
    public void increaseTemp (){
          temp++;
        if(temp >= MAX_TEMPERATURE){
            temp = MAX_TEMPERATURE; //temp + 1 then temp is not MAX but temp is MAX return MAX
       }
//        if(temp<MAX_TEMPERATURE){
//            temp++ ; if temp < MAX it is plus to 30 but temp > MAX can't Plus
//        }
    }
    public void decreaseTemp(){
        temp--;
        if(temp <= MIN_TEMPERATURE){
            temp = MIN_TEMPERATURE;
        }
    }
    public void changeFanSpeed(){
        if(fanSpeed==FanSpeed.LOW){
            fanSpeed= FanSpeed.MEDIUM;
        }else if (fanSpeed==FanSpeed.MEDIUM){
            fanSpeed = FanSpeed.HIGH;
        }else if (fanSpeed == FanSpeed.HIGH){
            fanSpeed  =FanSpeed.LOW;
        }
    }

    @Override
    public String toString() {
        return "AirConditioner{" + ", fanSpeed=" + fanSpeed + ", airOn=" + airOn + ", fanOn=" + fanOn + ", temp=" + temp + '}';
    }
    
}
