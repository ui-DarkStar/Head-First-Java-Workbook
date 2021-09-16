
public class IntegerSorter {

	public static void print(int array[]) {
		int loop = 0;
		while(loop < array.length) {
			if (loop == 0) {
				System.out.print(array[loop]);
			}else {
				System.out.print(", " + array[loop]);
			}
			loop ++;
		}
		System.out.println();
		System.out.println("----------------------------------------------");
	}


	public static void bubbleSort(int array[]) {
		boolean swap;
		int run = 1;

		do {
			int loop = 0;
			int held;
			swap = false;
			while (loop < (array.length - 1)) {
				if(array[loop] > array[loop + 1]) {
					held = array[loop + 1];
					array[loop + 1] = array[loop];
					array[loop] = held;
					swap = true;
				}
				loop ++;


			}
			if(swap == true) {
				System.out.println("the number of sort runs is " + run + " and the order is");
				print(array);
				run ++;
			}


		}while(swap == true);


	}
	public static void bubbleSortReverce(int array[]) {
		boolean swap;
		int run = 1;

		do {
			int loop = 0;
			int held;
			swap = false;
			while (loop < (array.length - 1)) {
				if(array[loop] < array[loop + 1]) {
					held = array[loop + 1];
					array[loop + 1] = array[loop];
					array[loop] = held;
					swap = true;
				}
				loop ++;


			}
			if(swap == true) {
				System.out.println("the number of sort runs is " + run + " and the order is");
				print(array);
				run ++;
			}


		}while(swap == true);


	}

	public static int[] rngArray() {
		int loop = 0;
		int array[] = new int[20];
		while(loop < array.length) {
			array[loop] = (int)(Math.random()*100) +1;
			loop ++;
		}

		return array;

	}

	public static void main(String[] args) {


		int[] integerArray = rngArray();

		//integerArray[0] = 10;
		//integerArray[1] = 9;
		//integerArray[2] = 8;
		//integerArray[3] = 7;
		//integerArray[4] = 6;
		//integerArray[5] = 5;
		//integerArray[6] = 4;
		//integerArray[7] = 3;
		//integerArray[8] = 2;
		//integerArray[9] = 10;

		System.out.println("The list of unsorted numbers are");
		print(integerArray);
		bubbleSort(integerArray);
		bubbleSortReverce(integerArray);
	}
}

