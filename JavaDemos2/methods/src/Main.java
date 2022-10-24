public class Main {
    public static void main(String[] args) {
    _findNumberMiniProject();
    _findNumberMiniProject();
    _findNumberMiniProject();
    _findNumberMiniProject();
    _findNumberMiniProject();
    }

    public static void _findNumberMiniProject(){
        int[] sayilar  = new int [] {1,2,3,4,5,6};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi : sayilar){
            if (sayi == aranacak){
                varMi = true;
                break;
            }

        }
        String mesaj = "";
        if (varMi){
            mesaj = "Sayı mevcuttur: "+ aranacak;
            mesajVer(mesaj);
        } else {
            mesaj = "Sayı mevcut değildir: "+ aranacak;
        }
    }

    public static void mesajVer(String mesaj){ //parametreli method.
        System.out.println(mesaj);
    }


}
