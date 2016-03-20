package Trials;

public class Calculator {
    private float sayi1,sayi2,sum;

    public void setSayi1(float sayi1) {
        this.sayi1 = sayi1;
    }

    public void setSayi2(float sayi2) {
        this.sayi2 = sayi2;
    }

    public float getSayi1() {
        return sayi1;
    }

    public float getSayi2() {
        return sayi2;
    }

    public Calculator(float sayi1, float sayi2) {
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
    }
    public void topla()
{
 sum=sayi1+sayi2;
}
    public void cikar()
    {sum=sayi1-sayi2;}
    public void carp()
    {
        sum=sayi1*sayi2;
    }
    public void bol()
    {
        try{
        sum=sayi1/sayi2;}
        catch(Exception e)
        {
            System.out.println("Error");
        }
        
    }
}
