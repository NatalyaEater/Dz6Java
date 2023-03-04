import java.util.Random;

public class modulmap {

    public static int[][] massiv(int lenI,int lenJ) {
        int[][] ar1 = new int[lenI][lenJ];
        for (int i = 0; i < lenI; i++) {
            for (int j = 0; j < lenJ; j++) {
                ar1[i][j] = 1;
            }
        }
        return ar1;
    }
    
    public static int [][] randomIJ(int[][] args) {
    Random p = new Random();
    var min=ui.col-1;
    var min2=ui.row-1;


    for (int y=0; y <= min || y<=min2 ; y++){
        var i=p.nextInt(ui.col);
        var j=p.nextInt(ui.col);
        if ((args[i][j] != 0) && (i != ui.exitX)  && (j != ui.exitY) && (i != ui.catX) && (j != ui.catY)){
            args[i][j]= 0;
        }
    }
    return args;
    }
    
    public static void newMap(int[][] args,int lenI,int lenJ) {
    for (int i = 0; i < lenI; i++) {
         for (int j = 0; j < lenJ; j++) {
                System.out.print(args[i][j]+"  ");
         }
         System.out.print("\n");
        }
    }
    
}
