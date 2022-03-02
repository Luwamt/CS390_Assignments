package w1l2.CS390_Assignments.w2l5.prob5;

public class Computer {
    private String manufacture;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacture,String processor,int ramSize,double processorSpeed){
     this.manufacture=manufacture;
     this.processor=processor;
     this.ramSize=ramSize;
     this.processorSpeed=processorSpeed;
    }
    public int getRamSize(){
        return ramSize;
    }
  public double getProcessorSpeed(){
        return processorSpeed;
  }
  double computePower(){
        return ramSize*processorSpeed;
  }
  public  String toString(){
        return  "Manufacture: "+manufacture+" "+ "Processor: "+
    processor+" "+"RamSize: "+ ramSize+ " "+ "ProcessorSpeed: "+ processorSpeed;
    }
    @Override
    public boolean equals(Object obj){
       if(obj== null) return false ;
       if (this== obj) return true;
       if (!(obj instanceof Computer)) return false;
        Computer c = (Computer) obj;
       if (this.manufacture.equalsIgnoreCase(c.manufacture)&&
               this.processor.equalsIgnoreCase(c.processor)&&
               this.ramSize==c.ramSize&&this.processorSpeed==c.processorSpeed){
           return true;
       }

        return false;
    }
}
