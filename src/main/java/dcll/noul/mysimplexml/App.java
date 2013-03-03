package dcll.noul.mysimplexml;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {       
    System.out.println("deb main");
    Parseur xmlparser = new Parseur();
    xmlparser.parser(args[0]);
    }
}
