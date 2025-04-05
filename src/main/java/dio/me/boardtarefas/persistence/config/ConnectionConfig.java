package dio.me.boardtarefas.persistence.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public final class ConnectionConfig {

    public static Connection getConnection() throws SQLException {
        var connection = DriverManager.getConnection("jdbc:mysql://localhost/board", "root", "");
        connection.setAutoCommit(false);
        return connection;
    }
}

