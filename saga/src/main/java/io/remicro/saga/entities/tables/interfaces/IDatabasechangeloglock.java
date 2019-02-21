/*
 * This file is generated by jOOQ.
 */
package io.remicro.saga.entities.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IDatabasechangeloglock extends VertxPojo, Serializable {

    /**
     * Setter for <code>public.databasechangeloglock.id</code>.
     */
    public IDatabasechangeloglock setId(Integer value);

    /**
     * Getter for <code>public.databasechangeloglock.id</code>.
     */
    public Integer getId();

    /**
     * Setter for <code>public.databasechangeloglock.locked</code>.
     */
    public IDatabasechangeloglock setLocked(Boolean value);

    /**
     * Getter for <code>public.databasechangeloglock.locked</code>.
     */
    public Boolean getLocked();

    /**
     * Setter for <code>public.databasechangeloglock.lockgranted</code>.
     */
    public IDatabasechangeloglock setLockgranted(Timestamp value);

    /**
     * Getter for <code>public.databasechangeloglock.lockgranted</code>.
     */
    public Timestamp getLockgranted();

    /**
     * Setter for <code>public.databasechangeloglock.lockedby</code>.
     */
    public IDatabasechangeloglock setLockedby(String value);

    /**
     * Getter for <code>public.databasechangeloglock.lockedby</code>.
     */
    public String getLockedby();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IDatabasechangeloglock
     */
    public void from(io.remicro.saga.entities.tables.interfaces.IDatabasechangeloglock from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IDatabasechangeloglock
     */
    public <E extends io.remicro.saga.entities.tables.interfaces.IDatabasechangeloglock> E into(E into);

    @Override
    public default IDatabasechangeloglock fromJson(io.vertx.core.json.JsonObject json) {
        setId(json.getInteger("id"));
        setLocked(json.getBoolean("locked"));
        // Omitting unrecognized type java.sql.Timestamp for column lockgranted!
        setLockedby(json.getString("lockedby"));
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("locked",getLocked());
        // Omitting unrecognized type java.sql.Timestamp for column lockgranted!
        json.put("lockedby",getLockedby());
        return json;
    }

}
