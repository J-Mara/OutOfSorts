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
  public static void selectionSort(int[] data){
    for(int i = 0; i < data.length; i++){
      int lowest = i;
      for(int j = i; j < data.length; j++){
        if(data[j] < data[lowest]){
          lowest = j;
        }
      }
      int holder = data[i];
      data[i] = data[lowest];
      data[lowest] = holder;
    }
  }
  public static void insertionSort(int[] data){
    for(int i = 0; i < data.length; i++){
      for(int j = 0; j < i; j++){
        if(data[i] < data[j]){
          int holder = data[i];
          for(int p = i-1; p >= j; p--){
            data[p+1] = data[p];
          }
          data[j] = holder;
        }
      }
    }
  }
}
