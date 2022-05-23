public class main {
    public static void main(String[] args) {
        int vasyaAge = 50;
        int mishaAge = 8;
        int katyaAge = 25;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge<mishaAge){
            min=vasyaAge;
            max=mishaAge;
        }else {
            min=mishaAge;
            max=vasyaAge;
        }

        if(min>katyaAge){
            middle=min;
            min=katyaAge;
        }else if(max<katyaAge){
            middle=max;
            max=katyaAge;
        }else {
            middle=katyaAge;
        }

        System.out.println("Minimum age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximum age: " + max);
    }
}
