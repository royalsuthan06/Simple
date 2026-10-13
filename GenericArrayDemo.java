public class GenericArrayDemo {

    // Simple generic method to print any array
    static <T> void display(T[] arr) {
        for (T item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] nums = { 1, 2, 3 };
        String[] words = { "Hello", "Java" };

        display(nums);
        display(words);
    }
}