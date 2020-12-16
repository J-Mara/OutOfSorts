public class Sorts{
  public static void bubbleSort(int[] data){
    boolean sorted = false;
    while(sorted == false){
      sorted = true;
      for(int i = 0; i < data.length - 1; i++){
        if(data[i] > data[i+1]){
          int holder = data[i];
          data[i] = data[i+1];
          data[i+1] = holder;
          sorted = false;
        }
      }
    }
  }
}
