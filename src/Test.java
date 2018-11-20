public class Test
{
  public static void main (String[] args)
  {
    System.out.println(true.getClass());                      // error: boolean cannot be dereferenced
    System.out.println(new Boolean(true).getClass());         // class java.lang.Boolean
    System.out.println(new Boolean(true) instanceof Boolean); // true
    System.out.println(0==0);                                 // true
    System.out.println((0==0).getClass());                    // error: boolean cannot be dereferenced
  }
}
