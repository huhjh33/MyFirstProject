package com.examplehjh;

import com.examplehjh.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("hi han");
        System.out.printf("%s  %d\n\n", "aaaa", 11);

        List myList = new List();

        myList.add("aaa1");
        myList.add("aaa2");
        myList.add("aaa3");
        myList.add("aaa4");
        myList.add("aaa5");
        myList.add("aaa6");
        myList.add("aaa7");
        myList.add("aaa8");
        myList.add("aaa9");
        myList.add("aaa10");
        myList.add("aaa11");

        System.out.println(myList.get(8));
        System.out.println(myList);
        System.out.println(myList.toString());
    }
}
