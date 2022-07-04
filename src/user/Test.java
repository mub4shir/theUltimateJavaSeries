package user;

class Test {
    //Declare member variables here
    private int numberOfItems;
    private String[] items= new String[20];
    private int counter=0;
    public Test() {
        //Add necessary initializations here
        this.numberOfItems=20;
        this.items=items;
        this.counter=counter;

    }

    public void insertItem(String item){
        //Add function logic
        items[counter]=item;
        counter++;
    }

    public void printList(){
        //Add function logic
        for(int i=0; i<counter;i++)
            System.out.println(items[i]);
    }
}
