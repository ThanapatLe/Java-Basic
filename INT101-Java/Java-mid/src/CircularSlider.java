public class CircularSlider {
    private double min;
    private double stepSize;
    private double maxStep;
    private double currentStep=0;

    public CircularSlider(double minvol,double maxStep,double stepSize){
        min=minvol;
        this.maxStep=maxStep;
        this.stepSize=stepSize;
    }

    public void UP(){
        currentStep++;
        if(currentStep>maxStep){
            currentStep=0;
        }
    }

    public void Down(){
        currentStep--;
        if(currentStep<0){
            currentStep=maxStep;
        }
    }

    public double getValue(){
        return min + currentStep * stepSize;
    }

    @Override
    public String toString() {
        return ""+getValue();
    }


}