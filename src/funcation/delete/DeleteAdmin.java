package funcation.delete;

import base.DBService;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Joki on 2017/6/10.
 */
public class DeleteAdmin {

    private DBService mDBMS = new DBService().getInstance();
    private Statement mStatement = null;

    public DeleteAdmin(){
        try {
            mDBMS.connect();
            mStatement = mDBMS.getStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int Delete(String no){
        int resultCode = 0;
        String sql = "delete from administrator where AdminNo='" + no + "';";
        try {
            mStatement.execute(sql);
            mDBMS.close();
        } catch (SQLException e) {
            e.printStackTrace();
            resultCode = -1;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultCode;
    }
}
