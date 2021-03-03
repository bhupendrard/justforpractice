package CAR;

public class main {
    public static void main(String[] args){
        car por = new car(); //creating new object
        car honda =new car();
        //System.out.println("model is "+honda.getModel()); //will print null if printed before seting model
        honda.setModel("civic");

        System.out.println("model is "+honda.getModel());
        //Print model of honda
        System.out.println("model is "+por.getModel());
        
    }

}
