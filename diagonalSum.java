public class diagonalSum {
    public static int Sum(int [][]arr)    {
        int i=0,j=0;
        int n=arr.length;
        int sum=0;
        while (i<n)  {
            sum+=arr[i][j];
            i++; j++;
        }
        i=0; j=n-1;
        while (i<n) {
            sum+=arr[i][j];
            i++; j--;
        }
        if (n%2!=0) sum-=arr[n/2][n/2];
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,9},{5,6,7,8,5},{9,10,11,12,5},{13,14,15,16,3},{17,18,19,20,4}};
        System.out.println("The Sum of the diagonals of the matrix is: "+Sum(arr));
    }
}
