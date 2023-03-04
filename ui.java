import java.util.Scanner;

public class ui {
        public static int row=10;
        public static int col=10;
        public static int exitX=0;
        public static int exitY=0;
        public static int catX=0;
        public static int catY=0;

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Задайте размерность поля по оси Х : ");
        row=Scanner.nextInt();
        System.out.print("Задайте размерность поля по оси  Y : ");
        col=Scanner.nextInt();
        System.out.print("Задайте начальные координаты старта для по оси Х : ");
        catX=Scanner.nextInt();
        System.out.print("Задайте начальные координаты старта для по оси Y : ");
        catY=Scanner.nextInt();
        System.out.print("Задайте конечные координаты финиша для по оси Х  :");
        exitX=Scanner.nextInt();
        System.out.print("Задайте начальные координаты финиша для по оси Y : ");
        exitY=Scanner.nextInt();

        Scanner.close();
        

        var createMap= modulmap.randomIJ(modulmap.massiv(row, col));
        System.out.println("Построение рандомной карты : ");
        modulmap.newMap(createMap,row,col);

        var mapToEnd = view.vesaLi(createMap, catX, catY, exitX, exitY);

        System.out.print("\n");
        System.out.println("Заполнение карты весами по волновому алгоритму: ");

        modulmap.newMap(mapToEnd, row, col);
        System.out.print("\n");
        
        System.out.println("Координаты точек движения для кратчайшего пути : ");
        System.out.println("Координаты : х = "+exitX + "  у = "+exitY +"  ;  ");
        var fin=view.reverse(mapToEnd, createMap, catX, catY, exitX, exitY);
        modulmap.newMap(fin,row, col);
    
    }
}

