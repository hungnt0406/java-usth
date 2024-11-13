package labwork3;

public class Reverse {
    public static void main(String[] args){
        String[] a = new String[3];
        a[0]="a";
        a[1]="b";
        a[2]="c";
        int n = a.length;
        for (int i = 0; i < n/2; i++) {
            String temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
