package com.company.alia;

public class Operation extends Thread{

    private String operationName;
    private int operationTime;

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    public Operation(Runnable target, String operationName, int operationTime) {
        super(target);
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    public Operation(ThreadGroup group, Runnable target, String operationName, int operationTime) {
        super(group, target);
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    public Operation(String name, String operationName, int operationTime) {
        super(name);
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    public Operation(ThreadGroup group, String name, String operationName, int operationTime) {
        super(group, name);
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    public Operation(Runnable target, String name, String operationName, int operationTime) {
        super(target, name);
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    public Operation(ThreadGroup group, Runnable target, String name, String operationName, int operationTime) {
        super(group, target, name);
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    public Operation(ThreadGroup group, Runnable target, String name, long stackSize, String operationName, int operationTime) {
        super(group, target, name, stackSize);
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public int getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(int operationTime) {
        this.operationTime = operationTime;
    }

    @Override
    public void run() {
        try{
            System.out.println("Operation " + "\"" +operationName +  "\": started");
            for(int i = 1; i<operationTime; i++){
                Thread.sleep(1000);
                System.out.println("Operation "+ "\"" +operationName +  "\": " + i+ " second");
            }
            System.out.println("Operation " + "\"" +operationName +  "\": finished");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
