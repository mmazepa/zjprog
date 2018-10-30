class ExampleClass01
{
  public static int wtf_maker(int a, int b, int c)
  {
    if (a >= 0 && b >= 0 && c >= 0)
    {
      if (a == 0 && b == 0 && c == 0) return 0;
      else wtf_maker(a-1, b-1, c-1);
    }
    else if (a >= 0 && b >= 0 && c < 0) wtf_maker(a-1, b-1, c+1);
    else if (a >= 0 && b < 0 && c >= 0) wtf_maker(a-1, b+1, c-1);
    else if (a >= 0 && b < 0 && c < 0) wtf_maker(a-1, b+1, c+1);
    else if (a < 0 && b >= 0 && c >= 0) wtf_maker(a+1, b-1, c-1);
    else if (a < 0 && b >= 0 && c < 0) wtf_maker(a+1, b-1, c+1);
    else if (a < 0 && b < 0 && c >= 0) wtf_maker(a+1, b+1, c-1);
    else if (a < 0 && b < 0 && c < 0) wtf_maker(a+1, b+1, c+1);
    else if (a == 0 && b == 0 && c == 0) return 0;
    return 0;
  }

  public static void main (String[] args)
  {
    wtf_maker(10, 20, 30);
  }
}
