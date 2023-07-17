package PRAKTIKUM_8.LATIHAN_1;

public class matematika
{
    float hasil; 
    int hsl;

    void pertambahan(int a, int b)
    {
        hsl = a + b ;
        System.out.println(" Pertambahan : "+a +" + "+b+ " = " + hsl);
    }

    float pertambahan(Float a, Float b)
    {
        return a+b;
    }

    float pengurangan(Float a, Float b)
    {
        return a-b;
    }

    float perkalian(Float a, Float b)
    {
        return a*b;
    }

    float pembagian(Float a, Float b)
    {
        return a/b;
    }

    double pertambahandouble(Double a, Double b, Double c)
    {
        return a+b+c;
    }

    double pengurangandouble(double a, double b, Double c)
    {
        return a-b-c;
    }

    double perkaliandouble(double a, double b, Double c)
    {
        return a*b*c;
    }
    
    double pembagiandouble(double a, double b, Double c)
    {
        return a/b/c;
    }

}