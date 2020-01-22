package exo2;

/* export CLASSPATH=$HOME/workspace/TD1_UML/src/:.
	Commande pour relier les classe entre elles
*/
import exo2_bis.C;

public class B {
	public void mc(){
		C c =new C();
		System.out.println(c.c1);
		//System.out.println(c.c2);
		//System.out.println(c.c3);
	}
	public void ma(){
		A a = new A();
		System.out.println(a.a1);
		//System.out.println(a.a2);
		System.out.println(a.a3);
	}
}
