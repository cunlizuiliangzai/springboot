import java.sql.*;

/**
 * @author ex_111806190
 * @since 2020-10-21 8:54
 */
public class JdbcTest {


    /**
     * 1    preparedStatement 和  statement的区别
     *PreparedStatement 接口代表预编译的语句，可以减少编译错误并增加sql的安全性（sql注入攻击）
     *preparedStatement 语句是带参数的，避免字符串拼接sql语句的麻烦和不安全
     * 当批量处理sql或者频繁执行相同的查询时，数据库会将preparedStatement编译优化后的sql语句缓存，性能更好（不用再次编译和生成执行计划）
     *
     * 2    为了提高读取数据的性能    resultset。setFetchSize() 指定抓取的记录数
     *      为了提高更新的性能       prepareadStatement  批量处理
     *
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //加载驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");

        //创建连接
        Connection connection = null;
        ResultSet result = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "root", "root");
            //设置事务未false
            connection.setAutoCommit(false);
            //创建语句
            preparedStatement = connection.prepareStatement("select * from emp where sal between ? and ?");
            /*Statement statement = connection.createStatement();
            statement.execute("select * from emp where sal between 1000 and 2000")*/
            //参数赋值
            preparedStatement.setInt(1, 1000);
            preparedStatement.setInt(2, 2000);
            //执行语句
            result = preparedStatement.executeQuery();
            //获取结果
            while (result.next()) {
                String string = result.getString("ename");
                int sal = result.getInt("sal");
            }
            //事务提交
            connection.commit();
        } catch (SQLException throwables) {

            connection.rollback();
            throwables.printStackTrace();

        } finally {

            try {
                if (result != null) {
                    result.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


    }
}
