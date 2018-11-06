class ExampleClass01
{
  public static int wtf_maker(int a, int b, int c)                // 1 pkt (metoda)
  {
    if (a > 0 && b > 0 && c > 0) wtf_maker(a-1, b-1, c-1);        // 3 pkt (po 1 pkt za każde wyrażenie)
    else if (a > 0 && b > 0 && c < 0) wtf_maker(a-1, b-1, c+1);   // 3 pkt (po 1 pkt za każde wyrażenie)
    else if (a > 0 && b < 0 && c > 0) wtf_maker(a-1, b+1, c-1);   // 3 pkt (po 1 pkt za każde wyrażenie)
    else if (a > 0 && b < 0 && c < 0) wtf_maker(a-1, b+1, c+1);   // 3 pkt (po 1 pkt za każde wyrażenie)
    else if (a < 0 && b > 0 && c > 0) wtf_maker(a+1, b-1, c-1);   // 3 pkt (po 1 pkt za każde wyrażenie)
    else if (a < 0 && b > 0 && c < 0) wtf_maker(a+1, b-1, c+1);   // 3 pkt (po 1 pkt za każde wyrażenie)
    else if (a < 0 && b < 0 && c > 0) wtf_maker(a+1, b+1, c-1);   // 3 pkt (po 1 pkt za każde wyrażenie)
    else if (a < 0 && b < 0 && c < 0) wtf_maker(a+1, b+1, c+1);   // 3 pkt (po 1 pkt za każde wyrażenie)
    else if (a == 0 && b == 0 && c == 0) return 0;                // 3 pkt (po 1 pkt za każde wyrażenie)
    return 0;
  }                                                               // razem: 28 pkt

  public static void main (String[] args)
  {
    wtf_maker(10, 20, 30);
  }
}
