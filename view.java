import java.util.ArrayList;;

public class view {
    
    public static int [][] vesaLi(int [][]map,int x1,int x2,int y1,int y2){
        
        int[][] arVesa = new int[ui.row][ui.col];
        int ves=1;
        arVesa[x1][x2]=ves;

        while (arVesa[y1][y2]==0){
            for (int i=0;i<=ui.row-1;i++){
                for (int j=0;j<=ui.col-1;j++){
                    if (arVesa[i][j]==ves){
                        ves++;
                        if (i+1<=ui.row-1 && j<=ui.col-1){
                            if(i+1>=0 && j>=0){
                                if (arVesa[i+1][j] == 0){
                                    if (map[i+1][j] != 0){
                                        arVesa[i+1][j]=ves;
                                    }
                                }
                            }
                        }
                        if (i-1<=ui.row-1 && j<=ui.col-1){
                            if(i-1>=0 && j>=0){
                                if (arVesa[i-1][j] == 0){
                                    if (map[i-1][j] != 0){
                                        arVesa[i-1][j]=ves;
                                    }
                                }
                            }
                        }
                        if (i<=ui.row-1 && j-1<=ui.col-1){
                            if(i>=0 && j-1>=0){
                                if (arVesa[i][j-1] == 0){
                                    if (map[i][j-1] != 0){
                                        arVesa[i][j-1]=ves;
                                    }
                                }
                            }
                        }
                        if (i<=ui.row-1 && j+1<=ui.col-1){
                            if(i>=0 && j+1>=0){
                                if (arVesa[i][j+1] == 0){
                                    if (map[i][j+1] != 0){
                                        arVesa[i][j+1]=ves;
                                    }
                                }
                            }
                        }
                        ves--;
                    }
                }
            }
            ves++;
        }
        return arVesa;
    }

public static int [][] reverse(int [][] mapVes, int[][] map,int x1, int x2, int y1, int y2){
    int ves = mapVes[y1][y2];
    ArrayList<Integer> result = new ArrayList<Integer>();
    result.add(map[y1][y2]);
    map[y1][y2] = 8;
    int i = y1;
    int j = y2;
    if (ves != 0){
        while (ves > 1){
            if (mapVes[i][j] == ves){
                if ((i-1<=ui.row-1 && j<=ui.col-1) && (i-1>=0 && j>=0) && (mapVes[i-1][j] == ves-1)){
                    i--;
                    ves--;
                    map[i][j] = 8;
                }
                else if ((i+1<=ui.row-1 && j<=ui.col-1) && (i+1>=0 && j>=0) && (mapVes[i+1][j] == ves-1)){
                    i++;
                    ves--;
                    map[i][j] = 8;
                }
                else if ((i<=ui.row-1 && j-1<=ui.col-1) && (i>=0 && j-1>=0) && (mapVes[i][j-1] == ves-1)){
                    j--;
                    ves--;
                    map[i][j] = 8;
                }
                else if ((i<=ui.row-1 && j+1<=ui.col-1) && (i>=0 && j+1>=0) && (mapVes[i][j+1] == ves-1)){
                    j++;
                    ves--;
                    map[i][j] = 8;
                }
                
            }
            System.out.println("Координаты : х = " +i +  "  у = "+j+"  ; ");
        }
    }

    System.out.println("\n");
    System.out.println("Карта с кратчайщим путем : ");
    return map;
}
}