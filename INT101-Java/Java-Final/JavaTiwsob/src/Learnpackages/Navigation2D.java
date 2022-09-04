
package Learnpackages;

public class Navigation2D {
    private int row , column ;
    private int CurrentRow , CurrentColumn;
    private boolean on;
    
    public Navigation2D (int row,int column){
        this.row = row;
        this.column = column;
    }
    
    public void moveLeft (){
        CurrentColumn--;
        if (CurrentColumn < 0){
            CurrentColumn = column - 1;
        }
    }
    public void moveRight (){
        CurrentColumn++;
        if(CurrentColumn >= column){
            CurrentColumn = 0;
        }
    }
    public void moveUp (){
        CurrentRow--;
        if (CurrentRow < 0){
            CurrentRow = row - 1 ;
        }
    }
    public void moveDown (){
        CurrentRow++;
        if(CurrentRow >= row){
            CurrentRow = 0;
        }
    }
    public int getCurrentPOsition(){
        return CurrentRow*column+CurrentColumn +1;
    }
    
   public void turnOn(){
      this.on = true; 
   }
   public void turnOff(){
      this.on = false; 
   }
   public boolean on (){
       return on;
   }

    @Override
    public String toString() {
        return "Navigation2D{" + "row=" + row + ", column=" + column + ", CurrentRow=" + CurrentRow + ", CurrentColumn=" + CurrentColumn + ", on=" + on + '}';
    }

   
   
}
