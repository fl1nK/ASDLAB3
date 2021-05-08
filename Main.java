package kpi.fict.it03;

public class Main {
	static AVLTree<Integer> avl = new AVLTree<>();
	static RBTree<Integer>  rbt = new RBTree<>();
	static int n = 1000000;

	public static void main(String[] args){
		System.out.println("AVL_Tree");
		testAVl();


		System.out.println("RBT_Tree");
		testRBT();


	}

	public static void testAVl() {
		long start  = System.nanoTime();
		for (int i = 0; i < n; i++) {
			avl.insert(i);
		}
		long et = System.nanoTime() - start;
		System.out.printf("Додавання %d елементів: " + et/1000000 + " мс\n",n);

		long start1  = System.nanoTime();
		for (int i = 0; i < n; i++) {
			avl.contains(i);
		}
		long et1 = System.nanoTime() - start1;
		System.out.printf("Пошук %d елементів: " + et1/1000000 + " мс\n",n);

		long start2  = System.nanoTime();
		for (int i = 0; i < n; i++) {
			avl.remove(i);
		}
		long et2 = System.nanoTime() - start2;
		System.out.printf("Видалення %d елементів: " + et2/1000000 + " мс\n",n);
	}



	public static void testRBT() {
		long start  = System.nanoTime();
		for (int i = 0; i < n; i++) {
			rbt.insert(i);
		}
		long et = System.nanoTime() - start;
		System.out.printf("Додавання %d елементів: " + et/1000000 + " мс\n",n);

		long start1  = System.nanoTime();
		for (int i = 0; i < n; i++) {
			rbt.search(i);
		}
		long et1 = System.nanoTime() - start1;
		System.out.printf("Пошук %d елементів: " + et1/1000000 + " мс\n",n);

		long start2  = System.nanoTime();
		for (int i = 0; i < n; i++) {
			rbt.remove(new Node<>(i));
		}
		long et2 = System.nanoTime() - start2;
		System.out.printf("Видалення %d елементів: " + et2/1000000 + " мс\n",n);
	}

}
