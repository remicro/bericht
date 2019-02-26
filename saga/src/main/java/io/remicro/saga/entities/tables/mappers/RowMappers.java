package io.remicro.saga.entities.tables.mappers;

import io.reactiverse.pgclient.Row;
import java.util.function.Function;

public class RowMappers {

    private RowMappers(){}

    public static Function<Row,io.remicro.saga.entities.tables.pojos.Databasechangeloglock> getDatabasechangeloglockMapper() {
        return row -> {
            io.remicro.saga.entities.tables.pojos.Databasechangeloglock pojo = new io.remicro.saga.entities.tables.pojos.Databasechangeloglock();
            pojo.setId(row.getInteger("id"));
            pojo.setLocked(row.getBoolean("locked"));
            // Omitting unrecognized type DataType [ t=timestamp without time zone; p=0; s=0; u="pg_catalog"."timestamp"; j=null ] (java.sql.Timestamp) for column lockgranted!
            pojo.setLockedby(row.getString("lockedby"));
            return pojo;
        };
    }

    public static Function<Row,io.remicro.saga.entities.tables.pojos.Person> getPersonMapper() {
        return row -> {
            io.remicro.saga.entities.tables.pojos.Person pojo = new io.remicro.saga.entities.tables.pojos.Person();
            pojo.setId(row.getUUID("id"));
            pojo.setNickName(row.getString("nick_name"));
            pojo.setUserId(row.getString("user_id"));
            // Omitting unrecognized type DataType [ t=timestamp without time zone; p=0; s=0; u="pg_catalog"."timestamp"; j=null ] (java.sql.Timestamp) for column created_at!
            // Omitting unrecognized type DataType [ t=timestamp without time zone; p=0; s=0; u="pg_catalog"."timestamp"; j=null ] (java.sql.Timestamp) for column updated_at!
            return pojo;
        };
    }

    public static Function<Row,io.remicro.saga.entities.tables.pojos.Saga> getSagaMapper() {
        return row -> {
            io.remicro.saga.entities.tables.pojos.Saga pojo = new io.remicro.saga.entities.tables.pojos.Saga();
            pojo.setId(row.getUUID("id"));
            pojo.setTitle(row.getString("title"));
            pojo.setOwnerId(row.getUUID("owner_id"));
            // Omitting unrecognized type DataType [ t=timestamp without time zone; p=0; s=0; u="pg_catalog"."timestamp"; j=null ] (java.sql.Timestamp) for column created_at!
            // Omitting unrecognized type DataType [ t=timestamp without time zone; p=0; s=0; u="pg_catalog"."timestamp"; j=null ] (java.sql.Timestamp) for column updated_at!
            return pojo;
        };
    }

    public static Function<Row,io.remicro.saga.entities.tables.pojos.Screen> getScreenMapper() {
        return row -> {
            io.remicro.saga.entities.tables.pojos.Screen pojo = new io.remicro.saga.entities.tables.pojos.Screen();
            pojo.setId(row.getUUID("id"));
            pojo.setOwnerId(row.getUUID("owner_id"));
            pojo.setOriginal(row.getString("original"));
            pojo.setScaled(row.getString("scaled"));
            // Omitting unrecognized type DataType [ t=timestamp without time zone; p=0; s=0; u="pg_catalog"."timestamp"; j=null ] (java.sql.Timestamp) for column created_at!
            // Omitting unrecognized type DataType [ t=timestamp without time zone; p=0; s=0; u="pg_catalog"."timestamp"; j=null ] (java.sql.Timestamp) for column updated_at!
            return pojo;
        };
    }

    public static Function<Row,io.remicro.saga.entities.tables.pojos.Scroll> getScrollMapper() {
        return row -> {
            io.remicro.saga.entities.tables.pojos.Scroll pojo = new io.remicro.saga.entities.tables.pojos.Scroll();
            pojo.setId(row.getUUID("id"));
            pojo.setTitle(row.getString("title"));
            pojo.setDesc(row.getString("desc"));
            pojo.setVision(row.getInteger("vision"));
            pojo.setSagaId(row.getUUID("saga_id"));
            // Omitting unrecognized type DataType [ t=timestamp without time zone; p=0; s=0; u="pg_catalog"."timestamp"; j=null ] (java.sql.Timestamp) for column created_at!
            // Omitting unrecognized type DataType [ t=timestamp without time zone; p=0; s=0; u="pg_catalog"."timestamp"; j=null ] (java.sql.Timestamp) for column updated_at!
            return pojo;
        };
    }

}
