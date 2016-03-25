package bmi;

public class BMI {

    private String surname;
    private int gender;
    private double weight;
    private double height;

    public BMI(String su, int se, double we, double he) {
        this.surname = su;
        this.gender = se;
        this.weight = we;
        this.height = he;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String s) {
        this.surname = s;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int se) {
        this.gender = se;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double w) {
        this.weight = w;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getBMI() {
        return getWeight() / (getHeight() * getHeight());
    }
    
    public String getStatus(){
        double bmi = getBMI();
        if(bmi < 18.5){
            return "thin";
        }else if(bmi < 24.9){
            return "normal";
        }else if( bmi < 29.9){
            return "fat";
        }else{
            return "too fat";
        }
    }

}
