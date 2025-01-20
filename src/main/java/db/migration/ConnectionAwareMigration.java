package db.migration;

import db.exception.MigrationException;
import lombok.extern.slf4j.Slf4j;
import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Slf4j
public abstract class ConnectionAwareMigration extends BaseJavaMigration {

    @Override
    public void migrate(Context context) {
        var connection = context.getConnection();
        setAutoCommit(connection, false);

        try {
            var statement = connection.createStatement();
            execute(statement);
        } catch (Exception e) {
            throw handleError(e);
        } finally {
            setAutoCommit(connection, true);
        }
    }

    private void setAutoCommit(Connection connection, boolean autoCommitEnabled) {
        try {
            connection.setAutoCommit(autoCommitEnabled);
        } catch (SQLException e) {
            throw handleError(e);
        }
    }

    private MigrationException handleError(Exception e) {
        var errorMessage = this.getClass().getSimpleName() + " - " + e.getMessage();

        log.error(errorMessage, e);
        return e instanceof MigrationException migrationException
            ? migrationException
            : new MigrationException(errorMessage, e);
    }

    protected abstract void execute(Statement statement) throws Exception;
}
