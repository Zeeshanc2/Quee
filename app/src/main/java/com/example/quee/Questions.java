package com.example.quee;

public class Questions {

    //Android Questions

    private String[] androidQuestion = new String[10];
    private String[] androidQuestion1Option = new String[4];
    private String[] androidQuestion2Option = new String[4];
    private String[] androidQuestion3Option = new String[4];
    private String[] androidQuestion4Option = new String[4];
    private String[] androidQuestion5Option = new String[4];
    private String[] androidQuestion6Option = new String[4];
    private String[] androidQuestion7Option = new String[4];
    private String[] androidQuestion8Option = new String[4];
    private String[] androidQuestion9Option = new String[4];
    private String[] androidQuestion10Option = new String[4];

    //C# Questions

    private String[] cSharpQuestion = new String[10];
    private String[] cSharpQuestion1Option = new String[4];
    private String[] cSharpQuestion2Option = new String[4];
    private String[] cSharpQuestion3Option = new String[4];
    private String[] cSharpQuestion4Option = new String[4];
    private String[] cSharpQuestion5Option = new String[4];
    private String[] cSharpQuestion6Option = new String[4];
    private String[] cSharpQuestion7Option = new String[4];
    private String[] cSharpQuestion8Option = new String[4];
    private String[] cSharpQuestion9Option = new String[4];
    private String[] cSharpQuestion10Option = new String[4];

    // Sql Database

    private String[] sqlDatabaseQuestion = new String[10];
    private String[] sqlDatabaseQuestion1Option = new String[4];
    private String[] sqlDatabaseQuestion2Option = new String[4];
    private String[] sqlDatabaseQuestion3Option = new String[4];
    private String[] sqlDatabaseQuestion4Option = new String[4];
    private String[] sqlDatabaseQuestion5Option = new String[4];
    private String[] sqlDatabaseQuestion6Option = new String[4];
    private String[] sqlDatabaseQuestion7Option = new String[4];
    private String[] sqlDatabaseQuestion8Option = new String[4];
    private String[] sqlDatabaseQuestion9Option = new String[4];
    private String[] sqlDatabaseQuestion10Option = new String[4];

    //Data Structures

    private String[] dataStructuresQuestion = new String[10];
    private String[] dataStructuresQuestion1Option = new String[4];
    private String[] dataStructuresQuestion2Option = new String[4];
    private String[] dataStructuresQuestion3Option = new String[4];
    private String[] dataStructuresQuestion4Option = new String[4];
    private String[] dataStructuresQuestion5Option = new String[4];
    private String[] dataStructuresQuestion6Option = new String[4];
    private String[] dataStructuresQuestion7Option = new String[4];
    private String[] dataStructuresQuestion8Option = new String[4];
    private String[] dataStructuresQuestion9Option = new String[4];
    private String[] dataStructuresQuestion10Option = new String[4];

    //Android Get Methods

    public String[] getAndroidQuestion() {
        androidQuestion[0]="How to kill an activity in Android?";
        androidQuestion[1]="Which of the following is/are are the subclasses in Android?";
        androidQuestion[2]="What is the time limit of broadcast receiver in android?";
        androidQuestion[3]="Persist data can be stored in Android through?";
        androidQuestion[4]="How many ports are allocated for new emulator?";
        androidQuestion[5]="What is the package name of HTTP client in android?";
        androidQuestion[6]="Can a class be immutable in android?";
        androidQuestion[7]="A type of service provided by android that shows messages and alerts to user is?";
        androidQuestion[8]="One of application component, that manages application's background services is called";
        androidQuestion[9]="In android studio, callback that is called when activity interaction with user is started is";
        return androidQuestion;
    }

    public String[] getAndroidQuestion1Option() {
        androidQuestion1Option[0]="finish()";
        androidQuestion1Option[1]="B - finishActivity(int requestCode)";
        androidQuestion1Option[2]="A & B";
        androidQuestion1Option[3]="kill()";
        return androidQuestion1Option;
    }

    public String[] getAndroidQuestion2Option() {
        androidQuestion2Option[0]="Action Bar Activity";
        androidQuestion2Option[1]="Launcher Activity";
        androidQuestion2Option[2]="Preference Activity";
        androidQuestion2Option[3]="All of above";
        return androidQuestion2Option;
    }

    public String[] getAndroidQuestion3Option() {
        androidQuestion3Option[0]="10 sec";
        androidQuestion3Option[1]="15 sec";
        androidQuestion3Option[2]="5 sec";
        androidQuestion3Option[3]="1 hour";
        return androidQuestion3Option;
    }

    public String[] getAndroidQuestion4Option() {
        androidQuestion4Option[0]="Shared Preferences";
        androidQuestion4Option[1]="Internal/External storage";
        androidQuestion4Option[2]="SQlite";
        androidQuestion4Option[3]="All of above";
        return androidQuestion4Option;
    }

    public String[] getAndroidQuestion5Option() {
        androidQuestion5Option[0]="2";
        androidQuestion5Option[1]="0";
        androidQuestion5Option[2]="10";
        androidQuestion5Option[3]="None of above";
        return androidQuestion5Option;
    }

    public String[] getAndroidQuestion6Option() {
        androidQuestion6Option [0]="com.json";
        androidQuestion6Option [1]="org.apache.http.client";
        androidQuestion6Option [2]="com.android.JSON";
        androidQuestion6Option [3]="org.json";
        return androidQuestion6Option;
    }

    public String[] getAndroidQuestion7Option() {
        androidQuestion7Option [0]="No, it can't";
        androidQuestion7Option [1]="Yes, Class can be immutable";
        androidQuestion7Option [2]="Can't make the class as final class";
        androidQuestion7Option [3]="None of the above";
        return androidQuestion7Option;
    }

    public String[] getAndroidQuestion8Option() {
        androidQuestion8Option [0]="Content Providers";
        androidQuestion8Option [1]="View System";
        androidQuestion8Option [2]="Notifications Manager";
        androidQuestion8Option [3]="Activity Manager";
        return androidQuestion8Option;
    }

    public String[] getAndroidQuestion9Option() {
        androidQuestion9Option [0]="Activities";
        androidQuestion9Option [1]="Broadcast Receivers";
        androidQuestion9Option [2]="Services";
        androidQuestion9Option [3]="Content Providers";
        return androidQuestion9Option;
    }

    public String[] getAndroidQuestion10Option() {
        androidQuestion10Option[0]="onStart";
        androidQuestion10Option[1]="onStop";
        androidQuestion10Option[2]="onResume";
        androidQuestion10Option[3]="onDestroy";
        return androidQuestion10Option;
    }

    // C Sharp Get Methods

    public String[] getcSharpQuestion() {
        cSharpQuestion[0] = "The CLR is physically represented by an assembly named?";
        cSharpQuestion[1] = "Which language allows more than one method in a single class?";
        cSharpQuestion[2] = "In C#, a subroutine is called a?";
        cSharpQuestion[3] = "All C# applications begin execution by calling the which method?";
        cSharpQuestion[4] = "A _______ is an identifier that denotes a storage location?";
        cSharpQuestion[5] = "_________ are reserved, and cannot be used as identifiers?";
        cSharpQuestion[6] = "Boxing converts a value type on the stack to an ______ on the heap?";
        cSharpQuestion[7] = "In C#, all binary operators are ______?";
        cSharpQuestion[8] = "An _______ is a symbol that tells the computer to perform certain mathematical or logical manipulations?";
        cSharpQuestion[9] = "A _____ is any valid C# variable ending with a colon?";
        return cSharpQuestion;
    }

    public String[] getcSharpQuestion1Option() {
        cSharpQuestion1Option[0]="mscoree.dll";
        cSharpQuestion1Option[1]="mcoree.dll";
        cSharpQuestion1Option[2]="msoree.dll";
        cSharpQuestion1Option[3]="mscor.dll";
        return cSharpQuestion1Option;
    }

    public String[] getcSharpQuestion2Option() {
        cSharpQuestion2Option[0]="C#";
        cSharpQuestion2Option[1]="J#";
        cSharpQuestion2Option[2]="C++";
        cSharpQuestion2Option[3]="C";
        return cSharpQuestion2Option;
    }

    public String[] getcSharpQuestion3Option() {
        cSharpQuestion3Option[0]="Function";
        cSharpQuestion3Option[1]="Metadata";
        cSharpQuestion3Option[2]="Method";
        cSharpQuestion3Option[3]="Manage code";
        return cSharpQuestion3Option;
    }

    public String[] getcSharpQuestion4Option() {
        cSharpQuestion4Option[0]="Class()";
        cSharpQuestion4Option[1]="Main()";
        cSharpQuestion4Option[2]="Submain";
        cSharpQuestion4Option[3]="Namespace";
        return cSharpQuestion4Option;
    }

    public String[] getcSharpQuestion5Option() {
        cSharpQuestion5Option[0]="Constant";
        cSharpQuestion5Option[1]="Reference type";
        cSharpQuestion5Option[2]="Variable";
        cSharpQuestion5Option[3]="Object";
        return cSharpQuestion5Option;
    }

    public String[] getcSharpQuestion6Option() {
        cSharpQuestion6Option[0]="Keywords";
        cSharpQuestion6Option[1]="Literal";
        cSharpQuestion6Option[2]="Variable";
        cSharpQuestion6Option[3]="Identifiers";
        return cSharpQuestion6Option;
    }

    public String[] getcSharpQuestion7Option() {
        cSharpQuestion7Option[0]="Bool type";
        cSharpQuestion7Option[1]="Instance type";
        cSharpQuestion7Option[2]="Class type";
        cSharpQuestion7Option[3]="Object type";
        return cSharpQuestion7Option;
    }

    public String[] getcSharpQuestion8Option() {
        cSharpQuestion8Option[0]="Center-associate";
        cSharpQuestion8Option[1]="Right-associate";
        cSharpQuestion8Option[2]="Left-associate";
        cSharpQuestion8Option[3]="Top-associate";
        return cSharpQuestion8Option;
    }

    public String[] getcSharpQuestion9Option() {
        cSharpQuestion9Option[0]="Operator";
        cSharpQuestion9Option[1]="Expression";
        cSharpQuestion9Option[2]="Condition";
        cSharpQuestion9Option[3]="Logic";
        return cSharpQuestion9Option;
    }

    public String[] getcSharpQuestion10Option() {
        cSharpQuestion10Option[0]="goto";
        cSharpQuestion10Option[1]="Lable";
        cSharpQuestion10Option[2]="Logical";
        cSharpQuestion10Option[3]="Bitwise";
        return cSharpQuestion10Option;
    }

    // Sql Database Get Methods


    public String[] getSqlDatabaseQuestion() {
        sqlDatabaseQuestion[0]="Related fields in a database are grouped to form a";
        sqlDatabaseQuestion[1]="The database environment has all of the following components except:";
        sqlDatabaseQuestion[2]="The way a particular application views the data from the database that the application uses is a";
        sqlDatabaseQuestion[3]="A report generator is used to";
        sqlDatabaseQuestion[4]="A relational database developer refers to a record as";
        sqlDatabaseQuestion[5]="The method in which records are physically stored in a specified order according to a key field in each record is";
        sqlDatabaseQuestion[6]="A sub schema expresses";
        sqlDatabaseQuestion[7]="SET concept is used in :";
        sqlDatabaseQuestion[8]="Relational Algebra is";
        sqlDatabaseQuestion[9]="Key to represent relationship between tables is called";
        return sqlDatabaseQuestion;
    }

    public String[] getSqlDatabaseQuestion1Option() {
        sqlDatabaseQuestion1Option[0]="Data file";
        sqlDatabaseQuestion1Option[1]="Data record";
        sqlDatabaseQuestion1Option[2]="Menu";
        sqlDatabaseQuestion1Option[3]="Bank";
        return sqlDatabaseQuestion1Option;
    }

    public String[] getSqlDatabaseQuestion2Option() {
        sqlDatabaseQuestion2Option[0]="Users";
        sqlDatabaseQuestion2Option[1]="Separate files";
        sqlDatabaseQuestion2Option[2]="Database";
        sqlDatabaseQuestion2Option[3]="Database administrator";
        return sqlDatabaseQuestion2Option;
    }

    public String[] getSqlDatabaseQuestion3Option() {
        sqlDatabaseQuestion3Option[0]="Module";
        sqlDatabaseQuestion3Option[1]="Relational Model";
        sqlDatabaseQuestion3Option[2]="Schema";
        sqlDatabaseQuestion3Option[3]="Sub Schema";
        return sqlDatabaseQuestion3Option;
    }

    public String[] getSqlDatabaseQuestion4Option() {
        sqlDatabaseQuestion4Option[0]="Update files.";
        sqlDatabaseQuestion4Option[1]="Print files on paper";
        sqlDatabaseQuestion4Option[2]="Data entry";
        sqlDatabaseQuestion4Option[3]="Delete files";
        return sqlDatabaseQuestion4Option;
    }

    public String[] getSqlDatabaseQuestion5Option() {
        sqlDatabaseQuestion5Option[0]="A criteria.";
        sqlDatabaseQuestion5Option[1]="A relation";
        sqlDatabaseQuestion5Option[2]="A tuple";
        sqlDatabaseQuestion5Option[3]="An attribute";
        return sqlDatabaseQuestion5Option;
    }

    public String[] getSqlDatabaseQuestion6Option() {
        sqlDatabaseQuestion6Option[0]="Hash";
        sqlDatabaseQuestion6Option[1]="Direct.";
        sqlDatabaseQuestion6Option[2]="Sequential";
        sqlDatabaseQuestion6Option[3]="All of the above";
        return sqlDatabaseQuestion6Option;
    }

    public String[] getSqlDatabaseQuestion7Option() {
        sqlDatabaseQuestion7Option[0]="The logical view";
        sqlDatabaseQuestion7Option[1]="The physical view";
        sqlDatabaseQuestion7Option[2]="The external view";
        sqlDatabaseQuestion7Option[3]="All of the above";
        return sqlDatabaseQuestion7Option;
    }

    public String[] getSqlDatabaseQuestion8Option() {
        sqlDatabaseQuestion8Option[0]="Network Model";
        sqlDatabaseQuestion8Option[1]="Hierarchical Model";
        sqlDatabaseQuestion8Option[2]="Relational Model";
        sqlDatabaseQuestion8Option[3]="None of these";
        return sqlDatabaseQuestion8Option;
    }

    public String[] getSqlDatabaseQuestion9Option() {
        sqlDatabaseQuestion9Option[0]="Data Definition Language";
        sqlDatabaseQuestion9Option[1]="Meta Language";
        sqlDatabaseQuestion9Option[2]="Procedural query Language";
        sqlDatabaseQuestion9Option[3]="None of the above";
        return sqlDatabaseQuestion9Option;
    }

    public String[] getSqlDatabaseQuestion10Option() {
        sqlDatabaseQuestion10Option[0]="Primary key";
        sqlDatabaseQuestion10Option[1]="Secondary key";
        sqlDatabaseQuestion10Option[2]="Foreign Key";
        sqlDatabaseQuestion10Option[3]="None of these";
        return sqlDatabaseQuestion10Option;
    }

    //Data Structures Get Methods


    public String[] getDataStructuresQuestion() {
        dataStructuresQuestion[0]="Which if the following is/are the levels of implementation of data structure";
        dataStructuresQuestion[1]="A binary search tree whose left subtree and right subtree differ in height by at most 1 unit is called";
        dataStructuresQuestion[2]="Stack is also called as";
        dataStructuresQuestion[3]="___________ is not the component of data structure?";
        dataStructuresQuestion[4]="Which of the following is not the part of ADT description?";
        dataStructuresQuestion[5]="___________ is a pile in which items are added at one end and removed from the other";
        dataStructuresQuestion[6]="___________ is very useful in situation when data have to stored and then retrieved in reverse order.";
        dataStructuresQuestion[7]="Which data structure allows deleting data elements from and inserting at rear?";
        dataStructuresQuestion[8]="Which of the following data structure can’t store the non-homogeneous data elements?";
        dataStructuresQuestion[9]="Which of the following is non-liner data structure?";
        return dataStructuresQuestion;
    }

    public String[] getDataStructuresQuestion1Option() {
        dataStructuresQuestion1Option[0]="Abstract level";
        dataStructuresQuestion1Option[1]="Application level";
        dataStructuresQuestion1Option[2]="Implementation Level";
        dataStructuresQuestion1Option[3]="All of the above";
        return dataStructuresQuestion1Option;
    }

    public String[] getDataStructuresQuestion2Option() {
        dataStructuresQuestion2Option[0]="AVL tree";
        dataStructuresQuestion2Option[1]="Red-black tree";
        dataStructuresQuestion2Option[2]="Lemma tree";
        dataStructuresQuestion2Option[3]="None of the above";
        return dataStructuresQuestion2Option;
    }

    public String[] getDataStructuresQuestion3Option() {
        dataStructuresQuestion3Option[0]="Last in first out";
        dataStructuresQuestion3Option[1]="First in last out";
        dataStructuresQuestion3Option[2]="Last in last out";
        dataStructuresQuestion3Option[3]="First in first out";
        return dataStructuresQuestion3Option;
    }

    public String[] getDataStructuresQuestion4Option() {
        dataStructuresQuestion4Option[0]="Operations";
        dataStructuresQuestion4Option[1]="Storage Structures";
        dataStructuresQuestion4Option[2]="Algorithms";
        dataStructuresQuestion4Option[3]="None of the above";
        return dataStructuresQuestion4Option;
    }

    public String[] getDataStructuresQuestion5Option() {
        dataStructuresQuestion5Option[0]="Data";
        dataStructuresQuestion5Option[1]="Operations";
        dataStructuresQuestion5Option[2]="Both of the above";
        dataStructuresQuestion5Option[3]="None of the above";
        return dataStructuresQuestion5Option;
    }

    public String[] getDataStructuresQuestion6Option() {
        dataStructuresQuestion6Option[0]="Stack";
        dataStructuresQuestion6Option[1]="Queue";
        dataStructuresQuestion6Option[2]="List";
        dataStructuresQuestion6Option[3]="None of the above";
        return dataStructuresQuestion6Option;
    }

    public String[] getDataStructuresQuestion7Option() {
        dataStructuresQuestion7Option[0]="Stack";
        dataStructuresQuestion7Option[1]="Queue";
        dataStructuresQuestion7Option[2]="List";
        dataStructuresQuestion7Option[3]="Linked List";
        return dataStructuresQuestion7Option;
    }

    public String[] getDataStructuresQuestion8Option() {
        dataStructuresQuestion8Option[0]="Stacks";
        dataStructuresQuestion8Option[1]="Queues";
        dataStructuresQuestion8Option[2]="Dequeues";
        dataStructuresQuestion8Option[3]="Binary search tree";
        return dataStructuresQuestion8Option;
    }

    public String[] getDataStructuresQuestion9Option() {
        dataStructuresQuestion9Option[0]="Arrays";
        dataStructuresQuestion9Option[1]="Records";
        dataStructuresQuestion9Option[2]="Pointers";
        dataStructuresQuestion9Option[3]="Stacks";
        return dataStructuresQuestion9Option;
    }

    public String[] getDataStructuresQuestion10Option() {
        dataStructuresQuestion10Option[0]="Stacks";
        dataStructuresQuestion10Option[1]="List";
        dataStructuresQuestion10Option[2]="Strings";
        dataStructuresQuestion10Option[3]="Trees";
        return dataStructuresQuestion10Option;
    }
}
