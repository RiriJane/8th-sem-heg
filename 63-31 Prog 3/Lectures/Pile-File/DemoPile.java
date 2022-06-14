/** 
 * 63-31 - Structures de données : PILE (FILO)
 * @author Ch. Stettler - HEG-Genève
 */
public class DemoPile {

	public static void main(String[] args) {
		Pile p = new Pile();
		p.push(2); p.push(4); p.push(6); p.push(8);
		System.out.println(p.pop());
		System.out.println(p.pop());
		System.out.println(p.pop());

      System.out.println("===================");

		PileV2 p2 = new PileV2();
		p2.push(2); p2.push(4); p2.push(6); p2.push(8); p2.push(10); p2.push(12); p2.push(14);
		System.out.println(p2.pop());
		System.out.println(p2.pop());
		System.out.println(p2.pop());
		System.out.println(p2.pop());
		System.out.println(p2.pop());
	}
}
// =============================================================
// à rajouter/modifier : Pile doit être un interface !
// ci-dessous, c'est deux implémentations possibles...
// =============================================================
/* Version 1 : implémenté dans un tableau int[5], sans gestion d'erreurs (tableau plein, vide, ...) */
class Pile {
	private int[] tab;
	private int size;

	public Pile() { tab = new int[5]; size = 0; }

	public void push(int val) { tab[size++] = val; }
	public int pop() { return tab[--size]; }
	public boolean isEmpty() { return size==0; }
}
// =============================================================
/* Version 2 : implémenté dans un tableau redimensionnable */
class PileV2 {
	final static int SIZE_TAB_INIT = 5;
	private int size;
	private int[] tab;

	public PileV2() { tab = new int[SIZE_TAB_INIT]; size = 0; }

	public void push(int val) {
//		if (size >= SIZE_TAB_INIT) { throw new RuntimeException("Push: pile pleine !"); }
		if (size >= tab.length) { resize(); }
		tab[size++] = val;
	}

	public int pop() {
		if (isEmpty()) { throw new RuntimeException("Pop: pile vide !"); }
		return tab[--size];
	}

	private void resize() {
		int[] newTab = new int[2*tab.length];					// Allouer le nouveau tableau
		for (int k=0; k<size; k++) { newTab[k] = tab[k]; }	// Recopier le contenu
		tab = newTab;													// Remplacer
	}

	public boolean isEmpty() { return size==0; }
	public int size() { return size; }
}