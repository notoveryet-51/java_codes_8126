public class reverseArray {
    public static void main(String[] args) {
        int array[]={1,7,3,6,9,3,5};
        int n=array.length;
        for (int i=0; i<array.length/2; i++)  {
            int temp=array[i];
            array[i]=array[n-1-i];
            array[n-1-i]=temp;
        }
        for (int i=0; i<array.length; i++)  {
            System.out.print(array[i]+" ");
        }
    }
}