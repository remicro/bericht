/*
 * This file is generated by jOOQ.
 */
package io.remicro.saga.entities.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.remicro.saga.entities.tables.interfaces.IScroll;

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
public class Scroll implements VertxPojo, IScroll {

    private static final long serialVersionUID = 12598238;

    private UUID      id;
    private String    title;
    private String    desc;
    private Integer   vision;
    private UUID      sagaId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Scroll() {}

    public Scroll(IScroll value) {
        this.id = value.getId();
        this.title = value.getTitle();
        this.desc = value.getDesc();
        this.vision = value.getVision();
        this.sagaId = value.getSagaId();
        this.createdAt = value.getCreatedAt();
        this.updatedAt = value.getUpdatedAt();
    }

    public Scroll(
        UUID      id,
        String    title,
        String    desc,
        Integer   vision,
        UUID      sagaId,
        Timestamp createdAt,
        Timestamp updatedAt
    ) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.vision = vision;
        this.sagaId = sagaId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Override
    public UUID getId() {
        return this.id;
    }

    @Override
    public Scroll setId(UUID id) {
        this.id = id;
        return this;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public Scroll setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    @Override
    public Scroll setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @Override
    public Integer getVision() {
        return this.vision;
    }

    @Override
    public Scroll setVision(Integer vision) {
        this.vision = vision;
        return this;
    }

    @Override
    public UUID getSagaId() {
        return this.sagaId;
    }

    @Override
    public Scroll setSagaId(UUID sagaId) {
        this.sagaId = sagaId;
        return this;
    }

    @Override
    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public Scroll setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public Scroll setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Scroll (");

        sb.append(id);
        sb.append(", ").append(title);
        sb.append(", ").append(desc);
        sb.append(", ").append(vision);
        sb.append(", ").append(sagaId);
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
    public void from(IScroll from) {
        setId(from.getId());
        setTitle(from.getTitle());
        setDesc(from.getDesc());
        setVision(from.getVision());
        setSagaId(from.getSagaId());
        setCreatedAt(from.getCreatedAt());
        setUpdatedAt(from.getUpdatedAt());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IScroll> E into(E into) {
        into.from(this);
        return into;
    }

    public Scroll(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}