package TD1;

import java.awt.Color;


public class Rectangle {

		private String nom;
		private float longueur;
		private float largeur;
		private final static int nbCotes=4;// Final = constante , static = propre à la classe
		private Color couleur;
		private final static int angle=90;
		private Point2D position;
		//private Rectangle plusGrand;
		
		public Rectangle(String nom, float lon, float lar, Color c,Point2D p){
			this.nom = nom;
			this.longueur = lon;
			this.largeur = lar;
			this.couleur = c;
			this.position = p;
			//this.plusGrand = this;
		}
		
		/* Fonction qui retourne l'aire du rectangle */
		public float aire(){
			return this.longueur*this.largeur;
		}
		/* Fonction qui retourne le perimetre du rectangle */
		public float perimetre(){
			return this.longueur*2+2*this.largeur;
		}	
		
		public void affiche(){
			System.out.println("Le rectangle "+this.nom+" est de longueur "+this.longueur+" et de largeur "+this.largeur);
		}
}
