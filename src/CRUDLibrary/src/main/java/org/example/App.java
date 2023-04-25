package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;

        while (flag){
            System.out.println("0.EXIT");
            System.out.println("1.CREATE");
            System.out.println("2.RETRIEVE");
            System.out.println("3.UPDATE");
            System.out.println("4.DELETE");
            System.out.println("5.Book>Rs.400");
            System.out.println("6.Book with publisher name");
            System.out.println("7.Price between 200 and 400");
            System.out.println("8.Name like J");
            int choice = Integer.parseInt(sc.readLine());

            switch (choice){
                case 0:
                    flag=false;
                    break;

                case 1:
                    boolean flag1 = true;
                    while (flag1){
                        System.out.println("0.EXIT");
                        System.out.println("1.BOOK");
                        System.out.println("2.LIBRARY");
                        int choice1 = Integer.parseInt(sc.readLine());

                        switch (choice1){
                            case 0:
                                flag1=false;
                                break;

                            case 1:
                                OperationsBook.create();
                                break;

                            case 2:
                                OperationsLibrary.create();
                                break;

                            default:
                                System.out.println("INVALID INPUT!");
                                break;
                        }
                    }

                    break;

                case 2:
                    boolean flag2 = true;
                    while (flag2){
                        System.out.println("0.EXIT");
                        System.out.println("1.BOOK");
                        System.out.println("2.LIBRARY");
                        int choice2 = Integer.parseInt(sc.readLine());

                        switch (choice2){
                            case 0:
                                flag2=false;
                                break;

                            case 1:
                                OperationsBook.Retrieve();
                                break;

                            case 2:
                                OperationsLibrary.Retrieve();
                                break;

                            default:
                                System.out.println("INVALID INPUT!");
                                break;
                        }
                    }
                    break;

                case 3:
                    boolean flag3 = true;
                    while (flag3){
                        System.out.println("0.EXIT");
                        System.out.println("1.BOOK");
                        System.out.println("2.LIBRARY");
                        int choice3 = Integer.parseInt(sc.readLine());

                        switch (choice3){
                            case 0:
                                flag3=false;
                                break;

                            case 1:
                                OperationsBook.Update();
                                break;

                            case 2:
                                OperationsLibrary.Update();
                                break;

                            default:
                                System.out.println("INVALID INPUT!");
                                break;
                        }
                    }
                    break;

                case 4:
                    boolean flag4 = true;
                    while (flag4){
                        System.out.println("0.EXIT");
                        System.out.println("1.BOOK");
                        System.out.println("2.LIBRARY");
                        int choice4 = Integer.parseInt(sc.readLine());

                        switch (choice4){
                            case 0:
                                flag4=false;
                                break;

                            case 1:
                                OperationsBook.Delete();
                                break;

                            case 2:
                                OperationsLibrary.Delete();
                                break;

                            default:
                                System.out.println("INVALID INPUT!");
                                break;
                        }
                    }
                    break;

                case 5:
                    Query.Query1();
                    break;

                case 6:
                    Query.Query2();
                    break;


                case 7:
                    Query.Query3();
                    break;

                case 8:
                    Query.Query4();
                    break;

                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
    }
}

//Age Between
//Name LIKE