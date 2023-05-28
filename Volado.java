import java.security.SecureRandom;
public class Volado {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int [] volado=new int[3];
        final int AGUILA=1;
        final int SOL=2;
        final int LANZAMIENTOS=100;
        int lanzamiento;
        volado[AGUILA]=0;
        volado[SOL]=1;

        for (int i=0; i<LANZAMIENTOS; i++){
            lanzamiento=random.nextInt(2)+1;
            volado[lanzamiento]=volado[lanzamiento]+1;
            /*if (lanzamiento==AGUILA){
                volado[AGUILA]+=1;
            }if (lanzamiento==SOL){
                volado[SOL]+=1;
            }*/
        }
        System.out.println("Aguila cayo "+volado[AGUILA]+" veces");
        System.out.println("Sol cayo "+volado[SOL]+" veces");;
    }
}

