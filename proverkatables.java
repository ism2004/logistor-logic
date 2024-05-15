package proverkatables;
import java.util.Scanner;
public class Proverkatables {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        boolean anti=true;
        boolean odin=true;
        int a[]=new int[64];// нужно ввести количество значений на выходе (2 в степени количество 
входов)
        int b[]=new int[64];// нужно ввести количество значений на выходе
        for(int i=0; i<64; i++){// нужно ввести количество значений на выходе
            a[i]=s.nextInt();
        }
        for(int i=0; i<64; i++){// нужно ввести количество значений на выходе
            b[i]=s.nextInt();
        }
        for(int i=0; i<64; i++){// нужно ввести количество значений на выходе
            if(a[i]!=b[i]){
                odin=false;
            }
        }
        for(int i=0; i<64; i++){// нужно ввести количество значений на выходе
            if(a[i]!=anti(b[i])){
                anti=false;
            }
        }
        // сначала выводится то, противоположны ли они, а потом то, равны ли они
        System.out.println(anti);
        System.out.println(odin);
    }
    static int anti(int x){
        int y=0;
        if(x==0){
            y=1;
        }
        return y;
    }
}
