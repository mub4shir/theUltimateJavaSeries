package com.parttwo.interfaces;

public class Dragger {  // a lightweight interface with only one coupling point
    public void drag(UIWidget draggable){
        draggable.drag();
        System.out.println("Dragging done!");
    }
}
