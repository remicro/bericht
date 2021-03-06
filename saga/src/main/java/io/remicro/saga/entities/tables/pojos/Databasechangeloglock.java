/*
 * This file is generated by jOOQ.
 */
package io.remicro.saga.entities.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.remicro.saga.entities.tables.interfaces.IDatabasechangeloglock;

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
public class Databasechangeloglock implements VertxPojo, IDatabasechangeloglock {

    private static final long serialVersionUID = 405138820;

    private Integer   id;
    private Boolean   locked;
    private Timestamp lockgranted;
    private String    lockedby;

    public Databasechangeloglock() {}

    public Databasechangeloglock(IDatabasechangeloglock value) {
        this.id = value.getId();
        this.locked = value.getLocked();
        this.lockgranted = value.getLockgranted();
        this.lockedby = value.getLockedby();
    }

    public Databasechangeloglock(
        Integer   id,
        Boolean   locked,
        Timestamp lockgranted,
        String    lockedby
    ) {
        this.id = id;
        this.locked = locked;
        this.lockgranted = lockgranted;
        this.lockedby = lockedby;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public Databasechangeloglock setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public Boolean getLocked() {
        return this.locked;
    }

    @Override
    public Databasechangeloglock setLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    @Override
    public Timestamp getLockgranted() {
        return this.lockgranted;
    }

    @Override
    public Databasechangeloglock setLockgranted(Timestamp lockgranted) {
        this.lockgranted = lockgranted;
        return this;
    }

    @Override
    public String getLockedby() {
        return this.lockedby;
    }

    @Override
    public Databasechangeloglock setLockedby(String lockedby) {
        this.lockedby = lockedby;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Databasechangeloglock (");

        sb.append(id);
        sb.append(", ").append(locked);
        sb.append(", ").append(lockgranted);
        sb.append(", ").append(lockedby);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IDatabasechangeloglock from) {
        setId(from.getId());
        setLocked(from.getLocked());
        setLockgranted(from.getLockgranted());
        setLockedby(from.getLockedby());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IDatabasechangeloglock> E into(E into) {
        into.from(this);
        return into;
    }

    public Databasechangeloglock(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
