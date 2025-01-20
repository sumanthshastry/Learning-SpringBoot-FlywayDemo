package db.migration;

import java.sql.Statement;

public class V3__Create_Artist_Table extends ConnectionAwareMigration {

    @Override
    protected void execute(Statement statement) throws Exception {

        statement.executeQuery("""
           CREATE TABLE Artist
           (
               ArtistId INTEGER  NOT NULL,
               Name NVARCHAR(120),
               CONSTRAINT PK_Artist PRIMARY KEY  (ArtistId)
           )
       """);

        statement.executeQuery("INSERT INTO Artist values (1, 'Accept')");
        statement.executeQuery("INSERT INTO Artist values (2, 'Aerosmith')");
        statement.executeQuery("INSERT INTO Artist values (3, 'Apocalyptica')");
    }
}
