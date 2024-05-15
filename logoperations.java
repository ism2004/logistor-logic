package logoperations;
public class Logoperations {
    public static void main(String[] args) {
        int[] buttons = new int[] {0, 0, 0, 0, 0, 0, 0, 0}; // все входы a и b
        while(true){
            // все логические операции
            int x1=and(buttons[0],buttons[1]);
            int x2=xor(buttons[2],buttons[3]);
            int x3=and(buttons[2],buttons[3]);
            int x4=xor(buttons[4],buttons[5]);
            int x5=and(buttons[4],buttons[5]);
            int x6=xor(buttons[6],buttons[7]);
            int x7=and(buttons[6],buttons[7]);
            x1=and(x1,x2);
            x1=or(x1,x3);
            x1=and(x1,x4);
            x1=or(x1,x5);
            x1=and(x1,x6);
            x1=nor(x1,x7);
            System.out.println(x1);
            boolean z=false;
            for(int i=0; i<6; i++){// нужно ввести количество входов (там где i<)
                if(buttons[i]==0){
                    break;
                }
                if(i==5){
                    z=true;
                }
            }
            if(z==true){
                break;
            }
            for(int i=7; i>=0; i--){// нужно ввести количество переменных-1 (там где i=)
                if(buttons[i]==0){
                    buttons[i]=1;
                    if(i!=7){// нужно ввести количество переменных-1 (там где i!=)
                        for(int j=i+1; j<8; j++){// нужно ввести количество переменных (там где i<)
                            buttons[j]=0;
                        }
                    }
                    break;
                }
            }
        }
    }
    static int and(int a, int b){
        int x=0;
        if((a==1)&(b==1)){
            x=1;
        }
        return x;
    }
    
    static int nand(int a, int b){
        int x=1;
        if((a==1)&(b==1)){
            x=0;
        }
        return x;
    }
    
    static int or(int a, int b){
        int x=0;
        if((a==1)|(b==1)){
            x=1;
        }
        return x;
    }
    
    static int nor(int a, int b){
        int x=1;
        if((a==1)|(b==1)){
            x=0;
        }
        return x;
    }
    
    static int xor(int a, int b){
        int x=0;
        if((a==1)|(b==1)){
            x=1;
        }
        if((a==1)&(b==1)){
            x=0;
        }
        return x;
    }
    
    static int xnor(int a, int b){
        int x=0;
        if(a==b){
            x=1;
        }
        return x;
    }
    
}
