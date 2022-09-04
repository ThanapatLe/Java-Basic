public class BoundedSlider {
    private double MIN_Value;
    private double MAX_Step;
    private double currentStep=0;
    private double stepSize;

    public BoundedSlider(double minVal,double maxStep,double stepSize ){
        MIN_Value=minVal;
        MAX_Step=maxStep;
        this.stepSize=stepSize;
    }

    public void UP(){
        currentStep++;
        if(currentStep > MAX_Step){
            currentStep=MAX_Step;
        }
    }

    public void Down(){
        currentStep --;
        if(currentStep<MIN_Value){
            currentStep=0;

        }
    }

    public double getValue(){
        return MIN_Value + currentStep * stepSize;
    }

    @Override
    public String toString() {

        return ""+getValue();
    }


}
