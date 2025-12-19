package e11;
public class MainTelevisao {
    public static void main(String[] args) {
        Televisao tv = new Televisao(10, 5);
        tv.aumentarVolume();
        tv.trocarCanal(7);
        System.out.println(tv.getVolume());
        System.out.println(tv.getCanal());
    }
}
