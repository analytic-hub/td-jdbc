package com.treasure_data.jdbc;

import java.sql.SQLException;

/**
 * Table metadata.
 */
public class JDBCTable {
    private String tableCatalog;
    private String tableName;
    private String type;
    private String comment;

    public JDBCTable(String tableCatalog, String tableName, String type,
            String comment) {
        this.tableCatalog = tableCatalog;
        this.tableName = tableName;
        this.type = type;
        this.comment = comment;
    }

    public String getTableCatalog() {
        return tableCatalog;
    }

    public String getTableName() {
        return tableName;
    }

    public String getType() {
        return type;
    }

    public String getSqlTableType() throws SQLException {
        return JDBCDatabaseMetaData.toJdbcTableType(type);
    }

    public String getComment() {
        return comment;
    }
}
