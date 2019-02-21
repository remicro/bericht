/*
 * This file is generated by jOOQ.
 */
package io.remicro.saga.entities.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

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
public interface IPerson extends VertxPojo, Serializable {

    /**
     * Setter for <code>public.person.id</code>.
     */
    public IPerson setId(UUID value);

    /**
     * Getter for <code>public.person.id</code>.
     */
    public UUID getId();

    /**
     * Setter for <code>public.person.nick_name</code>.
     */
    public IPerson setNickName(String value);

    /**
     * Getter for <code>public.person.nick_name</code>.
     */
    public String getNickName();

    /**
     * Setter for <code>public.person.user_id</code>.
     */
    public IPerson setUserId(String value);

    /**
     * Getter for <code>public.person.user_id</code>.
     */
    public String getUserId();

    /**
     * Setter for <code>public.person.created_at</code>.
     */
    public IPerson setCreatedAt(Timestamp value);

    /**
     * Getter for <code>public.person.created_at</code>.
     */
    public Timestamp getCreatedAt();

    /**
     * Setter for <code>public.person.updated_at</code>.
     */
    public IPerson setUpdatedAt(Timestamp value);

    /**
     * Getter for <code>public.person.updated_at</code>.
     */
    public Timestamp getUpdatedAt();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IPerson
     */
    public void from(io.remicro.saga.entities.tables.interfaces.IPerson from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IPerson
     */
    public <E extends io.remicro.saga.entities.tables.interfaces.IPerson> E into(E into);

    @Override
    public default IPerson fromJson(io.vertx.core.json.JsonObject json) {
        // Omitting unrecognized type java.util.UUID for column id!
        setNickName(json.getString("nick_name"));
        setUserId(json.getString("user_id"));
        // Omitting unrecognized type java.sql.Timestamp for column created_at!
        // Omitting unrecognized type java.sql.Timestamp for column updated_at!
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        // Omitting unrecognized type java.util.UUID for column id!
        json.put("nick_name",getNickName());
        json.put("user_id",getUserId());
        // Omitting unrecognized type java.sql.Timestamp for column created_at!
        // Omitting unrecognized type java.sql.Timestamp for column updated_at!
        return json;
    }

}
