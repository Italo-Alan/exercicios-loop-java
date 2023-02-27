public class ArrayInverso {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        int count = 0;

        for(int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i] + " ");
        }
    }
}
