package JAVA;
public class TwoDArrays {
    public static void main(String[] args){
        int arr[][] = {{22, 50, 90}, {45,55, 99}, {33,44,50}};

        //printing 2d array
        for(int i = 0; i<3;i++){
            for(int j = 0; j<3 ;j++){
                System.out.print(arr[i][j]+" ");

                
            }
            System.out.println();
        }
    }
}
