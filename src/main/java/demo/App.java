package demo;

import demo.sqlite.Connexion;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Connexion.bdConnexion();
    }
}