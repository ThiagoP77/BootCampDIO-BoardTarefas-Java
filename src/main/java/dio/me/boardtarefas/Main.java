package dio.me.boardtarefas;

import dio.me.boardtarefas.persistence.migration.MigrationStrategy;
import dio.me.boardtarefas.ui.MainMenu;

import java.sql.SQLException;

import static dio.me.boardtarefas.persistence.config.ConnectionConfig.getConnection;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}
