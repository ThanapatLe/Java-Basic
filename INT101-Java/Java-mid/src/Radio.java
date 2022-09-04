public class Radio {
    private Switch s;
    private CircularSlider Station;
    private BoundedSlider Volume;
    private boolean state;

    public Radio(boolean state,double minSt,double maxStepsSt,double stepSizeSt,double minVol,double maxStepVol,double stepSizeVol){
        s = new Switch(state);
        Station = new CircularSlider(minSt,maxStepsSt,stepSizeSt);
        Volume = new BoundedSlider (minVol,maxStepVol,stepSizeVol) ;
        this.state=state;
    }

    public void StUP(){
        if(state){
            Station.UP();
        }
    }

    public void VolUp(){
        if(state){
            Volume.UP();
        }
    }
    public void StDown(){
        if(state){
            Station.Down();
        }
    }

    public void VolDown(){
        if(state){
            Volume.Down();
        }
    }

    @Override
    public String toString() {
        return "radio: " + s + " Station:" + Station + " Valume: " + Volume ;
    }
}