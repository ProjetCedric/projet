package Capteurs;
import lejos.hardware.motor.JavaMotorRegulator ;

import  java.io.File ;

import  javax.sound.sampled.Port ;

import lejos.hardware.BrickFinder ;
import lejos.hardware.Sound ;
import lejos.hardware.lcd.GraphicsLCD ;
import lejos.hardware.motor.EV3LargeRegulatedMotor ;

import lejos.hardware.port.MotorPort ;
import lejos.hardware.sensor.EV3UltrasonicSensor ;
import lejos.hardware.sensor.SensorModes ;
import lejos.robotics.RegulatedMotor ;
import lejos.robotics.SampleProvider ;

import lejos.utility.Delay ;
import lejos.hardware.motor.Motor ;

public class Deplacements {
	
	private static  RegulatedMotor roueDroite =  new  EV3LargeRegulatedMotor ( MotorPort.D);
	private static  RegulatedMotor roueGauche =  new  EV3LargeRegulatedMotor ( MotorPort.A);
	private  RegulatedMotor Pinces =  new  EV3LargeRegulatedMotor ( MotorPort.C);
	
	
	//fonction permettant de se déplacer
	public static void avancer() {
		Motor.D.
		roueGauche.forward();
		Delay.msDelay(2000);//m.s
		roueDroite.backward();
		roueGauche.backward();
		
	}
	

}
