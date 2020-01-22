package TD1;

import java.awt.Color;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {
	public static void main(String [] args){
		//Rectangle r1 = new Rectangle("r1",3,4,Color.black,1,2);
		//r1.affiche();
		//System.out.println("L'aire du rectangle est "+r1.aire()+" et le périmètre est "+r1.perimetre());
		ArrayList<Rectangle> array = new ArrayList<>();
		System.out.println(array.isEmpty());
		int i=0;
		for(; i<10; i++){
			array.add(new Rectangle("r"+i, i+i, (i+i)/2, Color.black, new Point2D(i,i)));
		}
		i=0;
		while(i<=9){//!array.isEmpty()){
			array.get(i).affiche();
			//array.remove(i);
			i++;
		}
		array.clear();
		System.out.println(array.isEmpty());
		System.out.println("La liste est vide");
		
	}
}
