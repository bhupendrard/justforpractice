package CAR;

import java.util.Locale;

public class car {

    private int wheel;
    private String color;
    private String model;

    public void setModel(String model) {
        String validateModel = model.toLowerCase();
        if (validateModel.equals("civic") || validateModel.equals("prosche"))
        {
            this.model=model;
        }
        else{
            this.model="Unknown";
        }


    }
    public String getModel(){
        return this.model;

    }
}
