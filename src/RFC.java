import java.util.*;

public class RFC
{
  public static void main(String[] args)
  {
      // Response For a Class (RFC, odpowiedzialność danej klasy)
      // jest miarą potencjalnej komunikacji pomiędzy klasą a jej
      // środowiskiem:

      // [wzór] Zestaw metryk CK > RFC
      // https://pl.wikipedia.org/wiki/Metryka_oprogramowania

      // gdzie TM oznacza całkowitą liczbę metod w klasie (total methods),
      // TS – liczbę podklas (total subclasses), a TCj – całkowitą liczbę
      // metod w podklasie j. Jest to więc liczba metod, które mogą
      // potencjalnie zostać wysłane w odpowiedzi na dowolny komunikat
      // wysłany do obiektu danej klasy. Wysoka wartość RFC oznacza większą
      // funkcjonalność, ale zarazem i wyższą złożoność. Należy unikać zbyt
      // wysokich wartości RFC, które zazwyczaj utrudniają weryfikację
      // i testowanie klasy.

      ArrayDeque ad = new ArrayDeque();
      ArrayList al = new ArrayList();
      BitSet bs = new BitSet();
      HashMap hm = new HashMap();
      HashSet hs = new HashSet();
      Hashtable ht = new Hashtable();
      IdentityHashMap ihm = new IdentityHashMap();
      LinkedHashMap lhm = new LinkedHashMap();
      LinkedHashSet lhs = new LinkedHashSet();
      LinkedList ll = new LinkedList();
      String s = new String();
      Random r = new Random();
      RFC hw = new RFC();
      Stack st = new Stack();
      Timer t = new Timer();
      TreeMap tm = new TreeMap();
      TreeSet ts = new TreeSet();
      Vector v = new Vector();

      System.exit(0);
  }
}
