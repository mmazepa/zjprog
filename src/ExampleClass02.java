class ExampleClass02
{
  public static int wtf_maker(int a, int b, int c)
  {
    if (a > 0) { if (b > 0) wtf_maker(a-1,b-1,c); if (c > 0) wtf_maker(a-1,b,c-1); }
    else if (b > 0) { if (a > 0) wtf_maker(a-1,b-1,c); if (c > 0) wtf_maker(a,b-1,c-1); }
    else if (c > 0) { if (a > 0) wtf_maker(a-1,b,c-1); if (b > 0) wtf_maker(a,b-1,c-1); }

    if (a < 0) { if (b < 0) wtf_maker(a+1,b+1,c); if (c < 0) wtf_maker(a+1,b,c+1); }
    else if (b < 0) { if (a < 0) wtf_maker(a+1,b+1,c); if (c < 0) wtf_maker(a,b+1,c+1); }
    else if (c < 0) { if (a < 0) wtf_maker(a+1,b,c+1); if (b < 0) wtf_maker(a,b+1,c+1); }

    if (a == 0 && b == 0 && c == 0) return 0;
    return 0;
  }

  public static void main (String[] args)
  {
    wtf_maker(10, 20, 30);
  }
}
