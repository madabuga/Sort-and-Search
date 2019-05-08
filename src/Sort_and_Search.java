public class Sort_and_Search {
    public static void main(String[] args) {
        int counter;
        int[] Array={23, 110, 1228, 6, 2355, 1, 90, 17, 159, 2278, 300, 739, 548, 710, 22, 8, 115};

        //Bubble Sort:

        for (int i = 0; i < Array.length-1; i++) {
            counter=0;
            for (int j = 0; j < Array.length-i-1; j++) {
                if(Array[j] > Array[j+1]){
                    counter++;
                    int swap=Array[j];
                    Array[j]=Array[j+1];
                    Array[j+1]=swap;
                }
            }

            if (counter==0){
                break;
            }
        }

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }

        //Binary Search:

        int n=17;
        int[] secondArray = Array;
        int mid, start=0, end=secondArray.length;

        System.out.println();

        while( start <= end ){
            mid = (end + start)/2;

            if(secondArray[mid]==n){
                System.out.println(n + " found!");
                break;
            }else if(secondArray[mid] < n)
            {
                start = mid + 1;
            } else if (secondArray[mid] > n)
            {
                end = mid-1;
            } else {
                System.out.println(n + " not found!");
            }

        }


    }
}
