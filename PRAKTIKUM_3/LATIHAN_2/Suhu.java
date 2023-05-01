package PRAKTIKUM_3.LATIHAN_2;

import java.util.Scanner;

public class Suhu {
    int celcius;
    float hasil;

    public Suhu() {}

    public Suhu(int celcius){
		this.celcius=celcius;
	}
	Scanner input = new Scanner(System.in);
	
	void setcelcius(int celcius){
		this.celcius=celcius;
	}
	int getcelcius(){
		return celcius;
	}
	
	void inputcelcius(){
		System.out.println("Enter celcius : ");
		celcius=input.nextInt();
	}
	
	void celciusToK(int celcius){
		hasil=celcius+273.15f;
		System.out.println(celcius+ " celcius = "+hasil+" K ");
	}
	
	float celciusToK(float celcius){
		return celcius+273.15f;
	}
	
	void celciusToF(int celcius){
		hasil=celcius*1.8f+32;
		System.out.println(celcius+ " celcius = "+hasil+" F ");
	}
	
	float celciusToF(float celcius){
		return celcius*1.8f+32;
	}
	
	void celciusToRa(int celcius){
		hasil=celcius*1.8f+491.67f;
		System.out.println(celcius+ " celcius = "+hasil+" Ra ");
	}
	
	float celciusToRa(float celcius){
		return celcius*1.8f+491.67f;
	}
	
	void celciusToDe(int celcius){
		hasil=(100-celcius)*1.5f;
		System.out.println(celcius+ " celcius = "+hasil+" De ");
	}
	
	float celciusToDe(float celcius){
		return (100-celcius)*1.5f;
	}
	
	void celciusToN(int celcius){
		hasil=celcius*33/100;
		System.out.println(celcius+ " celcius = "+hasil+" N ");
	}
	
	float celciusToN(float celcius){
		return celcius*33/100;
	}
	
	float celciusToRe(float celcius){
		return celcius*0.8f;
	}
	
	void celciusToRe(int celcius){
		hasil=celcius*0.8f;
		System.out.println(celcius+ " celcius = "+hasil+" Re ");
	}
	
	void celciusToRo(int celcius){
		hasil=celcius*21/40+7.5f;
		System.out.println(celcius+ " celcius = "+hasil+" Ro ");
	}
	
	float celciusToRo(float celcius){
		return celcius*21/40+7.5f;
	}	
	
}
    

