package com.parttwo.inheritance;

public abstract class UIControl   {

    protected boolean isEnabled = true;

    public void enable(){
        isEnabled=true;
    }

//    public UIControl(boolean isEnabled) {
//        this.isEnabled=isEnabled;
//        System.out.println("UIControl");
//    }


    public abstract void render(); // only method declaration not the implementation


    public void disable(){
        isEnabled=false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }

}
