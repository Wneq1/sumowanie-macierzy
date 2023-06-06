class Main {
  public static void main(String[] args) {
    int[][] macierz = {
        {  1,  2,  3,  4 },
        {  5,  6,  7,  8 },
        {  9, 10, 11, 12 },
        { 13, 14, 15, 16 }
    };

    for (int rzad = 0; rzad < macierz.length; rzad++) {
      for (int kolumna = 0; kolumna < macierz[rzad].length; kolumna++) {
        System.out.print(macierz[rzad][kolumna] + "\t");
      }
      System.out.println(); 
    }
    
    int suma = 0;
    for (int rzad = 0; rzad < macierz.length; rzad++) {
      for (int kolumna = 0; kolumna < macierz[rzad].length; kolumna++) {
        suma += macierz[rzad][kolumna];
      }
    }

    
    System.out.println("Suma elementów w macierzy: " + suma);
  }
}