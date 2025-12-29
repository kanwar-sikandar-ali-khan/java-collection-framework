package com.exceptionalHandling;

import java.io.FileReader;
import java.io.FileNotFoundException;

/* ============================
   CUSTOM EXCEPTION
   ============================ */
class InvalidRollNoException extends Exception {
    public InvalidRollNoException(String message) {
        super(message);
    }
}

/* ============================
   STUDENT CLASS
   ============================ */
class StudentInfo {
    private String name;
    private Integer rollNo;

    public StudentInfo(String name, Integer rollNo) throws InvalidRollNoException {
        if (rollNo <= 0) {
            throw new InvalidRollNoException("Roll number must be greater than 0");
        }
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public Integer getRollNo() {
        return rollNo;
    }
}

/* ============================
   MAIN CLASS
   ============================ */
public class Example {

    // throws example (compile-time)
    static void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("test.txt"); // checked exception
    }

    public static void main(String[] args) {

        /* ===============================
           1️⃣ COMPILE-TIME EXCEPTION
           =============================== */
//        readFile();
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Compile-time Exception handled: " + e.getMessage());
        }

        /* ===============================
           2️⃣ RUNTIME EXCEPTION
           =============================== */
        try {
            int a = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Runtime Exception handled: Division by zero");
        }

        /* ===============================
           3️⃣ NULL POINTER EXCEPTION
           =============================== */
        try {
            StudentInfo s = null;
            System.out.println(s.getName());
        } catch (NullPointerException e) {
            System.out.println("Runtime Exception handled: NullPointerException");
        }

        /* ===============================
           4️⃣ CUSTOM EXCEPTION (throw)
           =============================== */
        try {
            StudentInfo s2 = new StudentInfo("Ayan", -1);
        } catch (InvalidRollNoException e) {
            System.out.println("Custom Exception handled: " + e.getMessage());
        }

        /* ===============================
           5️⃣ MULTIPLE CATCH + FINALLY
           =============================== */
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } catch (Exception e) {
            System.out.println("Generic Exception");
        } finally {
            System.out.println("Finally block always executes");
        }

        System.out.println("Program continues normally...");
    }
}


//🧠 WHAT THIS FILE COVERS (INTERVIEW CHECKLIST)
//        Concept	Covered
//        Compile-time exception	✅
//        Runtime exception	✅
//        try–catch	✅
//        multiple catch	✅
//        finally	✅
//        throw	✅
//        throws	✅
//        custom exception	✅
//        🎯 INTERVIEW ONE-LINERS (MEMORIZE)
//🔹 Compile-time Exception
//
//        Checked by compiler and must be handled using try-catch or throws.
//
//        🔹 Runtime Exception
//
//        Occurs during execution and is not checked by compiler.
//
//🔹 throw
//
//        Used to explicitly throw an exception.
//
//        🔹 throws
//
//        Used to declare exceptions to the calling method.
//
//        🔹 finally
//
//        Executes whether exception occurs or not.
//
//        🔹 Custom Exception
//
//        User-defined exception created by extending Exception.
//
//        🔥 MOST COMMON INTERVIEW QUESTIONS (YOU’RE READY)
//
//✔ Difference between Error & Exception
//✔ Checked vs Unchecked
//✔ throw vs throws
//✔ Can finally run without catch? → YES
//✔ Can we have multiple catch? → YES
//✔ Can we catch Exception class? → YES (but last)
//
//✅ FINAL TIP (VERY IMPORTANT)
//
//        Exception handling is about program safety, not error fixing.
//
//        Interviewers LOVE this line.
//
//        If you want next:
//
//        Spring Boot global exception handling (@ControllerAdvice)
//
//        Real REST API exception flow
//
//        Tricky interview MCQs