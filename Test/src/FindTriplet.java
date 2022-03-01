import java.util.Scanner;

// Java program to find a triplet
class FindTriplet {

    // returns true if there is triplet with sum equal
    // to 'sum' present in A[]. Also, prints the triplet
    int find3Numbers(int[] A, int arr_size, int sum) {

        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {
            //System.out.println(0);//----->1
            // Fix the second element as A[j]
            for (int j = i + 1; j < arr_size - 1; j++) {
                //System.out.println(0);//----->2
                // Now look for the third number
                for (int k = j + 1; k < arr_size; k++) {
                    //System.out.println(0);//---->3
                    //System.out.println(A[i] + ", " + A[j] + ", " + A[k]);
                    if (A[i] + A[j] + A[k] == sum) {
                        //System.out.println((A[i] ^ A[j] ^ A[k]));
                        if((A[i] ^ A[j] ^ A[k]) == 0 ){
                            System.out.print(A[i] + ", " + A[j] + ", " + A[k]);
                            return 0;
                        }
                    }
                }
            }
        }
        System.out.println(-1);
        return -1;
    }


    public static void main(String[] args) {
        FindTriplet triplet = new FindTriplet();
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        for (int i = 0; i < T; i++) {
            int N = input.nextInt();
            int[] A = new int[N];

            for (int j = 0; j < N; j++) {
                A[j] = j+1;
            }

            int arr_size = A.length;
            triplet.find3Numbers(A, arr_size, N);



        }
    }






}