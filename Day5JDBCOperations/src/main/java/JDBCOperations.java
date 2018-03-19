import java.sql.*;
/**
*
* @author 648318
*/
public class JDBCOperations {
static Connection conn;
static PreparedStatement stmt;
static ResultSet rs;
static String USER = "root";
static String PASS = "";
public static void main(String [] args)
{
connectDB();
selectDB();
insertDB();
selectDB();

updateDB();
selectDB();

deleteDB();
selectDB();
closeDB();
}

static void connectDB()
{
try
{
Class.forName("com.mysql.jdbc.Driver");
conn = DriverManager.getConnection("jdbc:mysql://localhost/MADWinter18", USER, PASS);
}
catch(Exception ex)
{
ex.printStackTrace();
}
}

static void insertDB()
{
try{
   stmt=conn.prepareStatement("insert into Person values(?,?,?,?)");
   stmt.setInt(1,101); //1 specifies the first parameter in the query
   stmt.setString(2,"Mouse");
   stmt.setString(3, "Jr.");
   stmt.setInt(4, 3);
   
   int i = stmt.executeUpdate();
   System.out.println(i + "records inserted");
}

catch(SQLException se){
   se.printStackTrace();
}
}

static void selectDB()
{
try
{
stmt = conn.prepareStatement("SELECT * FROM person");
rs = stmt.executeQuery();

while(rs.next())
{
System.out.println("ID: " +rs.getInt(1)+ " Name: " +rs.getString("FirstName")+ "" +rs.getString("LastName")+ " Age: " +rs.getInt("Age"));
}
}
catch(Exception ex)
{
ex.printStackTrace();
}
}

static void deleteDB()
{
try
{
stmt = conn.prepareStatement("DELETE FROM PERSON WHERE Id = ?");
stmt.setInt(1,105);
int nrec  = stmt.executeUpdate();
System.out.println(nrec + "Record deleted");
//while(rs.next())
//{
//System.out.println("ID: " +rs.getInt(1)+ " Name: " +rs.getString("FirstName")+ "" +rs.getString("LastName")+ " Age: " +rs.getInt("Age"));
//}
}
catch(Exception ex)
{
ex.printStackTrace();
}



}

static void updateDB(){
    try
{
stmt = conn.prepareStatement("UPDATE PERSON set ID = 105 where FirstName = 'Mouse' ");
int rs = stmt.executeUpdate();
System.out.println(rs + "Record updated");

//while(rs.next())
//{
//System.out.println("ID: " +rs.getInt(1)+ " Name: " +rs.getString("FirstName")+ "" +rs.getString("LastName")+ " Age: " +rs.getInt("Age"));
//}
}
catch(Exception ex)
{
ex.printStackTrace();
}
}

static void closeDB(){
    try{
        if (conn!= null){
            conn.close();
            System.out.println("db closed");
        }
    }
    catch(SQLException e){
        e.printStackTrace();
    }
}
}