package project;

import java.util.Scanner;

public class StopWatch {
    private double startTime;
    private double endTime;
    public StopWatch(double startTime,double endTime){
        this.startTime=startTime;
        this.endTime=endTime;
    }
    public StopWatch(){

    }
    public double getStart(){
        startTime=System.currentTimeMillis();
        return startTime;
    }
    public double getEnd(){
        endTime=System.currentTimeMillis();
        return endTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        Scanner scanner=new Scanner(System.in);
        System.out.println("start time: ");
        double startTime=scanner.nextDouble();
        System.out.println("end time");
        double endTime=scanner.nextDouble();
        double distance=endTime-startTime;
        System.out.println("distance: "+distance);
    }
}
