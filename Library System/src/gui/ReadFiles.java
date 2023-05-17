package gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReadFiles {

    public static AddNewBook[] ReadBook() throws FileNotFoundException {
        int count = 0;
        AddNewBook x[] = new AddNewBook[100];
        File f = new File("Books.txt");
        try (Scanner myReader = new Scanner(f)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                StringTokenizer st = new StringTokenizer(data, ",");
                x[count] = new AddNewBook(st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken());
                count++;
            }
            myReader.close();
        }
        return x;
    }

    public static int ReadBookCount() throws FileNotFoundException {
        int count = 0;
        AddNewBook x[] = new AddNewBook[100];
        File f = new File("Books.txt");
        try (Scanner myReader = new Scanner(f)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                StringTokenizer st = new StringTokenizer(data, ",");
                x[count] = new AddNewBook(st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken());
                count++;
            }
            myReader.close();
        }
        return count;
    }
    public static AddNewIssuedBook[] ReadIssuedBook() throws FileNotFoundException
    {
        int count =0;
        AddNewIssuedBook x[]=new AddNewIssuedBook[100];
        
        File f = new File("IssueBooks.txt");
        try (Scanner myReader = new Scanner(f)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                StringTokenizer st = new StringTokenizer(data, ",");
                x[count] = new AddNewIssuedBook(st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken());
                count++;
            }
            myReader.close();
        }
            return x;
    }
    public static int ReadIssuedBookCount() throws FileNotFoundException
    {
        int count =0;
        AddNewIssuedBook x[]=new AddNewIssuedBook[100];
        
        File f = new File("IssueBooks.txt");
        try (Scanner myReader = new Scanner(f)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                StringTokenizer st = new StringTokenizer(data, ",");
                x[count] = new AddNewIssuedBook(st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken());
                count++;
            }
            myReader.close();
        }
            return count;
    }
    public static AddNewLibrarian[] ReadLibrarian() throws FileNotFoundException
    {
        int count =0;
        AddNewLibrarian x[]=new AddNewLibrarian[100];
        
        File f = new File("Librarians.txt");
        try (Scanner myReader = new Scanner(f)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                StringTokenizer st = new StringTokenizer(data, ",");
                x[count] = new AddNewLibrarian(st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken());
                count++;
            }
            myReader.close();
        }
            return x;
    }
    public static int ReadLibrarianCount() throws FileNotFoundException
    {
        int count =0;
        AddNewLibrarian x[]=new AddNewLibrarian[100];
        
        File f = new File("Librarians.txt");
        try (Scanner myReader = new Scanner(f)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                StringTokenizer st = new StringTokenizer(data, ",");
                x[count] = new AddNewLibrarian(st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken());
                count++;
            }
            myReader.close();
        }
            return count;
    }
        public static AddNewStudent[] ReadStudent() throws FileNotFoundException
    {
        int count =0;
        AddNewStudent x[]=new AddNewStudent[100];
        File f = new File("Students.txt");
        try (Scanner myReader = new Scanner(f)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                StringTokenizer st = new StringTokenizer(data, ",");
                x[count] = new AddNewStudent(st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken());
                count++;
            }
            myReader.close();
        }
            return x;
    }
        public static int ReadStudentCount() throws FileNotFoundException
    {
        int count =0;
        AddNewStudent x[]=new AddNewStudent[100];
        File f = new File("Students.txt");
        try (Scanner myReader = new Scanner(f)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                StringTokenizer st = new StringTokenizer(data, ",");
                x[count] = new AddNewStudent(st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken(),
                        st.nextToken());
                count++;
            }
            myReader.close();
        }
            return count;
    }

}
