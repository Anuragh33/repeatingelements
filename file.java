import java.util.Arrays;


class Main {
  public static void main(String[] args) {
    int[] a = new int[] {2,4,6,3,4,8};
    int len = a.length;


    for (int i=0;i< len; i++){
      for(int j =i+1; j<len; j++){
        if(a[i]==a[j])
          System.out.println("The repeated number is: " + a[i]);    
      }
    }
     
  }
}
