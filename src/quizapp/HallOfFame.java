package quizapp;

import java.sql.ResultSet;
import java.sql.Statement;

public class HallOfFame {

     String name;
     int score;
     double time;
     
    public static void feedData(String name, int score, double time) throws Exception {

        DatabaseResult db = new DatabaseResult("halloffame");
        String pass = "INSERT INTO halloffame(`NAME`,`SCORE`,`TIME`) VALUES('" + name + "','" + score + "','" + time + "')";
      
        db.getStatement().executeUpdate(pass);

    }

    public static HallOfFame[] getData() throws Exception {
        DatabaseResult db = new DatabaseResult("halloffame");
        HallOfFame res[] = new HallOfFame[10];
        String sql = "SELECT * FROM halloffame ORDER BY `Score` DESC, `TIME` ASC";
         
        ResultSet result = db.getStatement().executeQuery(sql);
          int i=0;
     while(result.next() && i<10) {
         res[i]= new HallOfFame();
          
         res[i].name=result.getString(1);
         res[i].score=result.getInt(2);
         res[i].time=result.getDouble(3);
          i++;
          
     }
        return res;
    }

    @Override
    public String toString() {
        return "Name : " + name + " Score : " + score + " Time : " + time;
    }
}
