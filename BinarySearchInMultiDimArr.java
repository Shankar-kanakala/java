//Implement these methods in your class
public static void BinSrchMultiDim(int Arr[][], int key) {
    int KeyIndex = 0, index, RowIndex = -1;
    for(index = 0; index < Arr.length; index++) {
        KeyIndex = findKey(Arr[index], key);
        RowIndex = index;
        if(Arr[index][KeyIndex] == key) {
            System.out.println(index+" "+KeyIndex);
            break;
        }
        
    }
    if(Arr[RowIndex][KeyIndex] != key)
        System.out.println("No");
    
}
public static int findKey(int Ar[], int value) {
    int start = 0, end = Ar.length - 1, mid = 0;
    while(end >= start) {
        mid = (start + end) / 2;
        if(Ar[mid] == value) {
            break;
        }
        else if(Ar[mid] > value) {
            end = mid - 1;
        }
        else {
            start = mid + 1;
        }
    }
    return mid;
}
