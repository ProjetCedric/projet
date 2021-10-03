package Capteurs;

import java.awt.Color ;

import  lejos.hardware.port.Port ;
import lejos.hardware.port.SensorPort ;
import  lejos.hardware.sensor.EV3ColorSensor ;
import  lejos.hardware.sensor.EV3TouchSensor ;
import  lejos.hardware.sensor.EV3UltrasonicSensor ;
import  lejos.robotics.SampleProvider ;
import  lejos.utility.Delay ;

public class Capteurs {
	
	//créations des ports correspondants aux capteurs
	
	private static  Port p1=lejos.hardware.port.SensorPort.S1;
	private static Port p2=lejos.hardware.port.SensorPort.S2;
	private static Port p3=lejos.hardware.port.SensorPort.S3;
	
	
	// Initialisations des instances des capteurs( utraSons , couleurs et tactils)
	
	private static EV3UltrasonicSensor capteurSon = new EV3UltrasonicSensor(p2);
	private static EV3ColorSensor capteurCouleur = new EV3ColorSensor(p3);
	private static EV3TouchSensor capteurTouche = new EV3TouchSensor(p1);
	
	
	//Initialisation des couleurs des lignes 
	
	final static Color ligneBlanche= Color.WHITE;
	final static Color ligneVert = Color.GREEN ;
	final static Color ligneBlue = Color.BLUE;
	
	
	//Capteur utrason
	  // attibut permettant de stocker la valeur d'une distance 
	private static  SampleProvider distance=capteurSon.getDistanceMode();
	private static float [] distances = new float[distance.sampleSize()];
	
	 // fonction permettante de  déterminer la distance la plus proche
	
	public float getDistance () {
		distance.fetchSample(distances, 0);
		return distances[0];
	
	}
	
	// fonction permettant d'allumer le capteur d'ultraSon
	
	public void allumerCapteurSon() {
		capteurSon.enable();
	}
	
	// fonction permettant d'éteindre le capteur d'ultraSon
	
	public void eteindreCapteurSon() {
		capteurSon.disable();
	}
	
	//fonction permettant de détectecter la couleur , renvoie l'indice d
	
	public int IndicecouleurDetecter () {
		return capteurCouleur.getColorID();
	}
	
	// vérifie si on est au dela de la ligne blanche
	public boolean campAdverse( int idxCouleur) {
//		return idxCouleur== ligneBlanche;
		}
	
}
	
	
	
	
	
	 


