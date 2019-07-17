import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {


    public void select(int uid){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = Util.Jdbc();
            String sql = "select * from user where id = ?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1,uid);
            rs = ps.executeQuery();
            System.out.println("username \t"+"password \t" + "nickname \t" +"Email");
            while(rs.next()){
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String nickname = rs.getString("nickname");
                String Email = rs.getString("Email");
                System.out.println(username+"\t\t"+password+"\t\t"+nickname+"\t\t"+Email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
                try {
                    if(rs != null)rs.close();
                    if(ps != null)ps.close();
                    if(connection != null)connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

        }

    }

    public void insert(User user){
        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = Util.Jdbc();
            String sql = "insert into user(username,password,nickname,Email) values(?,?,?,?) ";
            ps = connection.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getNickname());
            ps.setString(4,user.getEmail());
            int i =  ps.executeUpdate();
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(ps != null)ps.close();
                if(connection != null)connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void upDate(User user,int i){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = Util.Jdbc();
            String sql = "update user set id = ?,username = ?,password=?,nickname=?,Email=? where id = ?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1,user.getId());
            ps.setString(2,user.getUsername());
            ps.setString(3,user.getPassword());
            ps.setString(4,user.getNickname());
            ps.setString(5,user.getEmail());
            ps.setInt(6,i);
            int up =  ps.executeUpdate();
            System.out.println(up);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(ps != null)ps.close();
                if(connection != null)connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void Delete(int i){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = Util.Jdbc();
            String sql = "delete from user where id=?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1,i);
            int up =  ps.executeUpdate();
            System.out.println(up);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(ps != null)ps.close();
                if(connection != null)connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
