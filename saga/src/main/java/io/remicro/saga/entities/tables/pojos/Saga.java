/*
 * This file is generated by jOOQ.
 */
package io.remicro.saga.entities.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.remicro.saga.entities.tables.interfaces.ISaga;

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
public class Saga implements VertxPojo, ISaga {

    private static final long serialVersionUID = -1877266906;

    private UUID      id;
    private String    title;
    private UUID      ownerId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Saga() {}

    public Saga(ISaga value) {
        this.id = value.getId();
        this.title = value.getTitle();
        this.ownerId = value.getOwnerId();
        this.createdAt = value.getCreatedAt();
        this.updatedAt = value.getUpdatedAt();
    }

    public Saga(
        UUID      id,
        String    title,
        UUID      ownerId,
        Timestamp createdAt,
        Timestamp updatedAt
    ) {
        this.id = id;
        this.title = title;
        this.ownerId = ownerId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Override
    public UUID getId() {
        return this.id;
    }

    @Override
    public Saga setId(UUID id) {
        this.id = id;
        return this;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public Saga setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public UUID getOwnerId() {
        return this.ownerId;
    }

    @Override
    public Saga setOwnerId(UUID ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    @Override
    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public Saga setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public Saga setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Saga (");

        sb.append(id);
        sb.append(", ").append(title);
        sb.append(", ").append(ownerId);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);

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
    public void from(ISaga from) {
        setId(from.getId());
        setTitle(from.getTitle());
        setOwnerId(from.getOwnerId());
        setCreatedAt(from.getCreatedAt());
        setUpdatedAt(from.getUpdatedAt());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISaga> E into(E into) {
        into.from(this);
        return into;
    }

    public Saga(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
