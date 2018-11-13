// metoda zliczająca ilość potrzebnych kroków, aby wrócić do punktu (0,0,0)
// przykładowe wykorzystanie: gra wykorzystująca układ współrzędnych
int steps = 0;
public static int count_steps(int x, int y, int z) {                           // 1=1(metoda)
  if (x > 0 && y > 0 && z > 0) { steps += 3; count_steps(x-1, y-1, z-1); }     // 3=1(if)+1(&&)+1(&&)
  else if (x > 0 && y > 0 && z == 0) { steps += 2; count_steps(x-1, y-1, z); } // 3=1(if)+1(&&)+1(&&)
  else if (x > 0 && y == 0 && z > 0) { steps += 2; count_steps(x-1, y, z-1); } // 3=1(if)+1(&&)+1(&&)
  else if (x > 0 && y == 0 && z == 0) { steps += 1; count_steps(x-1, y, z); }  // 3=1(if)+1(&&)+1(&&)
  else if (x == 0 && y > 0 && z > 0) { steps += 2; count_steps(x, y-1, z-1); } // 3=1(if)+1(&&)+1(&&)
  else if (x == 0 && y > 0 && z == 0) { steps += 1; count_steps(x, y-1, z); }  // 3=1(if)+1(&&)+1(&&)
  else if (x == 0 && y == 0 && z > 0) { steps +=1;  count_steps(x, y, z-1); }  // 3=1(if)+1(&&)+1(&&)
  else if (x == 0 && y == 0 && z == 0) return steps;                           // 3=1(if)+1(&&)+1(&&)
}                                                                              // razem: 25
// przykładowe wywołanie:
// metoda zwraca ilość kroków z (10,20,15) do (0,0,0) najkrótszą drogą
int steps = count_steps(10,20,15);
