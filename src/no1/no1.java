package no1;

public class no1 {
    public static void getNo1(){
        int randomArray[] = {32,54,12,87,44,65,123,431,561,23,98,318,572,341,853};
        for(int i = 0; i < randomArray.length; i++) {
            if(randomArray[i] % 2 == 0) {
                System.out.println(randomArray[i] + " --> Bilangan Genap");
            }else{
                System.out.println(randomArray[i] + " --> Bilangan Ganjil");
            }
        }
        return;
    }

}
