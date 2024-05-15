package logbuttons;
public class Logbuttons {
    public static void main(String[] args) {
        int[] buttons = new int[] {0, 0, 0, 0, 0, 0}; // все входы a и b
        boolean t=true;
        boolean f=false;
        while(true){
            int x=1;
            // объявляются все кнопки
        Button a11=new Button(buttons[0],f); 
        Button b11=new Button(buttons[1],f);
        Button a12=new Button(buttons[0],t);
        Button b12=new Button(buttons[1],t);
        Button a21=new Button(buttons[2],f);
        Button b21=new Button(buttons[3],t);
        Button a22=new Button(buttons[2],t);
        Button b22=new Button(buttons[3],f);
        Button a23=new Button(buttons[2],f);
        Button b23=new Button(buttons[3],f);
        Button a24=new Button(buttons[2],f);
        Button b24=new Button(buttons[3],f);
        Button a25=new Button(buttons[2],t);
        Button b25=new Button(buttons[3],t);
        Button a26=new Button(buttons[2],t);
        Button b26=new Button(buttons[3],t);
        Button a31=new Button(buttons[4],f);
        Button b31=new Button(buttons[5],t);
        Button a32=new Button(buttons[4],t);
        Button b32=new Button(buttons[5],f);
        Button a33=new Button(buttons[4],f);
        Button b33=new Button(buttons[5],f);
        Button a34=new Button(buttons[4],t);
        Button b34=new Button(buttons[5],t);
        //все действия (тут для примера третья схема)
        int a=p(p(x,a11),b11);
        int b=p(p(a,a21),b21);
        int c=p(p(a,a22),b22);
        a=s(b,c);
        b=p(p(x,a23),b23);
        a=s(a,b);
        b=p(p(a,a31),b31);
        c=p(p(a,a32),b32);
        a=s(b,c);
        b=p(x,a12);
        c=p(x,b12);
        int d=s(b,c);
        b=p(p(x,a24),b24);
        c=p(p(x,a25),b25);
        b=s(b,c);
        d=s(d,b);
        b=p(d,a26);
        c=p(d,b26);
        d=s(b,c);
        b=p(p(d,a33),b33);
        c=p(p(d,a34),b34);
        d=s(b,c);
        x=s(a,d);
        System.out.println(x);
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
            for(int i=5; i>=0; i--){// нужно ввести количество входов-1 (там где i=)
                if(buttons[i]==0){
                    buttons[i]=1;
                    if(i!=5){// нужно ввести количество входов-1 (там где i!=)
                        for(int j=i+1; j<6; j++){// нужно ввести количество входов (там где i<)
                            buttons[j]=0;
                        }
                    }
                    break;
                }
            }
        }
    }
    
    static int p(int a, Button b){
        if(a==1){
            if((b.active==true)&&(b.opened==true)) a=0;
            if((b.active==true)&&(b.opened==false)) a=1;
            if((b.active==false)&&(b.opened==true)) a=1;
            if((b.active==false)&&(b.opened==false)) a=0;
        }
        return a;
    }
    static int s(int a, int b){
        int x=a+b;
        if(x>0){
            x=1;
        }
        return x;
    }
}

public class Button {
        int vhod;
        boolean opened;
        boolean active;
        Button(int v,boolean o){
            //если вход активен, то кнопка активна
            vhod=v;
            opened=o;
            if(v==1) active=true;
            if(v==0) active=false;
        }
}
