public class threeNary {
    public static void main(String[] args) {

        int size = 10;
        int[] numbers = new int[size];

        // RANDOM NUMBERS
        System.out.print("Unsorted Array: ");
        for(int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * size) + 1;
            System.out.print(numbers[i] + " ");
        }

        bubbleSort(numbers);

        int finded = treeSearch(numbers, 5);
        System.out.println("Finded 5 at index: " + finded);

    }

    public static void bubbleSort(int[] A) {

        int k = A.length;
        int temp;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.print("Sorted Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public  static int treeSearch(int[] A, int x) {
        int size = 10;
        int l = 0;
        int r = size - 1;

        int m1, m2;
        while ( r >= l ) {

            m1 = l + (r-l)/3;
            m2 = r - (r-l)/3;

            if( A[m1] == x )
                return m1;

            if( A[m2] == x )
                return m2;

            if( x < A[m1] ) {
                r = m1 - 1;
            } else if( x > A[m2] ) {
                l = m2 + 1;
            } else {
                l = m1 + 1;
                r = m2 - 1;
            }
        }

        return -1;
    }

}
