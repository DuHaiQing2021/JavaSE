public class TesDemo {
    int binarySearch(int[] array, int value) {

        int begin = 0;

        int end = array.length - 1;

        while (begin <= end) {

            int mid = begin + ((end-begin) / 2);

            if (array[mid] < value)

                begin = mid + 1;

            else if (array[mid] > value)

                end = mid - 1;

            else

                return mid;

        }




        return -1;

    }
    public static void main(String[] args) {

    }

}
