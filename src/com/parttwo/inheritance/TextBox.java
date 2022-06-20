package com.parttwo.inheritance;

public class TextBox extends UIControl {

    private String text=""; // Field

//    public TextBox() {
//        super(true);
//
//        System.out.println("TextBox");
//    }


    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    // annotation => label we attach to a class member and with this we give extra information to the java compiler
                    // so with this we are telling java compiler we are overriding the toString method declared in the object class
                    // and with this java compiler  will check the signature of method it will make sure that this method has exact same signature
    @Override
    public String toString(){
        return text;
    }

    public void setText(String text){
        this.text=text;
    }
    public void clear(){
        text="";
    }


}
