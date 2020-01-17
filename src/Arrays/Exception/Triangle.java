package Arrays.Exception;

public class Triangle {
    private int canh1;
    private  int canh2;
    private  int canh3;
    private boolean tamgiac;

    public boolean isTamgiac() {
        return tamgiac;
    }

    public void setTamgiac(boolean tamgiac) {
        this.tamgiac = tamgiac;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh3 = canh3;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }
    public static void xetbacanh(int canh1,int canh2,int canh3){
            if (canh1<=0||canh2<=0||canh3<=0||(canh1+canh2)<=canh3||(canh1+canh3)<=canh2||(canh2+canh3)<=canh1)
                System.out.println("khong la ba canh cua tam giac");;

    }
}
